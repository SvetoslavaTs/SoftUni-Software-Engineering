package LabObjectsAndClasses;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class student1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Student> students = new ArrayList<>();

        while (!input.equals("end")) {
            String[] studentParameters = input.split(" ");
            Student s = new Student(studentParameters[0], studentParameters[1],
                    Integer.parseInt(studentParameters[2]), studentParameters[3]);
            if (isStudentExisting(students, studentParameters[0], studentParameters[1])) {
                Student student = getStudent(students, studentParameters[0], studentParameters[1]);
                student.setFirstName(studentParameters[0]);
                student.setLastName(studentParameters[1]);
                student.setAge(Integer.parseInt(studentParameters[2]));
                student.setHometown(studentParameters[3]);
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

    private static Student getStudent(List<Student> students, String firstName, String lastName) {
        Student existingStudent = null;
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
            }
        }
        return existingStudent;
    }

    private static boolean isStudentExisting(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
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

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }
    }
}
