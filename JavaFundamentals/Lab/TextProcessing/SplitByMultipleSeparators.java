package LabTextProcessing;

public class SplitByMultipleSeparators {
    public static void main(String[] args) {
        String text = "Hello, I am John.";
        String[] words = text.split("[, .]+");
        for (String word : words
        ) {
            System.out.println(word);
        }

    }
}
