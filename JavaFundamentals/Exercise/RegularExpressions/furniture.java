package ExercisesRegex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> furniture = new ArrayList<>();
        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>\\d+\\.?\\d*)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        double cost = 0;


        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                furniture.add(matcher.group("furniture"));
                double total = Double.parseDouble(matcher.group("price")) * Integer.parseInt(matcher.group("quantity"));
                cost += total;
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture: ");
        for (String s : furniture) {
            System.out.println(s);
        }

        System.out.printf("Total money spend: %.2f", cost);
    }
}
