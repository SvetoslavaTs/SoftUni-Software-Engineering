package ExerciseMethods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class factorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        double result = calculateFactorial(first) / calculateFactorial(second);
        System.out.printf("%.2f", result);

    }

    private static long divideFactorials(long calculateFactorial, long calculateFactorial1) {
        return calculateFactorial / calculateFactorial1;
    }

    private static double calculateFactorial(int number) {
        double firstFactorial = 1;
        for (int i = number; i >= 1; i--) {
            firstFactorial *= i;
        }
        return firstFactorial;
    }

}
