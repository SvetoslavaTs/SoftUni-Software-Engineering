package ExercisesDefiningClasses.FamilyTree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String person = scanner.nextLine();
        String line = scanner.nextLine();
        List<String> parents = new LinkedList<>();
        Map<String, String> personWithBirthday = new LinkedHashMap<>();
        Person person1 = new Person();

        while (!line.equals("End")) {
            if (line.contains("-")) {
                parents.add(line);
            } else {
                String[] input = line.split("\\s+");
                String name = input[0] + " " + input[1];
                String birthday = input[2];
                personWithBirthday.putIfAbsent(name, birthday);
            }
            line = scanner.nextLine();
        }
        for (String p : parents) {
            String parent = p.split(" - ")[0];
            String child = p.split(" - ")[1];
            String parentName = "";
            String childName = "";

            if (!parent.contains("/")) {
                parentName = parent;
            } else {
                for (Map.Entry<String, String> entry : personWithBirthday.entrySet()) {
                    if (entry.getValue().equals(parent)) {
                        parentName = entry.getKey();
                        break;
                    }
                }
            }
            if (!child.contains("/")) {
                childName = child;
            } else {
                for (Map.Entry<String, String> entry : personWithBirthday.entrySet()) {
                    if (entry.getValue().equals(child)) {
                        childName = entry.getKey();
                        break;
                    }
                }
            }

            parents.set(parents.indexOf(p), (parentName + " - " + childName));


        }
        if (!person.contains("/")) {
            for (Map.Entry<String, String> entry : personWithBirthday.entrySet()) {
                if (person.equals(entry.getKey())) {
                    String birthday = entry.getValue();
                    person1 = new Person(person, birthday);
                    break;
                }
            }
        } else {
            for (Map.Entry<String, String> entry : personWithBirthday.entrySet()) {
                if (person.equals(entry.getValue())) {
                    String name = entry.getKey();
                    person1 = new Person(name, person);
                    break;
                }
            }
        }

        String personName = person1.getName();
        for (String parent : parents) {
            String[] currentParent = parent.split(" - ");
            if (personName.equals(currentParent[0])) {
                String currentChild = currentParent[1];
                for (Map.Entry<String, String> entry : personWithBirthday.entrySet()) {
                    if (entry.getKey().equals(currentChild)) {
                        String birthday = entry.getValue();
                        Person child = new Person(currentChild, birthday);
                        person1.getChildren().add(child);
                        break;
                    }
                }
            } else if (personName.equals(currentParent[1])) {
                String currParent = currentParent[0];
                for (Map.Entry<String, String> entry : personWithBirthday.entrySet()) {
                    if (entry.getKey().equals(currParent)) {
                        String birthday = entry.getValue();
                        Person parent1 = new Person(currParent, birthday);
                        person1.getParents().add(parent1);
                        break;
                    }
                }
            }
        }
        System.out.println(person1);
        System.out.println("Parents:");
        if (person1.getParents() != null) {
            for (Person p : person1.getParents()) {
                System.out.println(p.toString());
            }
        }
        System.out.println("Children:");
        if (person1.getChildren() != null) {
            for (Person c : person1.getChildren()) {
                System.out.println(c.toString());
            }
        }

    }
}
