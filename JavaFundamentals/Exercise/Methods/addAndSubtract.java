package ExerciseMethods;

import java.util.Scanner;

public class addAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        System.out.println(getSubtract(first, second, third));
    }

    private static Integer getSum(int first, int second) {
        return first + second;
    }

    private static Integer getSubtract(int first, int second, int third) {
        return getSum(first, second) - third;
    }

}
