package ExercisesEncapsulation.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public void buyProduct(Product product) {
        if (!hasEnoughMoney(product)) {
            throw new IllegalArgumentException(String.format("%s can't afford %s", this.name, product.getName()));
        }
        this.money -= product.getCost();
        products.add(product);
    }

    private boolean hasEnoughMoney(Product product) {
        return this.money >= product.getCost();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String postfix = this.products.size() > 0
                ? this.products.stream()
                .map(Product::getName)
                .collect(Collectors.joining(", "))
                : "Nothing bought";
        return this.name + " - " + postfix;
    }

}
