package ExercisesDefiningClasses.CarSalesman;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Engine> engineList = new LinkedList<>();
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            Engine engine;
            if (tokens.length == 2) {
                engine = new Engine(tokens[0], Integer.parseInt(tokens[1]));
            } else if (tokens.length == 4) {
                engine = new Engine(tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), tokens[3]);
            } else {
                if (tokens[2].matches("^\\d+$")) {
                    engine = new Engine(tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                } else {
                    engine = new Engine(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                }
            }
            engineList.add(engine);
        }
        int m = Integer.parseInt(scanner.nextLine());
        List<Car> carList = new LinkedList<>();
        Car car;
        while (m-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            Predicate<String> predicate = s -> s.equals(tokens[1]);

            Engine engine1 = null;
            for (Engine engine : engineList) {
                if (predicate.test(engine.model)) {
                    engine1 = engine;
                }
            }

            if (tokens.length == 2) {
                car = new Car(tokens[0], engine1);
            } else if (tokens.length == 4) {

                car = new Car(tokens[0], engine1, Double.parseDouble(tokens[2]), tokens[3]);
            } else {
                if (tokens[2].matches("^\\d+$")) {
                    car = new Car(tokens[0], engine1, Double.parseDouble(tokens[2]));
                } else {
                    car = new Car(tokens[0], engine1, tokens[2]);
                }
            }
            carList.add(car);
        }
        System.out.println();
        carList.forEach(c -> System.out.print(String.format
                ("%s:%n%s:%nPower: %d%nDisplacement: %s%nEfficiency: %s%nWeight: %s%nColor: %s%n",
                        c.getModel(), c.getEngine().model, c.getEngine().power, c.getEngine().toString(),
                        c.getEngine().efficiency, c.toString(), c.getColor())));
    }
}
