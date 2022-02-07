package ExercisesInheritance.Animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();
        String typeOfAnimal = scanner.nextLine();
        while (!typeOfAnimal.equals("Beast!")) {
            String[] nameAgeGender = scanner.nextLine().split("\\s+");
            String name = nameAgeGender[0];
            int age = Integer.parseInt(nameAgeGender[1]);
            String gender = nameAgeGender[2];

            try {
                switch (typeOfAnimal) {
                    case "Cat":
                        Cat cat = new Cat(name, age, gender);
                        animals.add(cat);
                        break;
                    case "Dog":
                        Dog dog = new Dog(name, age, gender);
                        animals.add(dog);
                        break;
                    case "Frog":
                        Frog frog = new Frog(name, age, gender);
                        animals.add(frog);
                        break;
                    case "Kitten":
                        Kitten kitten = new Kitten(name, age);
                        animals.add(kitten);
                        break;
                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(name, age);
                        animals.add(tomcat);
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            typeOfAnimal = scanner.nextLine();
        }

        animals.forEach(a -> System.out.println(a.toString()));
    }
}
