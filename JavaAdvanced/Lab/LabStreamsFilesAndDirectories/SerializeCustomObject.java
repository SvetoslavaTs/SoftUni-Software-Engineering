package LabStreamsFilesAndDirectories;

import java.io.*;

public class SerializeCustomObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Serialization:
        ObjectOutputStream outputStream =
                new ObjectOutputStream(new FileOutputStream("List.txt"));

        Cube car = new Cube("Kola", 154, 541, 800);
        outputStream.writeObject(car);
        outputStream.close();
        //Deserialization:

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("List.txt"));


        Object o = inputStream.readObject();
        Cube inputStreamCar = ((Cube) o);
        System.out.println(inputStreamCar);

    }

    public static class Cube implements Serializable {
        private String Colour;
        private double width;
        private double height;
        private double depth;

        public Cube(String colour, double width, double height, double depth) {
            Colour = colour;
            this.width = width;
            this.height = height;
            this.depth = depth;
        }

        @Override
        public String toString() {
            return "Cube{" +
                    "Colour='" + Colour + '\'' +
                    ", width=" + width +
                    ", height=" + height +
                    ", depth=" + depth +
                    '}';
        }
    }
}
