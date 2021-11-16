package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();

        int sum = number1 + number2;
        int divided = sum / number3;
        int multiply = divided * number4;
        System.out.println(multiply);
    }
}
