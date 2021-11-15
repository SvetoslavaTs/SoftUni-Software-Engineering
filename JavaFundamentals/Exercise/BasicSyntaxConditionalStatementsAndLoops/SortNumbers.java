package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int maxNum = Math.max(Math.max(firstNum, secondNum), thirdNum);
        int minNum = Math.min(Math.min(firstNum, secondNum), thirdNum);
        int middleNum = (firstNum + secondNum + thirdNum) - maxNum - minNum;
        System.out.println(maxNum);
        System.out.println(middleNum);
        System.out.println(minNum);

    }
}
