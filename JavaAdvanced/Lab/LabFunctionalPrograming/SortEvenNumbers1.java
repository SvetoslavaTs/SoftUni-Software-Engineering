package LabFunctionalPrograming;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt).collect(Collectors.toList());

        numbers.removeIf(n -> n % 2 != 0);
        System.out.println(numbers.toString().replaceAll("[\\[\\]]", ""));
        numbers.sort(Integer::compareTo);
        System.out.println(numbers.toString().replaceAll("[\\[\\]]", ""));

    }


}
