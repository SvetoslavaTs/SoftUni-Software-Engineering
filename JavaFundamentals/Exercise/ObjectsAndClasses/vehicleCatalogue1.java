package ExerciseObjectAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class vehicleCatalogue1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Vehicle> allVehicles = new ArrayList<>();

        while (!input.equals("End")) {
            String[] vehicleData = input.split(" ");
            Vehicle currentVehicle = new Vehicle(vehicleData[0], vehicleData[1],
                    vehicleData[2], Integer.parseInt(vehicleData[3]));
            allVehicles.add(currentVehicle);
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("Close the Catalogue")) {
            String searchedModel = input;
            allVehicles.stream()
                    .filter(vehicle -> vehicle.getModel().equals(searchedModel))
                    .forEach(vehicle -> System.out.println(vehicle.toString()));

            input = scanner.nextLine();
        }

        List<Vehicle> onlyCars = allVehicles.stream().filter((vehicle -> vehicle.getType().equals("car")))
                .collect(Collectors.toList());

        List<Vehicle> onlyTrucks = allVehicles.stream().filter(vehicle -> vehicle.getType().equals("truck"))
                .collect(Collectors.toList());

        System.out.printf("Cars have average horsepower of: %.2f.%n", averageHorsepower(onlyCars));
        System.out.printf("Trucks have average horsepower of: %.2f.", averageHorsepower(onlyTrucks));


    }


    static class Vehicle {
        String type;
        String model;
        String color;
        int horsepower;

        Vehicle(String type, String model, String color, int horsepower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getHorsepower() {
            return horsepower;
        }

        @Override
        public String toString() {
            return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",
                    getType().toUpperCase().charAt(0) + getType().substring(1), getModel(), getColor(), getHorsepower());
        }
    }

    public static double averageHorsepower(List<Vehicle> vehicles) {
        if (vehicles.size() == 0) {
            return 0.0;
        }
        return vehicles.stream().mapToDouble(Vehicle::getHorsepower).sum() / vehicles.size();
    }

}


