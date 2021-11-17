package ExerciseArrays;

import java.util.Scanner;

public class topIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] line = input.split(" ");
        int[] inputAsString = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            inputAsString[i] = Integer.parseInt(line[i]);
        }

        for (int i = 0; i < inputAsString.length; i++) {
            boolean isBigger = true;
            for (int j = i + 1; j < inputAsString.length; j++) {
                if (inputAsString[i] <= inputAsString[j]) {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                System.out.print(inputAsString[i] + " ");
            }
        }


    }
}
