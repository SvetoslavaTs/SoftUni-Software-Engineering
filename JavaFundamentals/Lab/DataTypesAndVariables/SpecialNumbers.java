package LabDataTypesAndVariables;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int digit = i;
            while (digit > 0) {
                sum += digit % 10;
                digit = digit / 10;
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.println(i + " -> " + "True");
            } else {
                System.out.println(i + " -> " + "False");
            }

        }
    }
}
