package LabMethods;

import jdk.jshell.spi.ExecutionControl;

import java.util.Scanner;

public class greaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        switch (input) {
            case "int":
                int first = scanner.nextInt();
                int second = scanner.nextInt();
                System.out.println(getMax(first, second));
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                System.out.println(getMax(firstChar, secondChar));
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                System.out.println(getMax(firstString, secondString));
                break;
        }
    }

    static int getMax(int first, int second) {
        return Math.max(first, second);
    }

    static char getMax(char first, char second) {
        if (first > second) {
            return first;
        }
        return second;
    }

    public static String getMax(String firstString, String secondString) {
        if (firstString.compareTo(secondString) > 0) {
            return firstString;
        }
        return secondString;
    }
}
