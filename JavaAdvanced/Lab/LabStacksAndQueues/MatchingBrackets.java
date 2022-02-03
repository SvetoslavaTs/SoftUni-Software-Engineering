package LabStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> indexes = new ArrayDeque<>();

        String expression = scanner.nextLine();
        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);
            if (symbol == '(') {
                indexes.push(i);
            } else if (symbol == ')') {
                System.out.println(expression.substring(indexes.pop(), i + 1));
            }

        }

    }
}
