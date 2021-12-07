package ListLab;

import java.util.*;
import java.util.stream.Collectors;

public class removeNegativesAndReverse1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> nonNegativeNums = new ArrayList<>();

        for (Integer integer : input) {
            if (integer >= 0) {
                nonNegativeNums.add(integer);
            }
        }
        if (nonNegativeNums.isEmpty()) {
            System.out.println("empty");
        } else {
            Collections.reverse(nonNegativeNums);
            for (Integer number : nonNegativeNums) {
                System.out.print(number + " ");
            }


        }
    }
}
