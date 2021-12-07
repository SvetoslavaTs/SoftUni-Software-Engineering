package LabMethods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int second = Integer.parseInt(scanner.nextLine());
        System.out.println(new DecimalFormat("0.##").format(mathOperationsByTwoDigit(first, operator, second)));

    }

    public static double mathOperationsByTwoDigit(int first, char operator, int second) {
        double result = 0.0;
        switch (operator) {
            case '/':
                result = (double) first / second;
                break;
            case '*':
                result = first * second;
                break;
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
        }
        return result;
    }
}
