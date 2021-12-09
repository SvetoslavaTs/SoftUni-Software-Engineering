package BitwiseOperations;

import java.util.Scanner;

public class decimalToBinaryConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num = Integer.parseInt(scanner.nextLine());
        String result = "";
        while (num > 0) {
            int digit = num % 2;
            result =digit + result;
            num = num /2;
        }

        //How many zeros have in the binary digit
        int zeros = 0;
        for (int i = 0; i < result.length() ; i++) {
            if(result.charAt(i) == '0') {
                zeros++;
            }
        }

        System.out.println(result);
        System.out.println("Zeros in this binary digit: " + zeros);
    }

}
