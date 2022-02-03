package ExercisesStreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeTwoFiles {
    public static void main(String[] args) {
        String inputOne = "E:\\Svetoslava\\SoftUni\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String inputTwo = "E:\\Svetoslava\\SoftUni\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";

        try {
            BufferedReader readerOne = new BufferedReader(new FileReader(inputOne));
            BufferedReader readerTwo = new BufferedReader(new FileReader(inputTwo));
            PrintWriter writer = new PrintWriter
                    ("E:\\Svetoslava\\SoftUni\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\outputThree.txt");

            String line = readerOne.readLine();
            while (line != null) {
                writer.println(line);
                line = readerOne.readLine();
            }

            line = readerTwo.readLine();
            while (line != null) {
                writer.println(line);
                line = readerTwo.readLine();
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
