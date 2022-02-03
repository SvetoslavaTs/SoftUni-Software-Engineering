package ExercisesStreamsFilesAndDirectories;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializeArrayList {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream
                ("src/ExercisesStreamsFilesAndDirectories/resources//list.ser"));

        List<Double> list = new ArrayList<>();
        list.add(5.5);
        list.add(5.6);
        list.add(5.7);
        list.add(5.8);
        list.add(5.9);

        outputStream.writeObject(list);
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream
                (new FileInputStream("src/ExercisesStreamsFilesAndDirectories/resources//list.ser"));
        List<Double> copiedList = (List<Double>) inputStream.readObject();
        inputStream.close();
        for (Double aDouble : copiedList) {
            System.out.println(aDouble);
        }

    }
}
