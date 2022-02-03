package LabStreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ClosingAFileStream {
    public static void main(String[] args) {
        try (InputStream in = new FileInputStream
                ("C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt")) {
            int oneByte = in.read();
            while (oneByte >= 0) {
                System.out.print((char) oneByte);
                oneByte = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
