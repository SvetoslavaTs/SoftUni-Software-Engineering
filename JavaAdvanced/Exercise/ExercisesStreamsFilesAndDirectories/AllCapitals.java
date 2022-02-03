package ExercisesStreamsFilesAndDirectories;

import java.beans.beancontext.BeanContext;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AllCapitals {
    public static void main(String[] args) {
        String inputPath = "E:\\Svetoslava\\SoftUni\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String outputPath = "E:\\Svetoslava\\SoftUni\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

        try {
            BufferedReader reader = new BufferedReader(Files.newBufferedReader(Paths.get(inputPath)));
            PrintWriter writer = new PrintWriter(new FileOutputStream(outputPath));

            String line = reader.readLine();
            while (line != null) {
                String upperLine = line.toUpperCase();
                writer.println(upperLine);
                line = reader.readLine();
            }
            writer.close();
            writer.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
