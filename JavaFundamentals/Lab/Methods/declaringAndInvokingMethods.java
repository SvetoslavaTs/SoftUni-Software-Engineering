package LabMethods;

import java.util.Scanner;

public class declaringAndInvokingMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            printIncreasingNumLine(i);
        }

        for (int i = num - 1; i >= 1; i--) {
            printIncreasingNumLine(i);
        }


        printHello("Svetoslava");
        System.out.println();
        printNumbers(3,6);
        System.out.println();
        printSign(num);
        System.out.println();
    }


    static void printIncreasingNumLine(int maxNumber) {
        for (int i = 1; i <= maxNumber; i++) {
            System.out.print(i);
            if (i < maxNumber) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    static void printNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.printf("%d ", i);
        }
    }

    public static void printHello(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.print('*');
        }
        System.out.println();
        System.out.println(name.toUpperCase());
        for (int i = 0; i < name.length(); i++) {
            System.out.print('-');
        }
    }

    static void printSign(int number) {
        if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        } else if (number < 0) {
            System.out.printf("The number %d is negative.", number);
        } else {
            System.out.printf("The number %d is zero.", number);
        }
    }

}

