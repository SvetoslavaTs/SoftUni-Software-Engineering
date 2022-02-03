package ExercisesMultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rAndC = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int r = rAndC[0];
        int c = rAndC[1];

        String[][] palindrome = new String[r][c];
        for (int rows = 0; rows < palindrome.length; rows++) {
            for (int cols = 0; cols < palindrome[rows].length; cols++) {
                palindrome[rows][cols] = "" + (char) ('a' + rows) + (char) ('a' + cols + rows) + (char) ('a' + rows);
                System.out.print(palindrome[rows][cols] + " ");
            }
            System.out.println();
        }


    }
}
