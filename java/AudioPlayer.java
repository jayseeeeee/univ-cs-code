import javax.sound.sampled.*;

void main() {

    // Audio Control in Java (.wav .au .aiff)

    String audioPath = "out\\FileReaderWriter\\";
    String audioName = "Running Up That Hill (A Deal With God).wav";

    // Access audio file through 'File' object
    File audio = new File(audioPath + audioName);

    try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(audio)) {
        Clip clip = AudioSystem.getClip(); // Clip is the audio player from 'AudioSystem'
        clip.open(audioStream); // Loads the audio file
        
        while (true) {
            String choice = IO.readln("""
                \nWelcome to Max's Walkman!
                S - Start
                P - Pause
                R - Reset
                Press any keys to exit instead!
                Enter your choice:\s""").toUpperCase();
            switch (choice) {
                case "S" -> clip.start();
                case "P" -> clip.stop();
                case "R" -> clip.setFramePosition(0);
                default -> {
                    clip.close();
                    return;
                }
            }
        }
    } catch (FileNotFoundException e) {
        IO.println(e);
        IO.println("Error: Audio file could not be located.");
    } catch (UnsupportedAudioFileException e) {
        IO.println(e);
        IO.println("Error: Audio file format is not supported.");
    } catch (LineUnavailableException e) {
        IO.println(e);
        IO.println("Error: Audio is currently unavailable or being used by another resource.");
    } catch (IOException e) {
        IO.println(e);
        IO.println("Error: Audio file could not be read.");
    }
}