package ExercisesMultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int n = Integer.parseInt(input[0]);
        String typeOfFillingMethod = input[1];

        int[][] matrix = new int[n][n];

        if (typeOfFillingMethod.equals("A")) {
            matrix = readMatrixPatternA(matrix, n);
        } else if (typeOfFillingMethod.equals("B")) {
            matrix = readMatrixPatternB(matrix, n);
        }
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }

    private static int[][] readMatrixPatternB(int[][] matrix, int n) {
        int row = 0;
        int col = 0;
        int counter = 0;
        while (col < n) {
            if (col % 2 == 1) {
                row = n - 1;
                while (row >= 0) {
                    matrix[row--][col] = ++counter;
                }
            } else {
                row = 0;
                while (row < n) {
                    matrix[row++][col] = ++counter;
                }
            }
            col++;
        }
        return matrix;
    }

    private static int[][] readMatrixPatternA(int[][] matrix, int n) {
        int row = 0;
        int col = 0;
        int counter = 0;
        while (col < n) {
            while (row < n) {
                matrix[row++][col] = ++counter;
            }
            col++;
            row = 0;
        }
        return matrix;
    }

}
