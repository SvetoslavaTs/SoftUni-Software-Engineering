package ExerciseArrays;

import java.util.Scanner;

public class kaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int index = 0;
        int maxIndex = 0;
        int sum = 0;
        int sequenceOfOne = 1;
        int currentSequence = 0;
        int maxSequence = 0;
        int[] maxArray = new int[n];
        int maxSum = 0;
        int currentInputCounter = 0;
        int maxCurrentInputCounter = 0;

        while (!input.equals("Clone them!")) {
            String[] inputSplit = input.split("!+");
            int[] inputInt = new int[n];
            for (int i = 0; i < inputInt.length; i++) {
                inputInt[i] = Integer.parseInt(inputSplit[i]);
            }
            currentSequence = 0;
            index = 0;
            currentInputCounter++;
            for (int i = 1; i < inputInt.length; i++) {
                if ((inputInt[i - 1] == 1) && (inputInt[i] == inputInt[i - 1])) {
                    sequenceOfOne++;
                    if (sequenceOfOne > currentSequence) {
                        currentSequence = sequenceOfOne;
                        index = i - 1;
                    }
                } else {
                    sequenceOfOne = 1;
                }
            }
            if (currentSequence > maxSequence) {
                maxSequence = currentSequence;
                maxIndex = index;
                maxArray = inputInt;
                maxCurrentInputCounter = currentInputCounter;
            } else if (currentSequence == maxSequence) {
                if (index < maxIndex) {
                    maxIndex = index;
                    maxArray = inputInt;
                    maxCurrentInputCounter = currentInputCounter;
                } else if (index == maxIndex) {
                    for (int i = 0; i < maxArray.length; i++) {
                        maxSum += maxArray[i];
                    }
                    for (int i = 0; i < inputInt.length; i++) {
                        sum = inputInt[i];
                    }
                    if (sum > maxSum) {
                        maxSum = sum;
                        maxArray = inputInt;
                        maxCurrentInputCounter = currentInputCounter;
                    }
                }
            }
            input = scanner.nextLine();
        }
        maxSum = 0;
        for (int i = 0; i < maxArray.length; i++) {
            maxSum += maxArray[i];
        }
        if (maxSum == 0) {
            maxCurrentInputCounter = 1;
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", maxCurrentInputCounter, maxSum);
        for (int value : maxArray) {
            System.out.print(value + " ");
        }

    }
}


