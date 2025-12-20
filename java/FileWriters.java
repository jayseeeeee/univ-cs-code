void main() {

    // Common Options in Writing Files

    // Initialize all file information for better organization
    String fileLocation = "out\\FileReaderWriter\\";
    String fileName = "filewriter.txt";
    String textContent = """
            "Running Up that Hill" — Kate Bush
            
            [Verse 1]
            It doesn't hurt me (Yeah, yeah, yo)
            Do you wanna feel how it feels? (Yeah, yeah, yo)
            Do you wanna know, know that it doesn't hurt me? (Yeah, yeah, yo)
            Do you wanna hear about the deal that I'm makin'? (Yeah, yeah, yo)
            
            [Pre-Chorus]
            You
            It's you and me
            
            [Chorus]
            And if I only could
            I'd make a deal with God
            And I'd get him to swap our places
            Be runnin' up that road
            Be runnin' up that hill
            Be runnin' up that buildin'
            Say, if I only could, ooh-ooh
            """;

    // Create folder if there is none in file location
    File folder = new File(fileLocation);
    folder.mkdir();

    // FileWriter - Good for small or medium-sized text files by writing directly to disk (slower)
    // Directly initialize 'FileWriter' object with 'try-with-resources' to automatically close after use
    try(FileWriter writer = new FileWriter(fileLocation + fileName)) {
        writer.write(textContent + "\n"); // Must manually line-break
        writer.write("""
                [Verse 2]
                You don't wanna hurt me (Yeah, yeah, yo)
                But see how deep the bullet lies (Yeah, yeah, yo)
                Unaware, I'm tearin' you asunder (Yeah, yeah, yo)
                Oh, there is thunder in our hearts (Yeah, yeah, yo)
                Is there so much hate for the ones we love? (Yeah, yeah, yo)
                Oh, tell me, we both matter, don't we? (Yeah, yeah, yo)
                
                """);
        IO.println("File has been successfully written!");
    } catch(FileNotFoundException e){
        IO.println(e);
        IO.println("Error: File location could not be located.");
    } catch(IOException e){
        IO.println(e);
        IO.println("Error: File could not be written.");
    }

    // BufferedWriter -  Better performance for frequent writes and large text by storing in memory before writing to disk
    // File information can be written directly to FileWriter
    try(BufferedWriter writer = new BufferedWriter(new FileWriter("out\\FileReaderWriter\\bufferedwriter.txt"))) { // Needs to wrap a reader object
        // Enables the wrapped reader to automatically move to new line
        writer.write("Apt by Rose & Bruno Mars");
        for (int i = 0; i < 4; i++) {
            writer.write("""
                    \n"Apateu, apateu"
                    "Apateu, apateu"
                    "Apateu, apateu"
                    "Uh, uh-huh, uh-huh
                    """);
            writer.newLine();
        }
        IO.println("File has been successfully written!");
    } catch(FileNotFoundException e){
        IO.println(e);
        IO.println("Error: File location could not be located.");
    } catch(IOException e){
        IO.println(e);
        IO.println("Error: File could not be written.");
    }

    // PrintWriter - Best for structured data, like reports or logs
    try(PrintWriter writer = new PrintWriter(fileLocation + "printwriter.log")) {
        // PrintWriter supports 'console-like' methods
        writer.println("⚔️ Stranger Battle: Eleven vs Vecna");
        writer.println("🎮 Battle Arena: The Upside Down Stadium");
        writer.printf("""
                \n%s uses Fear Pulse!
                %s’s attack drops to [%d] AT. The crowd gasps!
                """, "Vecna", "Eleven", 67);
        writer.printf("""
                \n%s counters with Mind Blast!
                It’s super effective! %s drops to [1] HP and reels back, stunned!
                """, "Eleven", "Vecna", 99);
        IO.println("File has been successfully written!");
    } catch(FileNotFoundException e){
        IO.println(e);
        IO.println("Error: File location could not be located.");
    } catch(IOException e){
        IO.println(e);
        IO.println("Error: File could not be written.");
    }

    // FileOutputStream = Best for binary files (images, audios, videos, documents)
    try(FileOutputStream writer = new FileOutputStream(fileLocation + "fileoutputstream.bin")) {
        String text = """
                The week is long.
                The silver cat feeds when blue meets yellow in the west.
                A trip to China sounds nice if you tread lightly.
                """;
        byte[] data = text.getBytes(); // convert to bytes
        writer.write(data);
        IO.println("File has been successfully written!");
    } catch(FileNotFoundException e){
        IO.println(e);
        IO.println("Error: File location could not be located.");
    } catch(IOException e){
        IO.println(e);
        IO.println("Error: File could not be written.");
    }
}