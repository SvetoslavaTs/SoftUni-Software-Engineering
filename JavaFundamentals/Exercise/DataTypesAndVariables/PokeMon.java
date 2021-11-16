package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        int m = scanner.nextInt();
        int y = scanner.nextInt();
        double originalValueN = n / 2.0;
        int counter = 0;

        while (n >= m) {
            n -= m;
            if (n == originalValueN) {
                if (y > 0) {
                    n /= y;
                    counter++;
                    continue;
                }
            }
            counter++;
        }
        System.out.println(n);
        System.out.println(counter);
    }
}
