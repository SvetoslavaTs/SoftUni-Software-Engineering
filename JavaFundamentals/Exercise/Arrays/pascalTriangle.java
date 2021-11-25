package ExerciseArrays;

import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        long[][] triangle = new long[rows][];

        for (int i = 0; i < rows; i++) {
            long[] col = new long[i + 1];
            for (int j = 0; j < col.length; j++) {

                if(j == 0) {
                    col[0] = 1;
                } else if(j == col.length-1) {
                    col[j] = 1;
                } else {
                    col[j] = triangle[i-1][j-1] + triangle[i-1][j];
                }
            }

            triangle[i] = col;

          for(long r:col) {
              System.out.print(r + " ");
          }
            System.out.println();

        }

    }

}
