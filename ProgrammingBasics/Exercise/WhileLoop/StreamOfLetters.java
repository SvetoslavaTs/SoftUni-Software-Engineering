import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int counterC = 0;
        int counterO = 0;
        int counterN = 0;
        StringBuilder word = new StringBuilder();
        StringBuilder secretWord = new StringBuilder();


        while (!input.equals("End")) {
            char letter = input.charAt(0);
            if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
                if (letter == 'c' && counterC == 0) {
                    counterC++;
                } else if (letter == 'o' && counterO == 0) {
                    counterO++;
                } else if (letter == 'n' && counterN == 0) {
                    counterN++;
                } else {
                    word.append(letter);
                }
            }
            if (counterC == 1 && counterN == 1 && counterO == 1) {
                word.append(" ");
                secretWord.append(word);
                word = new StringBuilder();
                counterC = 0;
                counterN = 0;
                counterO = 0;
            }
            input = scanner.nextLine();
        }
        System.out.println(secretWord);
    }
}
