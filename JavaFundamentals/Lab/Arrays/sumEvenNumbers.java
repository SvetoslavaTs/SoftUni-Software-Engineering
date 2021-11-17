package LabArrays;

import java.util.Scanner;

public class sumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] values = line.split(" ");
        int[] numbersAsInt = new int[values.length];
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < numbersAsInt.length; i++) {
            numbersAsInt[i] = Integer.parseInt(values[i]);
            if (numbersAsInt[i] % 2 == 0) {
                sumEven += numbersAsInt[i];
            }
        }
        System.out.println(sumEven);


    }

}

