package LabTextProcessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class repeatStrings {
    public static void main(String[] args) {
        String[] words = new Scanner(System.in).nextLine().split(" ");
        List<String> repetedWords = new ArrayList<>();

        for (String word : words) {
            repetedWords.add(repeat(word, word.length()));
        }
        System.out.println(String.join("", repetedWords));

    }

    private static String repeat(String word, int length) {
        String[] repeatArr = new String[length];
        for (int i = 0; i < length; i++) {
            repeatArr[i] = word;
        }
        return String.join("", repeatArr);
    }
}
