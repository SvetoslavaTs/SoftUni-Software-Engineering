package LabFunctionalPrograming;

public class Math {

    public static boolean isEven(int number) {
        return isDivisibleBy(number, 2);
    }

    public static boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }
}
