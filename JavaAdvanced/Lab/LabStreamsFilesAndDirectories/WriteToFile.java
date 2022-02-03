package LabStreamsFilesAndDirectories;


import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        String path = "input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("out.txt");
        PrintWriter writer = new PrintWriter(outputStream);
        Set<Character> punctuation = new HashSet<>();
        punctuation.add(',');
        punctuation.add('?');
        punctuation.add('!');
        punctuation.add('.');


        int oneByte = inputStream.read();

        while (oneByte >= 0) {
            char symbol = (char) oneByte;
            if (!punctuation.contains(symbol)) {
                //може да се ползва директно outputStream
                // за записване на текста във файла out:
                outputStream.write(symbol);
                // или PrintWriter:
                // writer.print(symbol);
            }

            oneByte = inputStream.read();
        }


        writer.close();
        inputStream.close();


    }
}
