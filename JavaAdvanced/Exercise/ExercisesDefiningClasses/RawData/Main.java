package ExercisesDefiningClasses.RawData;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new LinkedList<>();

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String model = tokens[0];
            int engineSpeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);
            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = (tokens[4]);

            List<Tire> tires = new ArrayList<>();

            Tire tire = new Tire(Double.parseDouble(tokens[5]), Integer.parseInt(tokens[6]),
                    Double.parseDouble(tokens[7]), Integer.parseInt(tokens[8]),
                    Double.parseDouble(tokens[9]), Integer.parseInt(tokens[10]),
                    Double.parseDouble(tokens[11]), Integer.parseInt(tokens[12]));
            tires.add(tire);
            Car car = new Car(model, engineSpeed, enginePower, cargoWeight, cargoType, tires);
            cars.add(car);
        }
        String command = scanner.nextLine();
        if (command.equals("fragile")) {
            cars.stream().filter(car -> car.getCargoType().equals("fragile"))
                    .filter(car -> {
                        List<Tire> tires = car.getTires();
                        for (Tire tire : tires) {
                            if (tire.getTire1Pressure() < 1) {
                                return true;
                            }
                        }
                        return false;
                    }).forEach(car -> System.out.println(car.getModel()));

        } else if (command.equals("flamable")) {
            cars.stream().filter(car -> car.getCargoType().equals("flamable"))
                    .filter(car -> car.getEnginePower() > 250)
                    .forEach(car -> System.out.println(car.getModel()));
        }
    }

}

