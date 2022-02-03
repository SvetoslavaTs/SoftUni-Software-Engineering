package LabStreamsFilesAndDirectories;

import java.io.File;
import java.io.IOException;

public class ListFiles {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\Svetoslava\\SoftUni\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        File[] files = file.listFiles();
        for (File file1 : files) {
            if (!file1.isDirectory()) {
                System.out.printf("%s [%d]%n", file1.getName(), file1.length());
            }
        }

    }
}
