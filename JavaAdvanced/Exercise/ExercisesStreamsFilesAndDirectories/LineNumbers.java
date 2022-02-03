package ExercisesStreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LineNumbers {
    public static void main(String[] args) {
        String input = "E:\\Svetoslava\\SoftUni\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        String output = "E:\\Svetoslava\\SoftUni\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(input));
            PrintWriter writer = new PrintWriter(output);
            Set<StringBuilder> numberedText = new LinkedHashSet<>();
            String line = reader.readLine();
            int counter = 1;
            while (line != null) {
                StringBuilder currentLine = new StringBuilder();
                currentLine.append(counter).append(".").append(" ").append(line);
                counter++;
                numberedText.add(currentLine);
                line = reader.readLine();
            }

            writer.flush();
            for (StringBuilder stringBuilder : numberedText) {
                writer.println(stringBuilder);
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
