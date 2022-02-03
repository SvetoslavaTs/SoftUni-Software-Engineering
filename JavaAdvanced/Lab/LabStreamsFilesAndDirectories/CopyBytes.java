package LabStreamsFilesAndDirectories;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        String path = "input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("out.txt");
        PrintWriter writer = new PrintWriter(outputStream);


        int oneByte = 0;

        while ((oneByte = inputStream.read()) >= 0) {
            if (oneByte == 10 || oneByte == 32) {
                outputStream.write(oneByte);
            } else {
                String digits = String.valueOf(oneByte);
                for (int i = 0; i < digits.length(); i++)
                    outputStream.write(digits.charAt(i));
            }

        }


        writer.close();
        inputStream.close();


    }
}
