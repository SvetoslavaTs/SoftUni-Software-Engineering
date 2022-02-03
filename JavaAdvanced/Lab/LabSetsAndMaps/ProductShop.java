package SetsAndMaps;

import java.util.*;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Double>> foodShops = new TreeMap<>();
        String input = scanner.nextLine();

        while (!input.equals("Revision")) {
            String[] tokens = input.split(", ");
            String shop = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);
            foodShops.putIfAbsent(shop, new LinkedHashMap<>());
            foodShops.get(shop).putIfAbsent(product, price);
            input = scanner.nextLine();
        }

        foodShops.entrySet().forEach(stringMapEntry -> {
            System.out.println(stringMapEntry.getKey() + "->");
            stringMapEntry.getValue().entrySet().forEach(entry -> {
                System.out.printf("Product: %s, Price: %.1f%n", entry.getKey(), entry.getValue());
            });
        });
    }
}
