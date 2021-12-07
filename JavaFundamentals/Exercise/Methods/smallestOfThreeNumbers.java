package ExerciseMethods;

import java.util.Scanner;

public class smallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();

        findSmallestNum(firstNum, secondNum, thirdNum);
    }

    public static void findSmallestNum(int firstNum, int secondNum, int thirdNum) {
        if (firstNum <= secondNum && firstNum <= thirdNum) {
            System.out.println(firstNum);
        } else if (secondNum <= firstNum && secondNum <= thirdNum) {
            System.out.println(secondNum);
        } else {
            System.out.println(thirdNum);
        }
    }
}
