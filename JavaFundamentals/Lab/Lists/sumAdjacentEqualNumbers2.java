package ListLab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sumAdjacentEqualNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputsAsStringArray = input.split(" ");
        List<Double> numbers = new ArrayList<>();
        for (String s : inputsAsStringArray) {
            double currentNum = Double.parseDouble(s);
            numbers.add(currentNum);
        }
        int i = 0;
        while (i < numbers.size() - 1) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                numbers.set(i, numbers.get(i) + numbers.get(i + 1));
                numbers.remove(i + 1);
                i = 0;
            } else {
                i++;
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
