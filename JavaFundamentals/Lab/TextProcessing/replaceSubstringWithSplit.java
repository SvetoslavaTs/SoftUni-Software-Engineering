package LabTextProcessing;

import java.util.Scanner;

public class replaceSubstringWithSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        String text = scanner.nextLine();
        while (text.contains(key)) {
            String[] result = text.split(key);
            text = String.join("", result);
        }

        System.out.println(String.join("", text));
    }
}
