package ExercisesRegex;

import com.sun.source.tree.WhileLoopTree;

import java.net.FileNameMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class softUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>\\d+)\\|[^|$%.]*?(?<price>\\d+\\.?\\d+?)\\$";
        Pattern pattern = Pattern.compile(regex);
        double income = 0;

        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double totalPrice = count * price;
                income += totalPrice;
                System.out.printf("%s: %s - %.2f%n", name, product, totalPrice);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", income);
    }
}
