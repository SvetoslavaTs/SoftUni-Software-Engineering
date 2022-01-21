package ExercicesAssociativeArraysLambdaAndStreamAPI;

import java.text.Format;
import java.util.*;

public class courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();
        String input = scanner.nextLine();


        while (!input.equals("end")) {
            String[] tokens = input.split(" : ");
            String course = tokens[0];
            String studentsName = tokens[1];
            List<String> student = courses.get(course);
            if (student == null) {
                student = new ArrayList<>();
                courses.put(tokens[0], student);
                student.add(tokens[1]);
            } else {
                student.add(tokens[1]);
            }


            input = scanner.nextLine();
        }
        courses.entrySet().stream()
                .sorted((a, b) -> Integer.compare(b.getValue().size(), a.getValue().size()))
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    entry.getValue().stream().sorted((e1, e2) -> e1.compareTo(e2))
                            .forEach(e -> System.out.println(String.format("-- %s", e)));

                });

    }
}
