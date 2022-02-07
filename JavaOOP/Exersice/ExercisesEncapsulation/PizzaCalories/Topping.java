package ExercisesEncapsulation.PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    public String getToppingType() {
        return toppingType;
    }

    private double getWeight() {
        return weight;
    }

    private void setToppingType(String toppingType) {
//        if (!toppingType.equals("Meat") &&
//                !toppingType.equals("Veggies") &&
//                !toppingType.equals("Cheese") &&
//                !toppingType.equals("Sauce")) {
        String enumAsString = ToppingType.valueOf(toppingType.toUpperCase()).toString();
        String toppingTypeToUpperCase = toppingType.toUpperCase();
        if (toppingType.equals(enumAsString)) {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingType));
        }
        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", this.toppingType));
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        double modifier = ToppingType.valueOf(toppingType.toUpperCase()).getModifier();
        return 2 * weight * modifier;
    }
}
