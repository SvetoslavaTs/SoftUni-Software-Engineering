package LabStreamsFilesAndDirectories;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationAndDeserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Serialization:
        ObjectOutputStream outputStream =
                new ObjectOutputStream(new FileOutputStream("List.txt"));

        List<String> names = new ArrayList<>();
        names.add("Pesho");
        names.add("Gosho");
        names.add("Sveti");

        outputStream.writeObject(names);
        outputStream.close();
        //Deserialization:

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("List.txt"));


        Object o = inputStream.readObject();
        List<String> nameRed = ((List<String>) o);
        for (String s : nameRed) {
            System.out.println(s);

        }


    }
}
