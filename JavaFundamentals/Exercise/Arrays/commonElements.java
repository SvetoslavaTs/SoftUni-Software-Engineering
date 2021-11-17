package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class commonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstSplit = scanner.nextLine().split(" ");
        String[] secondSplit = scanner.nextLine().split(" ");
        for (int i = 0; i < secondSplit.length; i++) {
            for (int j = 0; j < firstSplit.length; j++) {
                if (secondSplit[i].equals(firstSplit[j])) {
                    System.out.print(secondSplit[i] + " ");
                }
            }
        }


    }
}
