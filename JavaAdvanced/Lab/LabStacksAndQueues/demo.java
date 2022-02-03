package LabStacksAndQueues;

import java.util.Stack;

public class demo {
    public static void main(String[] args) {
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


        String expression =
                "1 + (3 + 2 - (2+3) * 4 - ((3+1)*(4-2)))";
        Stack<Integer> stack = new Stack<Integer>();
        boolean correctBrackets = true;

        for (int index = 0; index < expression.length(); index++) {
            char ch = expression.charAt(index);
            if (ch == '(') {
                stack.push(index);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    correctBrackets = false;
                    break;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty())
            correctBrackets = false;
        System.out.println("Are the brackets correct? " +
                correctBrackets);


    }
}
