package ExercisesStreamsFilesAndDirectories;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CountCharacterTypes {
    public static void main(String[] args) {
        Path input = Paths.get
                ("E:\\Svetoslava\\SoftUni\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        Path output = Paths.get
                ("E:\\Svetoslava\\SoftUni\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt");

        try {
            List<String> list = Files.readAllLines(input);
            PrintWriter writer = new PrintWriter(new FileOutputStream(String.valueOf(output)));
            Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
            Set<Character> punctuation = Set.of('?', '.', '!', ',');

            long vowelsCount = 0;
            long punctuationCount = 0;
            long consonants = 0;

            for (String s : list) {
                for (int i = 0; i < s.length(); i++) {
                    char current = s.charAt(i);
                    if (vowels.contains(current)) {
                        vowelsCount++;
                    } else if (punctuation.contains(current)) {
                        punctuationCount++;
                    } else if (current == 32) {
                        continue;
                    } else {
                        consonants++;
                    }
                }

            }


            writer.flush();
            writer.printf("Vowels: %d%nConsonants: %d%nPunctuation: %d", vowelsCount, consonants, punctuationCount);
            writer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
