package ExercisesMultidimensionalArrays;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf3X3Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = readMatrix(scanner);
        int maxSum = Integer.MIN_VALUE;
        ArrayDeque<Integer> maxSumMatrix = new ArrayDeque<>();

        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                int currentSum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2]
                        + matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];
                if (currentSum > maxSum) {
                    maxSum = currentSum;

                    if (!maxSumMatrix.isEmpty()) {
                        maxSumMatrix.clear();
                        maxSumMatrix.offer(matrix[row][col]);
                        maxSumMatrix.offer(matrix[row][col + 1]);
                        maxSumMatrix.offer(matrix[row][col + 2]);
                        maxSumMatrix.offer(matrix[row + 1][col]);
                        maxSumMatrix.offer(matrix[row + 1][col + 1]);
                        maxSumMatrix.offer(matrix[row + 1][col + 2]);
                        maxSumMatrix.offer(matrix[row + 2][col]);
                        maxSumMatrix.offer(matrix[row + 2][col + 1]);
                        maxSumMatrix.offer(matrix[row + 2][col + 2]);
                    } else {
                        maxSumMatrix.offer(matrix[row][col]);
                        maxSumMatrix.offer(matrix[row][col + 1]);
                        maxSumMatrix.offer(matrix[row][col + 2]);
                        maxSumMatrix.offer(matrix[row + 1][col]);
                        maxSumMatrix.offer(matrix[row + 1][col + 1]);
                        maxSumMatrix.offer(matrix[row + 1][col + 2]);
                        maxSumMatrix.offer(matrix[row + 2][col]);
                        maxSumMatrix.offer(matrix[row + 2][col + 1]);
                        maxSumMatrix.offer(matrix[row + 2][col + 2]);
                    }
                }
            }
        }
        System.out.println("Sum = " + maxSum);
        while (!maxSumMatrix.isEmpty()) {
            for (int i = 0; i < 3; i++) {
                System.out.print(maxSumMatrix.poll() + " ");
            }
            System.out.println();
        }

    }

    private static int[][] readMatrix(Scanner scanner) {
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[input[0]][input[1]];
        for (int row = 0; row < matrix.length; row++) {
            int[] line = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = line;
        }
        return matrix;
    }
}
