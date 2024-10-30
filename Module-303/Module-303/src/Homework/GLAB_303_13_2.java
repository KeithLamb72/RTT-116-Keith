package Homework;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/**
 * GLAB_303_13_2 - Demonstrating Java NIO (New I/O) concepts.
 * This class includes two examples:
 * 1. Reading from multiple source files and writing to a single output file using NIO.
 * 2. Efficient data transfer between channels using transferTo and transferFrom methods.
 */
public class GLAB_303_13_2 {

    // Example 1: Combining two source files into one output file
    public static void combineFilesWithNIO() throws IOException {
        String[] inputFiles = {
                "C:/Downloads/file1.txt",  // Adjust the path as per your system
                "C:/Downloads/file2.txt"
        };
        String outputFile = "C:/Downloads/nioOutput.txt";  // Adjust the output path as per your system

        FileOutputStream fos = new FileOutputStream(outputFile);
        FileChannel targetChannel = fos.getChannel();

        for (String inputFile : inputFiles) {
            FileInputStream fis = new FileInputStream(inputFile);
            FileChannel inputChannel = fis.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate((int) inputChannel.size());

            while (inputChannel.read(buffer) > 0) {
                buffer.flip();  // Prepare buffer for reading // Flip Stack
                while (buffer.hasRemaining()) {
                    targetChannel.write(buffer);  // Write buffer content to the target channel
                }
                buffer.clear();  // Prepare buffer for the next read
            }
            inputChannel.close();
            fis.close();
        }
        targetChannel.close();
        fos.close();
        System.out.println("File combination complete. Output written to: " + outputFile);
    }

    // Example 2: Transferring data between channels using transferTo and transferFrom methods
    public static void transferFilesWithNIO() throws IOException {
        String[] inputFiles = {
                "C:/Downloads/file1.txt",  // Adjust the path as per your system
                "C:/Downloads/file2.txt"
        };
        String outputFile = "C:/Downloads/OutputExampleTwo.txt";  // Adjust the output path as per your system

        FileOutputStream fos = new FileOutputStream(outputFile);
        WritableByteChannel targetChannel = fos.getChannel();

        for (String inputFile : inputFiles) {
            FileInputStream fis = new FileInputStream(inputFile);
            FileChannel inputChannel = fis.getChannel();

            // Transfer data from the input channel to the target channel
            inputChannel.transferTo(0, inputChannel.size(), targetChannel);

            inputChannel.close();
            fis.close();
        }
        targetChannel.close();
        fos.close();
        System.out.println("Data transfer complete. Output written to: " + outputFile);
    }

    // Main method to execute both examples
    public static void main(String[] args) {
        try {
            System.out.println("Running Example 1: Combining Files with NIO...");
            combineFilesWithNIO();

            System.out.println("\nRunning Example 2: Transferring Files with NIO...");
            transferFilesWithNIO();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

