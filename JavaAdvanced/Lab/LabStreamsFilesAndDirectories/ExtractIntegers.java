package LabStreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "input.txt";

        //Scanner reader = new Scanner(new FileInputStream(path));
        Scanner scanner = new Scanner(new FileInputStream(path));
        PrintWriter out = new PrintWriter(new FileOutputStream("out.txt"));

        while (scanner.hasNext()) {
            if (scanner.hasNextInt())
                out.println(scanner.nextInt());

            scanner.next();
        }
        out.close();


    }
}
