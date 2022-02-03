package ExercisesStreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyAPicture {
    public static void main(String[] args) {
        String inPath = "src/ExercisesStreamsFilesAndDirectories/resources/picture.jpg";
        String outPath = "src/ExercisesStreamsFilesAndDirectories/resources/copy-picture.jpg";

        try {
            FileInputStream inputStream = new FileInputStream(inPath);
            FileOutputStream outputStream = new FileOutputStream(outPath);

            int oneByte = inputStream.read();
            while (oneByte != -1) {
                outputStream.write(oneByte);
                oneByte = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
