package LabArrays;

import java.util.Scanner;

public class printNumbersInReverseOrder1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int[] reversedNumber = new int[numbers.length];
        for (int i = 0; i < reversedNumber.length; i++) {
            reversedNumber[i] = numbers[numbers.length - 1 - i];
        }
        for (int i = 0; i < reversedNumber.length; i++) {
            System.out.print(reversedNumber[i] + " ");
        }
    }
}
