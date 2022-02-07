package LabWorkingWithAbstraction.PointInRectangle;

import LabWorkingWithAbstraction.IOUtils.ConsoleReader;
import LabWorkingWithAbstraction.IOUtils.InputParser;

public class Main {
    public static void main(String[] args) {
        ConsoleReader reader = new ConsoleReader();
        int[] coordinatesOFRectangle = InputParser.parseArray(reader.readLine(), "\\s+");
        Rectangle rectangle = Geometry.createRectangle(coordinatesOFRectangle);
        int n = Integer.parseInt(reader.readLine());

        while (n-- > 0) {
            int[] pointInfo = InputParser.parseArray(reader.readLine(), "\\s+");

            Point point = Geometry.createPoint(pointInfo);

            System.out.println(rectangle.contains(point));


        }


    }


}
