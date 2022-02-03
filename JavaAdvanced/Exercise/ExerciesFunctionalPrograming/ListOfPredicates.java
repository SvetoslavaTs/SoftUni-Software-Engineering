package ExerciesFunctionalPrograming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }
        List<Integer> divisibleNums = Arrays.stream(scanner.nextLine()
                .split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Predicate<Integer> predicate = num -> {
            return divisibleNums.stream().allMatch(divisibleNum -> num % divisibleNum == 0);
        };

        nums.stream().filter(e -> predicate.test(e)).forEach(e -> System.out.print(e + " "));


    }
}

