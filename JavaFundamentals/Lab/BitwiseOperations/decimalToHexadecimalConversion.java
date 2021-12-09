package BitwiseOperations;

import java.util.Scanner;

public class decimalToHexadecimalConversion {

        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);

            long num = Integer.parseInt(scanner.nextLine());
            String result = "";
            while (num > 0) {
                long digit = num % 16;
                result = getHexDigit(digit) + result;
                num = num / 16;
            }

            System.out.println(result);

        }

    private static String getHexDigit(long digit) throws Exception {
            if(digit < 10) {
                return "" + digit;
            } else if(digit == 10) {
                return "A";
            }else if(digit == 11) {
                return "B";
            }else if(digit == 12) {
                return "C";
            }else if(digit == 13) {
                return "D";
            }else if(digit == 14) {
                return "E";
            }else if(digit == 15) {
                return "F";
            } else {
                throw new Exception("Invalid digit");
            }
    }

}

