package ExercisesDefiningClasses.SpeedRacing;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            Car car = new Car(tokens[0], Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]));
            cars.add(car);
        }
        String line = scanner.nextLine();
        while (!line.equals("End")) {
            String[] command = line.split("\\s+");
            String model = command[1];
            double amountOfKm = Double.parseDouble(command[2]);
            for (Car car : cars) {
                if (car.getModel().equals(model)) {
                    car.DriveTheDistanceOrNot(amountOfKm);
                }
            }
            line = scanner.nextLine();
        }
        cars.forEach(car ->
                System.out.println(String.format("%s %.2f %.0f",
                        car.getModel(), car.getFuelAmount(), car.getDistanceTraveled())));
    }
}
