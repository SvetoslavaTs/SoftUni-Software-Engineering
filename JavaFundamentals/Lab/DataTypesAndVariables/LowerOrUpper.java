package LabDataTypesAndVariables;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char character = scanner.nextLine().charAt(0);

        if (character >= 'a' && character <= 'z') {
            System.out.println("lower-case");
        } else if (character >= 'A' && character <= 'Z') {
            System.out.println("upper-case");
        }
    }
}
