package ExerciseMethods;

import java.util.Scanner;

public class charactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char start = scanner.next().charAt(0);
        char end = scanner.next().charAt(0);

        getPrintInBetweenCharacters(start, end);
    }

    private static void getPrintInBetweenCharacters(char start, char end) {
        if (start > end) {
            for (int i = end + 1; i < start; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = start + 1; i < end; i++) {
                System.out.print((char) i + " ");
            }
        }
    }

}
