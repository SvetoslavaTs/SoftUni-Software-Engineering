package ExerciseMethods;

import java.util.Scanner;

public class charactersInRange1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char start = scanner.next().charAt(0);
        char end = scanner.next().charAt(0);
        if (start < end) {
            getPrintInBetweenCharacters(start, end);
        } else {
            getPrintInBetweenCharacters(end, start);
        }

    }

    private static void getPrintInBetweenCharacters(char start, char end) {
        for (int i = ++start; i < end; i++) {
            System.out.print((char) i + " ");
        }
    }
}
