package ListLab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class mergingLists2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> mergedList = new ArrayList<>();

        int indexFirst = 0;
        int indexSecond = 0;
        while (indexFirst < firstList.size() || indexSecond < secondList.size()) {
            if (indexFirst < firstList.size()) {
                mergedList.add(firstList.get(indexFirst));
                indexFirst++;
            }
            if (indexSecond < secondList.size()) {
                mergedList.add(secondList.get(indexSecond));
                indexSecond++;
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

