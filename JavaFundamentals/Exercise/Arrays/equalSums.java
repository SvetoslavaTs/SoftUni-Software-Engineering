package ExerciseArrays;

import java.util.Scanner;

public class  equalSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputAsArray = input.split(" ");
        int[] inputAsInt = new int[inputAsArray.length];
        for (int i = 0; i < inputAsInt.length; i++) {
            inputAsInt[i] = Integer.parseInt(inputAsArray[i]);
        }
        boolean isEqual = false;
        int index = 0;
        for (int i = 0; i < inputAsInt.length; i++) {
            if (inputAsInt.length == 1) {
                break;
            }
            int sumRight = 0;
            int sumLeft = 0;
            for (int j = i; j < inputAsInt.length - 1; j++) {
                sumRight += inputAsInt[j + 1];

            }
            for (int j = i; j > 0; j--) {
                sumLeft += inputAsInt[j - 1];
            }
            if (sumLeft == sumRight) {
                isEqual = true;
                index = i;
            }
        }
        if (isEqual || inputAsInt.length == 1) {
            System.out.println(index);
        } else {
            System.out.println("no");
        }
    }
}
