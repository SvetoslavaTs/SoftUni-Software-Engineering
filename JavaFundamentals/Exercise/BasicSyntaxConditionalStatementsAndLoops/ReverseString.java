package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String newWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            char currentPosition = word.charAt(i);
            newWord += currentPosition;
        }
        System.out.println(newWord);
    }
}
