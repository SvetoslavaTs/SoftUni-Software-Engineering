import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        double result = 0;

        switch (operator) {
            case '+':
                result = n1 + n2;
                if (result % 2 == 0) {
                    System.out.printf("%.0f %c %.0f = %.0f - even", n1, operator, n2, result);
                } else {
                    System.out.printf("%.0f %c %.0f = %.0f - odd", n1, operator, n2, result);
                }
                break;
            case '-':
                result = n1 - n2;
                if (result % 2 == 0) {
                    System.out.printf("%.0f %c %.0f = %.0f - even", n1, operator, n2, result);
                } else {
                    System.out.printf("%.0f %c %.0f = %.0f - odd", n1, operator, n2, result);
                }
                break;
            case '*':
                result = n1 * n2;
                if (result % 2 == 0) {
                    System.out.printf("%.0f %c %.0f = %.0f - even", n1, operator, n2, result);
                } else {
                    System.out.printf("%.0f %c %.0f = %.0f - odd", n1, operator, n2, result);
                }
                break;
            case '/':
                if (n2 == 0) {
                    System.out.printf("Cannot divide %.0f by zero", n1);
                } else {
                    result = n1 / n2;
                    System.out.printf("%.0f %c %.0f = %.2f", n1, operator, n2, result);
                }
                break;
            case '%':
                if (n2 == 0) {
                    System.out.printf("Cannot divide %.0f by zero", n1);
                } else {
                    result = n1 % n2;
                    System.out.printf("%.0f %c %.0f = %.0f", n1, operator, n2, result);
                }
                break;
        }

    }
}







