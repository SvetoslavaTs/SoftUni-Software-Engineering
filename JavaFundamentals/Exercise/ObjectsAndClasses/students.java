package ExerciseObjectAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Student> allStudents = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            Student currentStudent = new Student(input[0], input[1], Double.parseDouble(input[2]));
            allStudents.add(currentStudent);
        }
        allStudents.stream()
                .sorted((a, b) -> Double.compare(b.getGrade(), a.getGrade()))
                .forEach(student -> System.out.println(student.toString()));
    }

    static class Student {
        String firstName;
        String lastName;
        double grade;

        Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public double getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f",
                    getFirstName(), getLastName(), getGrade());
        }
    }
}
