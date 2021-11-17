package LabArrays;

import java.util.Scanner;

public class equalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();
        String[] firstArrayAsSplitString = firstLine.split(" ");
        String[] secondArrayAsSplitString = secondLine.split(" ");
        int[] firstArrayInt = new int[firstArrayAsSplitString.length];
        int[] secondArraysInt = new int[secondArrayAsSplitString.length];
        int sumFirstArray = 0;
        int sumSecondArray = 0;
        for (int i = 0; i < firstArrayInt.length; i++) {
            firstArrayInt[i] = Integer.parseInt(firstArrayAsSplitString[i]);
            sumFirstArray += firstArrayInt[i];
        }
        for (int i = 0; i < secondArrayAsSplitString.length; i++) {
            secondArraysInt[i] = Integer.parseInt(secondArrayAsSplitString[i]);
            sumSecondArray += secondArraysInt[i];
        }
        boolean arrayAreEqual = false;
        int counterIndex = 0;
        for (int i = 0; i < firstArrayInt.length; i++) {
            if (firstArrayInt[i] == secondArraysInt[i]) {
                arrayAreEqual = true;
                counterIndex++;
            } else {
                arrayAreEqual = false;
                break;
            }

        }
        if (arrayAreEqual) {
            System.out.printf("Arrays are identical. Sum: %d", sumFirstArray);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", counterIndex);
        }

    }
}
