void main() {

    // How to read a file using Java (3 popular options)

    String fileLocation = "out\\FileReaderWriter\\";

    // 'BufferedReader' + FileReader - Best for reading text files line-by-line
    try(BufferedReader reader = new BufferedReader(new FileReader(fileLocation + "filewriter.txt"))) {
        String line;
        while((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    } catch(FileNotFoundException e){
        IO.println(e);
        IO.println("Error: File location could not be located.");
    } catch(IOException e){
        IO.println(e);
        IO.println("Error: File could not be read.");
    }

    // FileInputStream - Best for binary files (e.g., images, audio files)
    try (FileInputStream reader = new FileInputStream(fileLocation + "fileoutputstream.bin")) {
        byte[] data = reader.readAllBytes();
        String text = new String(data, StandardCharsets.UTF_8);
        IO.println(text);
    } catch(FileNotFoundException e){
        IO.println(e);
        IO.println("Error: File location could not be located.");
    } catch(IOException e){
        IO.println(e);
        IO.println("Error: File could not be read.");
    }

    // RandomAccessFile - Best for read/write specific portions of a large file
    try (RandomAccessFile reader = new RandomAccessFile(fileLocation + "fileoutputstream.bin", "r")) {
        // Read first 10 bytes
        byte[] firstTen = new byte[17];
        reader.read(firstTen);
        IO.println("First 10 bytes: " + new String(firstTen));

        // Jump to byte 20
        reader.seek(44);
        String line = reader.readLine();
        IO.println("Line starting at byte 18: " + line);

        // Go to end and read last byte
        long length = reader.length();
        reader.seek(length - 1);
        int lastByte = reader.read();
        IO.println("Last byte: " + (char) lastByte);
    } catch(FileNotFoundException e){
        IO.println(e);
        IO.println("Error: File location could not be located.");
    } catch(IOException e){
        IO.println(e);
        IO.println("Error: File could not be read.");
    }
}