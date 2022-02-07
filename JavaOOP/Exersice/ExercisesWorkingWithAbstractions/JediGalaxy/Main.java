package ExercisesWorkingWithAbstractions.JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensionsOfMatrix = readArray(scanner);
        int[][] matrix = fillMatrix(dimensionsOfMatrix);

        String command = "";
        long sum = 0;

        while (!command.equals("Let the Force be with you")) {
            int[] jedisPosition = readArray(scanner);
            int[] evilsPosition = readArray(scanner);

            while (isValidEvilDestination(evilsPosition)) {
                if (isValidStarInTheMatrix(evilsPosition, matrix)) {
                    destroyStar(evilsPosition, matrix);
                }
                moveEvil(evilsPosition);
            }

            while (isValidJediDestination(jedisPosition, matrix)) {
                if (isValidStarInTheMatrix(jedisPosition, matrix)) {
                    sum += gaterStar(matrix, jedisPosition);
                }
                moveJedi(jedisPosition);
            }

            command = scanner.nextLine();
        }

        System.out.println(sum);


    }

    private static boolean isValidJediDestination(int[] jedisPosition, int[][] matrix) {
        boolean isValidJediDestination = false;
        if (jedisPosition[0] >= 0 && jedisPosition[1] < matrix[0].length) {
            isValidJediDestination = true;
        }
        return isValidJediDestination;
    }

    private static boolean isValidEvilDestination(int[] position) {
        boolean isValidDestination = false;
        int x = position[0];
        int y = position[1];
        if (x >= 0 && y >= 0) {
            isValidDestination = true;
        }
        return isValidDestination;
    }

    private static long gaterStar(int[][] matrix, int[] jedisPosition) {
        long sum = 0;
        sum += matrix[jedisPosition[0]][jedisPosition[1]];
        return sum;
    }

    private static int[] moveEvil(int[] position) {
        for (int i = 0; i < position.length; i++) {
            position[i] = position[i] - 1;
        }
        return position;
    }

    private static int[] moveJedi(int[] position) {
        position[0] = position[0] - 1;
        position[1] = position[1] + 1;

        return position;
    }


    private static void destroyStar(int[] position, int[][] matrix) {
        matrix[position[0]][position[1]] = 0;
    }

    private static boolean isValidStarInTheMatrix(int[] position, int[][] matrix) {
        boolean isValid = false;
        int x = position[0];
        int y = position[1];
        if (x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length) {
            isValid = true;
        }
        return isValid;
    }

    private static int[][] fillMatrix(int[] dimensionsOfMatrix) {
        int[][] matrix = new int[dimensionsOfMatrix[0]][dimensionsOfMatrix[1]];
        int value = 0;
        for (int i = 0; i < dimensionsOfMatrix[0]; i++) {
            for (int j = 0; j < dimensionsOfMatrix[1]; j++) {
                matrix[i][j] = value++;
            }
        }
        return matrix;
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt).toArray();
    }
}
