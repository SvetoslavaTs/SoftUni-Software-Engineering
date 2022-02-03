package LabFunctionalPrograming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UnaryOperator<Double> addVat = x -> x * 1.2;
        List<Double> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Double::parseDouble)
                .map(e -> addVat.apply(e))
                .collect(Collectors.toList());


        System.out.println("Prices with VAT:");
        for (Double str : numbers)
            System.out.println(String.format("%.2f", str));
    }
}
