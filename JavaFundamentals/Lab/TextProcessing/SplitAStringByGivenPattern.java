package LabTextProcessing;

public class SplitAStringByGivenPattern {
    public static void main(String[] args) {
        String text = "Hello, john@softuni.bg, you have been using john@softuni.bg in your registration";
        String[] words = text.split(", ");
        for (String word : words) {
            System.out.println(word);
        }

    }
}
