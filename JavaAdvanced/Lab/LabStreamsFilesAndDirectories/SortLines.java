package LabStreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) throws IOException {
//        String fileName = "input.txt";
//
//        List<String> lines = Files.readAllLines(Paths.get(fileName))
//                .stream()
//                .sorted(String::compareTo)
//                .collect(Collectors.toList());
//        Files.write(Paths.get("out.txt"), lines);

        Path path = Paths.get("input.txt");
        Path output = Paths.get("out.txt");

        try {
            List<String> lines = Files.readAllLines(path);
            lines = lines.stream().filter(l ->
                    !l.isBlank()).collect(Collectors.toList());
            Collections.sort(lines);
            Files.write(output, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
