package LabArrays;

import java.util.Scanner;

public class reverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letters = scanner.nextLine();
        String[] items = letters.split(" ");
        for (int i = 0; i < items.length / 2; i++) {
            int swap = items.length - 1 - i;
            String oldPosition = items[i];
            items[i] = items[swap];
            items[swap] = oldPosition;
        }
        System.out.print(String.join(" ", items));


    }
}
