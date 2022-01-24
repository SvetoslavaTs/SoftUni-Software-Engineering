package ExercisesTextProcessing;

import java.util.Scanner;

public class caesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            int currentCharAsInt = input.charAt(i) + 3;
            char currentCharAsChar = (char) currentCharAsInt;
            encrypted.append(currentCharAsChar);
        }
        System.out.println(encrypted);
    }
}
