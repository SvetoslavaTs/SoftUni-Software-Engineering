package LabArrays;

import java.util.Scanner;

public class printNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers.length / 2; i++) {
            int swap = numbers.length - 1 - i;
            int oldPositionOfi = numbers[i];
            numbers[i] = numbers[swap];
            numbers[swap] = oldPositionOfi;
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
