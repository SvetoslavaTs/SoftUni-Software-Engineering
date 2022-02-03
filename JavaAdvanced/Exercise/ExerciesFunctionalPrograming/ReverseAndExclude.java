package ExerciesFunctionalPrograming;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

//        Predicate<Integer> isDivisible = num -> num % n == 0;
//        Collections.reverse(input);
//        input.removeIf(isDivisible);
//        for (Integer s : input)
//            System.out.print(s + " ");

        //Втори начин да се реши:
        Collections.reverse(input);
        input.stream().filter(e -> e % n != 0).forEach(e -> System.out.print(e + " "));

//        Трети начин да се реши:
//        Predicate<Integer> isDivisible = num -> num % n != 0;
//        input.stream().filter(e -> isDivisible.test(e)).forEach(e-> System.out.print(e + " "));

    }
}
