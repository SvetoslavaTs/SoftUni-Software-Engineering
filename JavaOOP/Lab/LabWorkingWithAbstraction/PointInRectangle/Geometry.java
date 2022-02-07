package LabWorkingWithAbstraction.PointInRectangle;

public class Geometry {
    public static Rectangle createRectangle(int[] coordinatesOfRectangle) {
        return new Rectangle(createPoint(coordinatesOfRectangle[0], coordinatesOfRectangle[1]),
                createPoint(coordinatesOfRectangle[2], coordinatesOfRectangle[3]));
    }

    public static Point createPoint(int x, int y) {
        return new Point(x, y);
    }

    public static Point createPoint(int[] pointInfo) {
        if (pointInfo.length != 2) {
            throw new IllegalStateException("Point can be created only by two coordinates - X and Y");
        }
        return new Point(pointInfo[0], pointInfo[1]);
    }
}
