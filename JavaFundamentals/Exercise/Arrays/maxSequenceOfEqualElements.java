package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class maxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int sequenceCounter = 1;
        int sequenceNumber = 0;
        int maxCounter = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                sequenceCounter++;

                if (sequenceCounter > maxCounter) {
                    maxCounter = sequenceCounter;
                    sequenceNumber = arr[i];
                }
            } else {
                sequenceCounter = 1;
            }
        }
        for (int i = 0; i < maxCounter; i++) {
            System.out.print(sequenceNumber + " ");
        }
    }
}
