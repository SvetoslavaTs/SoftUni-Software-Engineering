package ExercisesDefiningClasses.CarSalesman;

public class Engine {
    String model;
    int power;
    int displacement;
    String efficiency;

    public Engine(String model, int power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public Engine(String model, int power) {
        this(model, power, -1, "n/a");
    }

    public Engine(String model, int power, int displacement) {
        this(model, power, displacement, "n/a");
    }

    public Engine(String model, int power, String efficiency) {
        this(model, power, -1, efficiency);
    }

    @Override
    public String toString() {
        String displacementAsString = "";
        if (displacement == -1) {
            return displacementAsString = "n/a";
        }
        return String.format("%d", displacement);
    }
}
