package ExercisesEncapsulation.PizzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] pizzaTokens = reader.readLine().split("\\s+");
        String[] doughTokens = reader.readLine().split("\\s+");

        try {
            int countOfToppings = Integer.parseInt(pizzaTokens[2]);
            Pizza pizza = new Pizza(pizzaTokens[1], countOfToppings);
            Dough dough = new Dough(doughTokens[1], doughTokens[2], Double.parseDouble(doughTokens[3]));
            pizza.setDough(dough);

            for (int i = 0; i < countOfToppings; i++) {
                String[] toppingsTokens = reader.readLine().split("\\s+");
                Topping topping = new Topping(toppingsTokens[1], Double.parseDouble(toppingsTokens[2]));
                pizza.addTopping(topping);
            }
            System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

    }
}
