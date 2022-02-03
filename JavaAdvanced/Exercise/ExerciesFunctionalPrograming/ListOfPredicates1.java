package ExerciesFunctionalPrograming;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfPredicates1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Set<Integer> divisibleNums = Arrays.stream(scanner.nextLine()
                .split("\\s+")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toCollection(HashSet::new));

        Predicate<Integer> isDivisible = num -> {
            for (Integer divider : divisibleNums) {
                if (num % divider != 0) {
                    return false;
                }
            }
            return true;
        };

        for (int i = 1; i <= n; i++) {
            if (isDivisible.test(i)) {
                System.out.print(i + " ");
            }
        }


    }
}

