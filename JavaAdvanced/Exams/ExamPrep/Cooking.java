package ExamPrep;

import java.util.*;
import java.util.stream.Collectors;

public class Cooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> liquids = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> ingredients = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(ingredients::push);
        Map<Integer, String> cookingTable = new HashMap<>();
        cookingTable.put(25, "Bread");
        cookingTable.put(50, "Cake");
        cookingTable.put(75, "Pastry");
        cookingTable.put(100, "Fruit Pie");

        Map<String, Integer> productCooked = new TreeMap<>();
        cookingTable.values().forEach(p -> productCooked.put(p, 0));

        while (!liquids.isEmpty() && !ingredients.isEmpty()) {
            int currentLiquid = liquids.poll();
            int currentIngredient = ingredients.pop();
            int sum = currentIngredient + currentLiquid;

            if (ableToCook(sum)) {
                String product = cookingTable.get(sum);
                productCooked.put(product, productCooked.get(product) + 1);
            } else {
                ingredients.push(currentIngredient + 3);
            }
        }

        if (hasCookedEachMeal(productCooked)) {
            System.out.println("Wohoo! You succeeded in cooking all the food!");
        } else {
            System.out.println("Ugh, what a pity! You didn't have enough materials to to cook everything.");
        }

        System.out.println("Liquids left: " + getElements(liquids));
        System.out.println("Ingredients left: " + getElements(ingredients));
        productCooked.forEach((k, v) -> {
            System.out.println(k + ": " + v);
        });
    }

    private static String getElements(ArrayDeque<Integer> elements) {
        return elements.isEmpty() ? "none"
                : elements.stream().map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    private static boolean hasCookedEachMeal(Map<String, Integer> productCooked) {
        return productCooked.values().stream()
                .noneMatch(c -> c == 0);
    }

    private static boolean ableToCook(int sum) {

        return sum == 25 || sum == 50 || sum == 75 || sum == 100;
    }
}
