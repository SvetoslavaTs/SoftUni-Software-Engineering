package ExercisesEncapsulation.PizzaCalories;

public enum DoughType {
    WHITE(1.5),
    WHOLEGRAIN(1.0),
    CRISPY(0.9),
    CHEWY(1.1),
    HOMEMADE(1.0);

    double modifier;

    DoughType(double modifier) {
        this.modifier = modifier;
    }

    public double getModifier() {
        return modifier;
    }
}
