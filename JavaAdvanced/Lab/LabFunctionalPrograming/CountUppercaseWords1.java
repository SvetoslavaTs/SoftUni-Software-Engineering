package LabFunctionalPrograming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> checkerUpperCase = word -> word != null && !word.isEmpty() && Character.isUpperCase(word.charAt(0));

        List<String> upperCaseWords = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(checkerUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperCaseWords.size());
        System.out.println(upperCaseWords.stream().collect(Collectors.joining(System.lineSeparator())));


    }
}
