package ExerciseObjectAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class orderByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<PersonalInfo> allPersons = new ArrayList<>();

        while (!input.equals("End")) {
            String[] tokens = input.split(" ");
            PersonalInfo currentPerson = new PersonalInfo(tokens[0], tokens[1], Integer.parseInt(tokens[2]));
            allPersons.add(currentPerson);
            input = scanner.nextLine();
        }
        allPersons
                .stream()
                .sorted((a, b) -> Integer.compare(a.getAge(), b.getAge()))
                .forEach(a -> System.out.println(a.toString()));
    }

    static class PersonalInfo {
        String name;
        String ID;
        int age;

        PersonalInfo(String name, String ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getID() {
            return ID;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.",
                    getName(), getID(), getAge());
        }
    }


}
