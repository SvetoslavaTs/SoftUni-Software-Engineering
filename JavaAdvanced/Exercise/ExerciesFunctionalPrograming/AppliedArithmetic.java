package ExerciesFunctionalPrograming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();

        Function<int[], int[]> add = arr -> Arrays.stream(arr).map(i -> i += 1).toArray();
        Function<int[], int[]> multiply = arr -> Arrays.stream(arr).map(i -> i *= 2).toArray();
        Function<int[], int[]> subtract = arr -> Arrays.stream(arr).map(i -> i -= 1).toArray();
        Consumer<int[]> print = arr -> Arrays.stream(arr).forEach(i -> System.out.print(i + " "));

        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    input = add.apply(input);
                    break;
                case "multiply":
                    input = multiply.apply(input);
                    break;
                case "subtract":
                    input = subtract.apply(input);
                    break;
                case "print":
                    print.accept(input);
                    System.out.println();
                    break;
            }

            command = scanner.nextLine();
        }


    }
}
