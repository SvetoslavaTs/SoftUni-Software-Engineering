package ExercisesStackAndQueues;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Long> calculatedFibonacci = new HashMap<>();

        long currentFibonacci = getFibonacci(n, calculatedFibonacci);

        System.out.println(currentFibonacci);


    }

    private static long getFibonacci(int n, Map<Integer, Long> calculatedFibonacci) {
        long fib = 0;
        if (n == 0 || n == 1) {
            return 1;
        } else if (calculatedFibonacci.containsKey(n)) {
            return calculatedFibonacci.get(n);
        } else {
            fib = getFibonacci(n - 1, calculatedFibonacci) + getFibonacci(n - 2, calculatedFibonacci);
            calculatedFibonacci.putIfAbsent(n, fib);
        }
        return fib;

    }

}
