package ExercisesStreamsFilesAndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) {
        Path inputWords = Paths.get
                ("E:\\Svetoslava\\SoftUni\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt");
        Path inputText = Paths.get("E:\\Svetoslava\\SoftUni\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt");
        Path output = Paths.get
                ("E:\\Svetoslava\\SoftUni\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\result.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader
                    (String.valueOf(inputWords)));
            BufferedReader readerText = new BufferedReader(new FileReader(String.valueOf(inputText)));
            PrintWriter writer = new PrintWriter(new FileWriter(String.valueOf(output)));


            Map<String, Integer> info = new LinkedHashMap<>();
            List<String> wordsAsList = Arrays.stream(reader.readLine().split("\\s+")).collect(Collectors.toList());
            info.putIfAbsent(wordsAsList.get(0), 0);
            info.putIfAbsent(wordsAsList.get(1), 0);
            info.putIfAbsent(wordsAsList.get(2), 0);

            List<String> textAsList = Arrays.stream(readerText.readLine().split("\\s+")).collect(Collectors.toList());

            for (String s : textAsList) {
                if (s.toLowerCase().equals(wordsAsList.get(0).toLowerCase())) {
                    info.put(wordsAsList.get(0), info.get(wordsAsList.get(0)) + 1);
                } else if (s.toLowerCase().equals(wordsAsList.get(1).toLowerCase())) {
                    info.put(wordsAsList.get(1), info.get(wordsAsList.get(1)) + 1);
                } else if (s.equals(wordsAsList.get(2))) {
                    info.put(wordsAsList.get(2), info.get(wordsAsList.get(2)) + 1);
                }
            }
            writer.flush();
            info.entrySet().stream().sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                    .forEach(entry -> writer.println(String.format("%s - %d", entry.getKey(), entry.getValue())));
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
