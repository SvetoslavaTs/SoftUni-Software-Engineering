package ExercisesTextProcessing;

import java.util.Scanner;

public class multiplyBigNumber1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bigNumber = scanner.nextLine().replaceFirst("^0+", "");
        int singleDigit = Integer.parseInt(scanner.nextLine());
        StringBuilder product = new StringBuilder();
        int ostatak = 0;

        if (singleDigit == 0) {
            System.out.println(0);
            return;
        }

        for (int i = bigNumber.length() - 1; i >= 0; i--) {
            int currentNum = Integer.parseInt(String.valueOf(bigNumber.charAt(i)));
            int currentProduct = singleDigit * currentNum + ostatak;
            if (i == 0) {
                product.insert(0, currentProduct);
            } else {
                int lastDigit = currentProduct % 10;
                ostatak = currentProduct / 10;
                product.insert(0, lastDigit);
            }
        }

        System.out.println(product);
    }
}
