package ExercisesStackAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        ArrayDeque<Integer> stackOfNumbers = new ArrayDeque<>();
//        int current = 0;
//        stackOfNumbers.push(13);
//        stackOfNumbers.push(42);
//        stackOfNumbers.push(6);
//
//        current = stackOfNumbers.pop();
//        System.out.println(current);
//
//
//        int size = stackOfNumbers.size();
//        boolean isEmpty = stackOfNumbers.isEmpty();
//        boolean exists = stackOfNumbers.contains(2);


        String expression = scanner.nextLine();
        Stack<Character> parentheses1 = new Stack<>();

        boolean correctBrackets = true;

        for (int index = 0; index < expression.length(); index++) {
            char ch = expression.charAt(index);

            if (ch == '(') {
                parentheses1.push(ch);
            } else if (ch == ')') {
                if (parentheses1.isEmpty()) {
                    correctBrackets = false;
                    break;
                } else {
                    char previousParent = parentheses1.peek();
                    if (previousParent == '(') {
                        parentheses1.pop();
                    }
                }
            }

            if (ch == '{') {
                parentheses1.push(ch);
            } else if (ch == '}') {
                if (parentheses1.isEmpty()) {
                    correctBrackets = false;
                    break;
                } else {
                    char previousParent = parentheses1.peek();
                    if (previousParent == '{') {
                        parentheses1.pop();
                    }
                }
            }

            if (ch == '[') {
                parentheses1.push(ch);
            } else if (ch == ']') {
                if (parentheses1.isEmpty()) {
                    correctBrackets = false;
                    break;
                } else {
                    char previousParent = parentheses1.peek();
                    if (previousParent == '[') {
                        parentheses1.pop();
                    }
                }
            }

        }

        if (!parentheses1.isEmpty())
            correctBrackets = false;

        if (correctBrackets) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
