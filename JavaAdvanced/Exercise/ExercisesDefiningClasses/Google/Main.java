package ExercisesDefiningClasses.Google;

import java.time.Instant;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Person> personsInfo = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            String typeInfo = tokens[1];
            if (typeInfo.equals("company")) {
                Company company = new Company(tokens[2], tokens[3], Double.parseDouble(tokens[4]));
                personsInfo.putIfAbsent(name, new Person());
                personsInfo.get(name).setCompany(company);
            } else if (typeInfo.equals("car")) {
                Car car = new Car(tokens[2], Integer.parseInt(tokens[3]));
                personsInfo.putIfAbsent(name, new Person());
                personsInfo.get(name).setCar(car);
            } else if (typeInfo.equals("pokemon")) {
                Pokemon pokemon = new Pokemon(tokens[2], tokens[3]);
                personsInfo.putIfAbsent(name, new Person());
                personsInfo.get(name).getPokemons().add(pokemon);
            } else if (typeInfo.equals("parents")) {
                Parent parent = new Parent(tokens[2], (tokens[3]));
                personsInfo.putIfAbsent(name, new Person());
                personsInfo.get(name).getParents().add(parent);
            } else if (typeInfo.equals("children")) {
                Child child = new Child(tokens[2], (tokens[3]));
                personsInfo.putIfAbsent(name, new Person());
                personsInfo.get(name).getChildren().add(child);
            }


            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        System.out.println(input);

        if (personsInfo.get(input).getCar() == null) {
            System.out.println("Car:");
        } else {
            System.out.printf("Car:%n%s%n", personsInfo.get(input).getCar());
        }
        System.out.println("Pokemon:");
        personsInfo.get(input).getPokemons().forEach(System.out::println);
        System.out.println("Parents:");
        personsInfo.get(input).getParents().forEach(System.out::println);
        System.out.println("Children:");
        personsInfo.get(input).getChildren().forEach(System.out::println);
    }
}
