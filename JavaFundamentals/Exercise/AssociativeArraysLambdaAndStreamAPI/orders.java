package ExercicesAssociativeArraysLambdaAndStreamAPI;

import java.awt.event.ItemEvent;
import java.util.*;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> products = new LinkedHashMap<>();
        String input = scanner.nextLine();


        while (!input.equals("buy")) {
            String[] tokens = input.split(" ");
            String name = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            double quantity = Double.parseDouble(tokens[2]);
            List<Double> prices = products.get(name);
            if (prices == null) {
                prices = new ArrayList<>();
                products.put(name, prices);
                prices.add(price);
                prices.add(quantity);
            } else {
                prices.set(1, prices.get(1) + quantity);
                prices.set(0, price);
            }
            input = scanner.nextLine();
        }

        products.entrySet().stream().forEach(entry -> {
            double result = entry.getValue().get(0) * entry.getValue().get(1);
            System.out.printf("%s -> %.2f%n", entry.getKey(), result);
        });
    }
}
