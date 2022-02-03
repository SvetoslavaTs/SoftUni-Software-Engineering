package LabStreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.IOException;

public class OpeningAFileStreamOneByte {
    public static void main(String[] args) {
        String path = "C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        try {
            FileInputStream fileStream =
                    new FileInputStream(path);

            int oneByte = fileStream.read();
            while (oneByte >= 0) {
                System.out.printf("%s ", Integer.toBinaryString(oneByte));
                oneByte = fileStream.read();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}