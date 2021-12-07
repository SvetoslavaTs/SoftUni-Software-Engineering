package ExerciseMethods;

import java.util.Scanner;

public class vowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();

        countVowels(input);
    }

    public static void countVowels(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current == 'a' || current == 'o' || current == 'u' || current == 'i' || current == 'e' || current == 'y') {
                count++;
            }
        }
        System.out.println(count);
    }
}
