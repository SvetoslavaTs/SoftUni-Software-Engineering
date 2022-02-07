package Methods;

import LabDefiningClasses.Car.Car;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Printing {

    public static String formatArray(int[] arr) {
        return Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    public static void print(List<Integer> numbers) {
        System.out.println(numbers.toString().replaceAll("[\\[\\]]", ""));
    }

    public static void print1(List<String> upperCaseWords) {
        System.out.println(upperCaseWords.stream().collect(Collectors.joining(System.lineSeparator())));
    }

    public static void print2(List<Integer> list) {
        for (Integer s : list)
            System.out.print(s + " ");
    }

    public static void print3(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }

    static String joinElementsByDelimiter
            (List<Double> items, String delimiter) {
        String output = "";
        for (Double item : items)
            output += (new DecimalFormat("0.#").format(item) + delimiter);
        return output;
    }

    private static void printMatrix(char[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c]);
            }
            System.out.println();
        }
    }


}

