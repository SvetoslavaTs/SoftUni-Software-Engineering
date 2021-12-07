package ListLab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class sumAdjacentEqualNumbers1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputsAsStringArray = input.split(" ");
        List<Double> numbers = new ArrayList<>();
        for (String s : inputsAsStringArray) {
            double currentNum = Double.parseDouble(s);
            numbers.add(currentNum);
        }
        boolean searchAgain = true;
        while (searchAgain) {
            searchAgain = false;
            for (int i = 0; i < numbers.size() - 1; i++) {
                if (numbers.get(i).equals(numbers.get(i + 1))) {
                    numbers.set(i, numbers.get(i) + numbers.get(i + 1));
                    numbers.remove(i + 1);
                    searchAgain = true;
                }
            }
        }

        String output = joinElementsByDelimiter(numbers, " ");
        System.out.println(output);
    }

    private static String joinElementsByDelimiter(List<Double> items, String delimiter) {
        StringBuilder output = new StringBuilder();
        for (Double item : items)
            output.append(new DecimalFormat("0.#").format(item)).append(delimiter);
        return output.toString();
    }

}
