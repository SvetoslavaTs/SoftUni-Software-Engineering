package LabDataTypesAndVariables;

import java.util.Scanner;

public class ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        double km = (double) m / 1000;
        System.out.printf("%.2f", km);
    }
}
