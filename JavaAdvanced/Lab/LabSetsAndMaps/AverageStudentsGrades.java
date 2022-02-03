package SetsAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsRecord = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            studentsRecord.putIfAbsent(input[0], new ArrayList<>());
            studentsRecord.get(input[0]).add(Double.parseDouble(input[1]));

        }
        studentsRecord.entrySet().forEach(entry -> {
            double sum = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                sum += entry.getValue().get(i);
            }
            double avg = sum / entry.getValue().size();

            System.out.print(entry.getKey() + " -> ");
            entry.getValue().forEach(v -> System.out.printf("%.2f ", v));
            System.out.printf("(avg: %.2f)%n", avg);
        });


//        studentsRecord.entrySet().forEach(entry -> {
//            System.out.print(entry.getKey() +" -> ");
//            entry.getValue().stream().forEach(v-> System.out.printf("%.2f ", v));
//            double avg = entry.getValue().stream().mapToDouble(e->e).average().orElse(0d);
//            System.out.printf("(avg: %.2f)",avg);
//            System.out.println();
//        });

//            studentsRecord.forEach((student, grades) -> {
//                String allGrades = grades.stream()
//                        .map(g -> String.format("%.2f", g))
//                        .collect(Collectors.joining(" "));
//                double avg = grades.stream().mapToDouble(e -> e).average().orElse(0d);
//                System.out.println(String.format("%s -> %s (avg: %.2f)", student, allGrades, avg));
//            });
    }
}
