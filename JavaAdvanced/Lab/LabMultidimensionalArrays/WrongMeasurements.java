package LabMultidimensionalArrays;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = readMatrix(scanner);
        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int mistakenValue = matrix[rowsAndCols[0]][rowsAndCols[1]];
        ArrayDeque<Integer> replacedMatrix = new ArrayDeque<>();

        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                if (matrix[rows][cols] == mistakenValue) {
                    int sum = sumNearestElements(matrix, rows, cols, mistakenValue);
                    replacedMatrix.offer(sum);
                } else {
                    replacedMatrix.offer(matrix[rows][cols]);
                }
            }
        }
        while (!replacedMatrix.isEmpty()) {
            for (int i = 0; i < matrix[rowsAndCols[0]].length; i++) {
                System.out.print(replacedMatrix.poll() + " ");
            }
            System.out.println();
        }
    }

    private static int sumNearestElements(int[][] matrix, int rows, int cols, int mistakenValue) {
        int sum = 0;
        if (cols + 1 < matrix[rows].length) {
            int rightDigit = matrix[rows][cols + 1];
            if (rightDigit != mistakenValue) {
                sum += rightDigit;
            }
        }
        if (cols - 1 >= 0) {
            int leftDigit = matrix[rows][cols - 1];
            if (leftDigit != mistakenValue) {
                sum += leftDigit;
            }
        }
        if (rows + 1 < matrix.length) {
            int downDigit = matrix[rows + 1][cols];
            if (downDigit != mistakenValue) {
                sum += downDigit;
            }
        }
        if (rows - 1 >= 0) {
            int upDigit = matrix[rows - 1][cols];
            if (upDigit != mistakenValue) {
                sum += upDigit;
            }
        }

        return sum;
    }


    private static int[][] readMatrix(Scanner scanner) {
        int rows = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[rows][];

        for (int row = 0; row < matrix.length; row++) {
            int[] line = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = line;
        }
        return matrix;
    }
}
