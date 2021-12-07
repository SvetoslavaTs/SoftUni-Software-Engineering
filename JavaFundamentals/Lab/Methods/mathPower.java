package LabMethods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int pow = scanner.nextInt();
        System.out.println(new DecimalFormat("0.####").format(calculatePow(number, pow)));
    }

    static double calculatePow(double num, int pow) {
        return Math.pow(num, pow);
    }
}
