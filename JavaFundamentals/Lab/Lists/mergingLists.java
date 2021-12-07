package ListLab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class mergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> mergedList = new ArrayList<>();
        int index = 0;
        index = Math.min(firstList.size(), secondList.size());
        for (int i = 0; i < index; i++) {
            mergedList.add(firstList.get(i));
            mergedList.add(secondList.get(i));
        }
        if (firstList.size() > secondList.size()) {
            for (int i = index; i < firstList.size(); i++) {
                mergedList.add(firstList.get(i));
            }
        } else {
            for (int i = index; i < secondList.size(); i++) {
                mergedList.add(secondList.get(i));
            }
        }
        String output = joinElementsByDelimiter(mergedList, " ");
        System.out.println(output);
    }

    private static String joinElementsByDelimiter(List<Integer> items, String delimiter) {
        String output = "";
        for (Integer item : items)
            output += (new DecimalFormat("0.#").format(item) + delimiter);
        return output;
    }
}
