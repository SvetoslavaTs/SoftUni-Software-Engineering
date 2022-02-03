package ExercisesDefiningClasses.CarSalesman;

public class Car {
    String model;
    Engine engine;
    double weight;
    String color;

    public Car(String model, Engine engine, double weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, Engine engine) {
        this(model, engine, -1, "n/a");

    }

    public Car(String model, Engine engine, double weight) {
        this(model, engine, weight, "n/a");
    }

    public Car(String model, Engine engine, String color) {
        this(model, engine, -1, color);
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        String weightAsString = "";
        if (this.weight == -1) {
            weightAsString = "n/a";
            return weightAsString;
        }
        return String.format("%.0f", weight);
    }
}
