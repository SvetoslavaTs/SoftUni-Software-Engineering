package ExerciesFunctionalPrograming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split("\\s+");
        Predicate<String> predicate = s -> s.length() <= n;

        Arrays.stream(input).filter(s -> predicate.test(s)).forEach(s -> System.out.println(s));


    }
}
