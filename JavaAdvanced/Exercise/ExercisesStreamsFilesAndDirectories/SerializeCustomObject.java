package ExercisesStreamsFilesAndDirectories;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializeCustomObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream
                ("src/ExercisesStreamsFilesAndDirectories/resources//course.ser"));
        Course currentCourse = new Course("JavaAdvances", 200);
        outputStream.writeObject(currentCourse);
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream
                (new FileInputStream("src/ExercisesStreamsFilesAndDirectories/resources//course.ser"));
        Course deserializedCourse = (Course) inputStream.readObject();
        System.out.println(deserializedCourse);
        inputStream.close();

    }

    public static class Course implements Serializable {
        private String name;
        private int numberOfStudents;

        public Course(String name, int numberOfStudents) {
            this.name = name;
            this.numberOfStudents = numberOfStudents;
        }

        @Override
        public String toString() {
            return "Course name = " + name +
                    ", numberOfStudents = " + numberOfStudents;
        }
    }

}
