package LabMethods;

import java.util.Scanner;

public class calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        switch (command) {
            case "add":
                add(firstNum, secondNum);
                break;
            case "multiply":
                multiply(firstNum, secondNum);
                break;
            case "subtract":
                subtract(firstNum, secondNum);
                break;
            case "divide":
                divide(firstNum, secondNum);
                break;
        }
    }

    static void add(int firstNum, int secondNum) {
        int result = firstNum + secondNum;
        System.out.println(result);
    }

    static void multiply(int firstNum, int secondNum) {
        int result = firstNum * secondNum;
        System.out.println(result);
    }

    static void subtract(int firstNum, int secondNum) {
        int result = firstNum - secondNum;
        System.out.println(result);
    }

    static void divide(int firstNum, int secondNum) {
        int result = firstNum / secondNum;
        System.out.println(result);
    }
}
