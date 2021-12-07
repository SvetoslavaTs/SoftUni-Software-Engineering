package ListLab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class mergingLists1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> mergedList = new ArrayList<>();

        for (int i = 0; i < Math.min(firstList.size(), secondList.size()); i++) {
            mergedList.add(firstList.get(i));
            mergedList.add(secondList.get(i));
        }
        if (firstList.size() > secondList.size()) {
            mergedList.addAll(GetRemainingElements(firstList, secondList));
        } else {
            mergedList.addAll(GetRemainingElements(secondList, firstList));
        }
        String output = joinElementsByDelimiter(mergedList, " ");
        System.out.println(output);
    }

    private static List<Integer> GetRemainingElements(List<Integer> longestList, List<Integer> shorterList) {
        List<Integer> remainingElements = new ArrayList<>();
        for (int i = shorterList.size(); i < longestList.size(); i++) {
            remainingElements.add(longestList.get(i));
        }
        return remainingElements;
    }

    private static String joinElementsByDelimiter(List<Integer> items, String delimiter) {
        String output = "";
        for (Integer item : items)
            output += (new DecimalFormat("0.#").format(item) + delimiter);
        return output;

    }
}

