package university;

import java.util.ArrayList;
import java.util.List;

public class University {
    public int capacity;
    public List<Student> students;

    public University(int capacity) {
        this.capacity = capacity;
        this.students = new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public int getStudentCount() {
        return students.size();
    }

    public String registerStudent(Student student) {
        if (this.students.contains(student)) {
            return "Student is already in the university";
        }
        if (this.capacity > this.students.size()) {
            this.students.add(student);
            return String.format("Added student %s %s",
                    student.getFirstName(), student.getLastName());
        } else {
            return "No seats in the university";
        }
    }

    public String dismissStudent(Student student) {
        StringBuilder sb = new StringBuilder();

        if (this.students.contains(student)) {
            sb.append(String.format("Removed student %s %s",
                    student.getFirstName(), student.getLastName()));
            this.students.remove(student);
        } else {
            sb.append("Student not found");
        }
        return sb.toString().trim();
    }

    public Student getStudent(String firstName, String lastName) {
        return this.getStudents().stream().filter(s -> s.getFirstName().equals(firstName)
                && s.getLastName().equals(lastName))
                .findFirst().orElse(null);

    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        for (Student student : this.students) {
            sb.append(String.format("==Student: First Name = %s, " +
                            "Last Name = %s, " +
                            "Best Subject = %s",
                    student.getFirstName(), student.getLastName(), student.getBestSubject()))
                    .append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
