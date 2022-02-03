package LabMultidimensionalArrays;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2X2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = readMatrix(scanner);
        int maxSum = Integer.MIN_VALUE;
        ArrayDeque<Integer> maxSumMatrix = new ArrayDeque<>();
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int currentSum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (currentSum > maxSum) {
                    maxSum = currentSum;

                    if (!maxSumMatrix.isEmpty()) {
                        maxSumMatrix.clear();
                        maxSumMatrix.offer(matrix[row][col]);
                        maxSumMatrix.offer(matrix[row][col + 1]);
                        maxSumMatrix.offer(matrix[row + 1][col]);
                        maxSumMatrix.offer(matrix[row + 1][col + 1]);
                    } else {
                        maxSumMatrix.offer(matrix[row][col]);
                        maxSumMatrix.offer(matrix[row][col + 1]);
                        maxSumMatrix.offer(matrix[row + 1][col]);
                        maxSumMatrix.offer(matrix[row + 1][col + 1]);
                    }
                }
            }
        }
        while (!maxSumMatrix.isEmpty()) {
            for (int i = 0; i < 2; i++) {
                System.out.print(maxSumMatrix.poll() + " ");
            }
            System.out.println();
        }
        System.out.println(maxSum);
    }

    private static int[][] readMatrix(Scanner scanner) {
        int[] input = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[input[0]][input[1]];
        for (int row = 0; row < matrix.length; row++) {
            int[] line = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = line;
        }
        return matrix;
    }
}
