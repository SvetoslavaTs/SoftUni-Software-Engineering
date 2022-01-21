package LabTextProcessing;

public class replace {
    public static void main(String[] args) {
        String text = "Hello, john@softuni.bg, you have been using john@softuni.bg in your registration.";
        String replacedText = text
                .replace("john@softuni.bg", "john@softuni.com");
        System.out.println(replacedText);

    }
}
