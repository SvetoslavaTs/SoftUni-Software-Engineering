package ExercisesTextProcessing;

import java.util.Scanner;

public class morseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.."};

        String[] english = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
                "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "X"};

        String[] input = scanner.nextLine().split(" ");
        StringBuilder message = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("|")) {
                message.append(" ");
                continue;
            }
            for (int j = 0; j < morse.length; j++) {
                if (input[i].equals(morse[j])) {
                    message.append(english[j]);
                    break;
                }
            }

        }
        System.out.println(message);

    }
}
