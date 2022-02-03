package LabMultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = readArray(scanner, "\\s+");
        }

        int row = 0, col = n - 1;

        while (row < n) {
            int innerRow = row;
            int innerCol = col;
            while (innerRow < n && innerCol < n) {
                System.out.print(matrix[innerRow++][innerCol++] + " ");
            }
            System.out.println();
            col--;
            if (col < 0) {
                col = 0;
                row++;
            }
        }
    }

    private static int[] readArray(Scanner scanner, String pattern) {
        return Arrays.stream(scanner.nextLine()
                .split(pattern))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
