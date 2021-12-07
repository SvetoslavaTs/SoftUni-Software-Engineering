package ExerciseMethods;

import java.util.Scanner;

public class passwordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean is6to10chars = check6to10chars(input);
        boolean isConsistOnlyDigitAndLetters = checkOnlyDigitAndLetters(input);
        boolean isAtLeast2Digits = checkAtLest2Digit(input);

        if (is6to10chars && isConsistOnlyDigitAndLetters && isAtLeast2Digits) {
            System.out.println("Password is valid");
        }
    }

    private static boolean checkAtLest2Digit(String input) {
        int countDigit = 0;
        boolean isAtLeast2Digits = false;
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current >= 48 && current <= 57) {
                countDigit++;
            }
        }
        if (countDigit >= 2) {
            isAtLeast2Digits = true;
        } else {
            System.out.println("Password must have at least 2 digits");
        }
        return isAtLeast2Digits;
    }

    private static boolean checkOnlyDigitAndLetters(String input) {
        int count = 0;
        boolean isConsistOnlyDigitAndLetters = false;
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if ((current >= 48 && current <= 57) || (current >= 65 && current <= 90) || (current >= 97 && current <= 122)) {
                count++;
            }
        }
        if (count == input.length()) {
            isConsistOnlyDigitAndLetters = true;
        } else {
            System.out.println("Password must consist only of letters and digits");
        }
        return isConsistOnlyDigitAndLetters;
    }

    public static boolean check6to10chars(String input) {
        boolean is6to10chars = false;
        if (input.length() >= 6 && input.length() <= 10) {
            is6to10chars = true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
        }
        return is6to10chars;
    }
}
