package ExercisesDefiningClasses.RawData;

import java.util.ArrayList;
import java.util.List;

public class Car {
    String model;
    int engineSpeed;
    int enginePower;
    int cargoWeight;
    String cargoType;
    List<Tire> tires;

    public Car(String model, int engineSpeed, int enginePower, int cargoWeight, String cargoType, List<Tire> tires) {
        this.model = model;
        this.engineSpeed = engineSpeed;
        this.enginePower = enginePower;
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
        this.tires = new ArrayList<>();
    }

    public String getModel() {
        return model;
    }

    public int getEngineSpeed() {
        return engineSpeed;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public String getCargoType() {
        return cargoType;
    }

    public List<Tire> getTires() {
        return tires;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineSpeed(int engineSpeed) {
        this.engineSpeed = engineSpeed;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public void setTires(List<Tire> tires) {
        this.tires = tires;
    }

}
