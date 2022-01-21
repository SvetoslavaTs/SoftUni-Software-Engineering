package LabTextProcessing;

import java.util.Scanner;

public class digitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder digit = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder ch = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                digit.append(input.charAt(i));
            } else if (Character.isLetter(input.charAt(i))) {
                letters.append(input.charAt(i));
            } else {
                ch.append(input.charAt(i));
            }
        }
        System.out.printf("%s%n%s%n%s", digit, letters, ch);
    }
}
