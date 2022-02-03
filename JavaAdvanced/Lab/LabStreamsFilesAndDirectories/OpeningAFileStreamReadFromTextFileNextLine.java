package LabStreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OpeningAFileStreamReadFromTextFileNextLine {
    public static void main(String[] args) {
        try {

            FileInputStream inputStream = new FileInputStream
                    ("C:\\Users\\User\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
            Scanner scanner = new Scanner(inputStream);
            String output = scanner.nextLine();
            System.out.println(output);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }


    }
}
