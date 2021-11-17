package LabArrays;

import java.util.Scanner;

public class howToPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[]{5, 8, 9, 6, 4, 7};
        String[] numbersAsString = new String[numbers.length];
        for (int i = 0; i < numbersAsString.length; i++) {
            numbersAsString[i] = String.valueOf(numbers[i]);
        }
        System.out.println(String.join(" ---> ", numbersAsString));
    }
}
