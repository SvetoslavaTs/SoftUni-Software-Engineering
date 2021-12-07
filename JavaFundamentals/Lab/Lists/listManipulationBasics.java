package ListLab;

import javax.sound.sampled.DataLine;
import javax.sound.sampled.Line;
import java.util.*;
import java.util.stream.Collectors;

public class listManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }
            String[] tokens = line.split(" ");
            switch (tokens[0]) {
                case "Add": {
                    int currentNum = Integer.parseInt(tokens[1]);
                    input.add(currentNum);
                    break;
                }
                case "Remove": {
                    int currentNum = Integer.parseInt(tokens[1]);
                    input.remove(Integer.valueOf(currentNum));
                    break;
                }
                case "RemoveAt": {
                    int currentNum = Integer.parseInt(tokens[1]);
                    input.remove(currentNum);
                    break;
                }
                case "Insert": {
                    int currentNum = Integer.parseInt(tokens[1]);
                    int currentIndex = Integer.parseInt(tokens[2]);
                    input.add(currentIndex, currentNum);
                    break;
                }
            }
        }
        System.out.println(input.toString().replaceAll("[\\[\\],]", ""));

    }
}
