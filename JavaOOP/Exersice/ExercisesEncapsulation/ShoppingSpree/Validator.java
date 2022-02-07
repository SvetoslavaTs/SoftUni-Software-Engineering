package ExercisesEncapsulation.ShoppingSpree;

public class Validator {

    public static void isValidName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    public static void isValidMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
    }

    private Validator() {
    }
}
