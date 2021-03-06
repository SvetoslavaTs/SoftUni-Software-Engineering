package LabStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        ArrayDeque<Integer> binary = new ArrayDeque<>();

        if (number == 0) {
            System.out.println(number);
        }

        while (number != 0) {
            binary.push(number % 2);
            number /= 2;
        }
        for (Integer integer : binary) {
            System.out.print(integer);
        }
    }
}
