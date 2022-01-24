package ExercisesTextProcessing;

import java.util.Scanner;

public class multiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bigNumber = scanner.nextLine().replaceFirst("^0+", "");
        int singleDigit = Integer.parseInt(scanner.nextLine());
        StringBuilder product = new StringBuilder();
        int ostatak = 0;
        int lastDigit = 0;

        if (singleDigit == 0) {
            System.out.println(0);
            return;
        }

        for (int i = bigNumber.length() - 1; i >= 0; i--) {
            int currentNum = Integer.parseInt(String.valueOf(bigNumber.charAt(i)));
            int currentProduct = singleDigit * currentNum;
            currentProduct += ostatak;
            if (currentProduct < 10) {
                product.append(currentProduct);
                ostatak = 0;
            } else {
                while (currentProduct > 0) {
                    lastDigit = currentProduct % 10;
                    product.append(lastDigit);
                    currentProduct = currentProduct / 10;
                    ostatak = currentProduct;
                    currentProduct = currentProduct / 10;
                }
            }

        }
        if (ostatak != 0) {
            product.append(ostatak);
        }
        System.out.printf("%s%n", product.reverse());
    }
}
