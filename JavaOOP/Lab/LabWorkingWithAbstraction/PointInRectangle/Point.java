package LabWorkingWithAbstraction.PointInRectangle;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isGreaterOrEqualByX(Point current) {
        return this.x >= current.x;
    }

    public boolean isLowerOrEqualByX(Point current) {
        return this.x <= current.x;
    }

    public boolean isEqualToX(Point current) {
        return this.x == current.x;
    }

    public boolean isGreaterOrEqualByY(Point current) {
        return this.y >= current.y;
    }

    public boolean isLowerOrEqualByY(Point current) {
        return this.y <= current.y;
    }

    public boolean isEqualToY(Point current) {
        return this.y == current.y;
    }
}
