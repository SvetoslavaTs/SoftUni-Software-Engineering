package LabObjectsAndClasses;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Student> students = new ArrayList<>();

        while (!input.equals("end")) {
            String[] studentParameters = input.split(" ");
            Student s = new Student(studentParameters[0], studentParameters[1],
                    Integer.parseInt(studentParameters[2]), studentParameters[3]);
            int existingIndex = findStudentIndex(students, s.getFirstName(), s.getLastName());
            if (existingIndex != -1) {
                students.get(existingIndex).setHometown(s.hometown);
                students.get(existingIndex).setAge(s.age);
            } else {
                students.add(s);
            }


            input = scanner.nextLine();
        }

        String searchHometown = scanner.nextLine();

        for (Student student : students) {
            if (student.getHometown().equals(searchHometown)) {
                System.out.printf("%s %s is %d years old%n",
                        student.getFirstName(), student.getLastName(), student.getAge());
            }
        }

    }

    static int findStudentIndex(List<Student> students, String firstName, String lastName) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFirstName().equals(firstName)
                    && (students.get(i).getLastName().equals(lastName))) {
                return i;
            }
        }
        return -1;
    }

    static class Student {
        String firstName;
        String lastName;
        int age;
        String hometown;

        public Student(String firstName, String lastName, int age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getHometown() {
            return hometown;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }
    }
}
