package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i <= n.length() - 1; i++) {
            char digit = n.charAt(i);
            int digitAsInt = Integer.parseInt(String.valueOf(digit));
            sum += digitAsInt;
        }
        System.out.println(sum);


    }
}
