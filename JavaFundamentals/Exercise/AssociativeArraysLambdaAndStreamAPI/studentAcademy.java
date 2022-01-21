package ExercicesAssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class studentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> academy = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            List<Double> grades = academy.get(name);
            if (grades == null) {
                grades = new ArrayList<>();
                academy.put(name, grades);
                grades.add(grade);
            } else {
                grades.add(grade);
            }
        }
        Map<String, Double> avgGrades = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : academy.entrySet()) {
            double avg = entry.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
            if (avg >= 4.50) {
                avgGrades.put(entry.getKey(), avg);
            }
        }
        avgGrades.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .forEach(grade -> {
                    System.out.println(String.format("%s -> %.2f", grade.getKey(), grade.getValue()));
                });

    }
}
