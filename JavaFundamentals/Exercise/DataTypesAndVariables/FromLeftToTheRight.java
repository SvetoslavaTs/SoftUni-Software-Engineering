package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String currentNum = "";
        String firstNum = "";
        long sum = 0;
        long maxNum = 0;

        for (int i = 1; i <= n; i++) {
            String current = scanner.nextLine();
            for (int j = 0; j < current.length(); j++) {
                char currentDigit = current.charAt(j);
                if (currentDigit == 32) {
                    firstNum = currentNum;
                    currentNum = "";
                    continue;
                }
                currentNum += currentDigit;
            }
            long currentNumAsInt = Long.parseLong(currentNum);
            long firstNumAsInt = Long.parseLong(firstNum);
            if (currentNumAsInt >= firstNumAsInt) {
                maxNum = currentNumAsInt;
            } else {
                maxNum = firstNumAsInt;
            }
            while (maxNum != 0) {
                sum += maxNum % 10;
                maxNum /= 10;
            }
            System.out.println(Math.abs(sum));
            currentNum = "";
            firstNum = "";
            sum = 0;
        }
    }
}
