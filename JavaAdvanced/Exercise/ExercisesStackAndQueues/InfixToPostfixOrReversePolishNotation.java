package ExercisesStackAndQueues;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InfixToPostfixOrReversePolishNotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> queuePrint = new ArrayDeque<>();
        ArrayDeque<String> stackOperators = new ArrayDeque<>();
        ArrayDeque<String> queueBrackets = new ArrayDeque<>();
        Map<String, Integer> precedenceOfOperators = new HashMap<>();
        precedenceOfOperators.put("*", 3);
        precedenceOfOperators.put("/", 3);
        precedenceOfOperators.put("+", 2);
        precedenceOfOperators.put("-", 2);
        precedenceOfOperators.put("(", 1);

        String[] input = scanner.nextLine().split("\\s+");

        for (int i = 0; i < input.length; i++) {
            String currentSymbol = input[i];
            boolean isInteger = false;
            try {
                int integer = Integer.parseInt(currentSymbol);
                isInteger = true;
            } catch (Exception ignored) {

            }
            boolean isAlphabetic = false;
            for (int j = 0; j < currentSymbol.length(); j++) {
                char ch = currentSymbol.charAt(j);
                if (ch >= 97 && ch <= 122) {
                    isAlphabetic = true;
                }
            }
            if (isInteger) {
                queuePrint.offer(currentSymbol);
            } else if (isAlphabetic) {
                queuePrint.offer(currentSymbol);
            } else if (currentSymbol.equals("(")) {
                stackOperators.push(currentSymbol);
            } else if (currentSymbol.equals(")")) {
                String symbol = stackOperators.pop();
                while (!symbol.equals("(")) {
                    queuePrint.offer(symbol);
                    symbol = stackOperators.pop();
                }
            } else if (currentSymbol.equals("/") || currentSymbol.equals("*") || currentSymbol.equals("+") || currentSymbol.equals("-")) {
                while (!stackOperators.isEmpty() && precedenceOfOperators.get(stackOperators.peek()) >= precedenceOfOperators.get(currentSymbol)) {
                    queuePrint.offer(stackOperators.pop());
                }
                stackOperators.push(currentSymbol);
            }
        }

        while (!stackOperators.isEmpty()) {
            queuePrint.offer(stackOperators.pop());
        }
        for (String character : queuePrint) {
            System.out.print(character + " ");

        }

    }
}
