package LabStreamsFilesAndDirectories;

import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        String path = "input.txt";
        BufferedReader reader = new BufferedReader(new FileReader(path));
        BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"));

        String line = reader.readLine();
        int counter = 1;
        while (line != null) {
            if (counter % 3 == 0) {
                writer.write(line);
                writer.newLine();
            }
            line = reader.readLine();
            counter++;
        }
        writer.close();

        //Може да се чете и записват файлове и с Files, по-малко код и същата бързина
        //защото Files използва BufferedReader/Writer. Когато чете по този начин линии взима
        // и знака за нов ред от текстовия файл и няма нужда да се добавя в кода нов ред

//        String fileName = "input.txt";
//        List<String> strings = Files.readAllLines(Path.of(fileName));
//        List<String> lines = new ArrayList<>();
//
//        for (int i = 2; i < strings.size() ; i+=3) {
//            lines.add(strings.get(i));
//        }
//        Files.write(Path.of("out.txt"), lines, StandardCharsets.UTF_8);
    }
}
