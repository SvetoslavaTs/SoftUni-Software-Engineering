package ExercisesStreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes {
    public static void main(String[] args) {
        String path = "E:\\Svetoslava\\SoftUni\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            long sum = 0;
            while (line != null) {
                for (int i = 0; i < line.length(); i++) {
                    sum += (long) line.charAt(i);
                }
                line = reader.readLine();
            }
            System.out.println(sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
