package ExamPrep;

import java.util.Scanner;

public class Selling {
    public static int startRow = 0;
    public static int startCol = 0;
    public static int money = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[n][n];

        for (int row = 0; row < n; row++) {
            String line = scanner.nextLine();
            matrix[row] = line.toCharArray();
            if (line.contains("S")) {
                startRow = row;
                startCol = line.indexOf("S");
            }
        }

        boolean isWithBakery = true;

        while (money < 50 && isWithBakery) {
            String command = scanner.nextLine();
            if (command.equals("up")) {
                isWithBakery = move(startRow - 1, startCol, matrix);
            } else if (command.equals("down")) {
                isWithBakery = move(startRow + 1, startCol, matrix);
            } else if (command.equals("left")) {
                isWithBakery = move(startRow, startCol - 1, matrix);
            } else if (command.equals("right")) {
                isWithBakery = move(startRow, startCol + 1, matrix);
            }


        }
        String message = !isWithBakery
                ? "Bad news, you are out of the bakery."
                : "Good news! You succeeded in collecting enough money!";
        System.out.println(message);
        System.out.println("Money: " + money);

        System.out.println(printMatrix(matrix));
    }


    private static boolean move(int newRow, int newCal,
                                char[][] matrix) {
        matrix[startRow][startCol] = '-';
        if (isOutOfBounds(newRow, newCal, matrix)) {
            return false;
        }
        char symbol = matrix[newRow][newCal];
        if (Character.isDigit(symbol)) {
            money += symbol - '0';
        } else if (symbol == 'O') {
            matrix[newRow][newCal] = '-';
            for (int r = 0; r < matrix.length; r++) {
                for (int c = 0; c < matrix[r].length; c++) {
                    if (matrix[r][c] == 'O') {
                        newRow = r;
                        newCal = c;
                        matrix[r][c] = '-';
                        break;
                    }
                }
                if (matrix[newRow][newCal] == 'O') {
                    break;
                }
            }
        }

        matrix[newRow][newCal] = 'S';

        startRow = newRow;
        startCol = newCal;
        return true;
    }

    private static boolean isOutOfBounds(int row, int col, char[][] matrix) {
        return row < 0 || row >= matrix.length || col < 0 || col >= matrix[row].length;
    }

    private static String printMatrix(char[][] matrix) {
        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                sb.append(matrix[r][c]);
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

}
