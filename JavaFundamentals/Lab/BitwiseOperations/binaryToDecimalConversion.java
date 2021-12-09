package BitwiseOperations;

import java.util.Scanner;

public class binaryToDecimalConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int sum = 0;
        int magnitude = 1;
        for (int i = num.length() -1 ; i >= 0 ; i--) {
            int digit = num.charAt(i) - '0';
            sum += digit * magnitude;
            magnitude *= 2;
        }


        System.out.println(sum);

    }

}
