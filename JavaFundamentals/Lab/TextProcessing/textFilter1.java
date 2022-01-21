package LabTextProcessing;

import java.util.Scanner;

public class textFilter1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String word : bannedWords) {
            text = text.replace(word, repeat("*", word.length()));
        }
        System.out.println(text);

    }

    private static String repeat(String word, int length) {
        String[] repeatArr = new String[length];
        for (int i = 0; i < length; i++) {
            repeatArr[i] = word;
        }
        return String.join("", repeatArr);
    }
}
