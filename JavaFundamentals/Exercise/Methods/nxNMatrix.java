package ExerciseMethods;

import java.util.Scanner;

public class nxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        printNxNMatrix(n);
    }

    private static void printNxNMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (j < n - 1) {
                    System.out.print(n + " ");
                } else {
                    System.out.print(n);
                }
            }
            System.out.println();
        }
    }
}
