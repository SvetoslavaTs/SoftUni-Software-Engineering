package ListLab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class mergingLists3MergeAndSort {
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
            if (indexFirst == firstList.size() || indexSecond == secondList.size()) {
                break;
            }
            if (firstList.get(indexFirst) < secondList.get(indexSecond)) {
                mergedList.add(firstList.get(indexFirst));
                indexFirst++;
            } else if (secondList.get(indexSecond) < firstList.get(indexFirst)) {
                mergedList.add(secondList.get(indexSecond));
                indexSecond++;
            }
        }
        for (int i = indexFirst; i <= firstList.size() - 1; i++) {
            if (firstList.get(i) < firstList.get(i + 1)) {
                mergedList.add(firstList.get(i));
            } else {
                mergedList.add(firstList.get(i + 1));
                firstList.set(i + 1, firstList.get(i));
            }
        }
        for (int i = indexSecond; i <= secondList.size() - 1; i++) {
            if (indexSecond == secondList.size() - 1) {
                mergedList.add(secondList.get(i));
            } else if ((secondList.get(i) > secondList.get(i + 1))) {
                mergedList.add(secondList.get(i + 1));
                secondList.set(i + 1, secondList.get(i));
            } else if (secondList.get(i) < secondList.get(i + 1)) {
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



