package ExercisesEncapsulation.ShoppingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Person> allPersons = new LinkedHashMap<>();
        Map<String, Product> allProduct = new LinkedHashMap<>();


        try {
            String[] tokens = reader.readLine().split(";");
            for (String token : tokens) {
                String[] personWithHisMoney = token.split("=");
                String name = personWithHisMoney[0];
                double money = Double.parseDouble(personWithHisMoney[1]);
                Person person = new Person(name, money);
                allPersons.putIfAbsent(name, person);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            String[] tokens = reader.readLine().split(";");
            for (String token : tokens) {
                String[] productAndCost = token.split("=");
                String name = productAndCost[0];
                double cost = Double.parseDouble(productAndCost[1]);
                Product product = new Product(name, cost);
                allProduct.putIfAbsent(name, product);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        String purchase = reader.readLine();
        while (!purchase.equals("END")) {
            String[] command = purchase.split("\\s+");
            String buyer = command[0];
            String product = command[1];
            Person person = allPersons.get(buyer);
            Product product1 = allProduct.get(product);
            if (person == null || product1 == null) {
                continue;
            }
            try {
                allPersons.get(buyer).buyProduct(allProduct.get(product));
                System.out.println(buyer + " bought " + product);

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            purchase = reader.readLine();
        }
        for (Person value : allPersons.values()) {
            System.out.println(value);
        }

    }

}

