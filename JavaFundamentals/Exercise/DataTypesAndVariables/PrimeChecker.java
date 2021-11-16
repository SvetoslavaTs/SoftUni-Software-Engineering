package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            for (int divider = 2; divider < num; divider++) {
                if (num % divider == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", num, isPrime);
        }


    }
}
