package LabStreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        String path = "input.txt";
        FileInputStream inputStream = new FileInputStream(path);

        int oneByte = inputStream.read();
        while (oneByte >= 0) {
            System.out.printf("%s ", Integer.toBinaryString(oneByte));
            oneByte = inputStream.read();
        }
        inputStream.close();
    }
}
