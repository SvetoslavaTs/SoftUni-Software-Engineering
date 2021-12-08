package ExerciseObjectAndClasses;

import java.util.*;
import java.util.stream.Collectors;

public class vehicleCatalogue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Vehicle> allVehicle = new ArrayList<>();

        while (!input.equals("End")) {
            String[] vehicleData = input.split(" ");
            Vehicle currentVehicle = new Vehicle(vehicleData[0], vehicleData[1],
                    vehicleData[2], Integer.parseInt(vehicleData[3]));
            allVehicle.add(currentVehicle);
            input = scanner.nextLine();
        }

        String searchedModel = scanner.nextLine();
        while (!searchedModel.equals("Close the Catalogue")) {
            for (Vehicle vehicle : allVehicle) {
                if (vehicle.getModel().equals(searchedModel)) {
                    System.out.print(vehicle.toString());
                }
            }
            searchedModel = scanner.nextLine();
        }

        List<Vehicle> onlyCars = allVehicle.stream().filter((vehicle -> vehicle.getType().equals("car")))
                .collect(Collectors.toList());
        double sumCarsHorsepower = onlyCars.stream().mapToDouble(Vehicle::getHorsepower).sum();
        List<Vehicle> onlyTrucks = allVehicle.stream().filter(vehicle -> vehicle.getType().equals("truck"))
                .collect(Collectors.toList());
        double sumTrucksHorsepower = onlyTrucks.stream().mapToDouble(Vehicle::getHorsepower).sum();

        if (onlyCars.size() > 0) {
            System.out.printf(Locale.getDefault(), "Cars have average horsepower of: %.2f.%n",
                    (double) sumCarsHorsepower / onlyCars.size());
        } else {
            System.out.println("Cars have average horsepower of: 0.00.".toString());
        }
        if (onlyTrucks.size() > 0) {
            System.out.printf(Locale.getDefault(), "Trucks have average horsepower of: %.2f.",
                    (double) sumTrucksHorsepower / onlyTrucks.size());
        } else {
            System.out.println("Trucks have average horsepower of: 0.00.".toString());
        }


    }

    static class Vehicle {
        String type;
        String model;
        String color;
        double horsepower;

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

        public double getHorsepower() {
            return horsepower;
        }

        @Override
        public String toString() {
            return String.format(Locale.getDefault(), "Type: %s%nModel: %s%nColor: %s%nHorsepower: %.0f%n",
                    getType().toUpperCase().charAt(0) + getType().substring(1), getModel(), getColor(), getHorsepower());
        }
    }
}
