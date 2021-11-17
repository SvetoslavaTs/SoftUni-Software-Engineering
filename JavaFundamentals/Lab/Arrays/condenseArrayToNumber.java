package LabArrays;

import java.util.Arrays;
import java.util.Scanner;

public class condenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputAsString = input.split(" ");
        int[] inputAsInt = new int[inputAsString.length];
        for (int i = 0; i < inputAsInt.length; i++) {
            inputAsInt[i] = Integer.parseInt(inputAsString[i]);
        }

        while (inputAsInt.length != 1) {
            int[] condense = new int[inputAsInt.length - 1];

            for (int i = 0; i < condense.length; i++) {
                condense[i] = inputAsInt[i] + inputAsInt[i + 1];

            }
            inputAsInt = condense;
        }
        System.out.println(inputAsInt[0]);


    }

}

