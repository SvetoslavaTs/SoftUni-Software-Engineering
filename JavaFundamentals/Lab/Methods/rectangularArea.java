package LabMethods;

import java.util.Scanner;

public class rectangularArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double area = getRectangularArea(width, height);
        System.out.printf("%.0f%n", area);
        ;

    }

    static double getRectangularArea(double width, double height) {
        return width * height;
    }
}
