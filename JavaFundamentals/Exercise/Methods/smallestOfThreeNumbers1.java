package ExerciseMethods;

import java.util.Scanner;

public class smallestOfThreeNumbers1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();

        findSmallestNum(firstNum, secondNum, thirdNum);
    }

    public static void findSmallestNum(int firstNum, int secondNum, int thirdNum) {
        int smallestNum = Math.min(Math.min(firstNum, secondNum), thirdNum);
        System.out.println(smallestNum);
    }
}
