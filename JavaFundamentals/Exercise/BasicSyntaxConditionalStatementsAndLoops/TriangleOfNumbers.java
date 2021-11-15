package ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= n; row++) {
            System.out.println();
            for (int column = 1; column <= row; column++) {
                System.out.print(row + " ");
            }
        }
    }
}
