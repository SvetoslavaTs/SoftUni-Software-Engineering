package LabMultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReadMatrixMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readMatrix(scanner, ", ");
    }

    private static int[][] readMatrix(Scanner scanner, String patern) {
        int[] rowsAndCols = readArray(scanner, patern);

        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = readArray(scanner, patern);

        }
        return matrix;
    }

    private static int[] readArray(Scanner scanner, String pattern) {
        return Arrays.stream(scanner.nextLine()
                .split(pattern))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
