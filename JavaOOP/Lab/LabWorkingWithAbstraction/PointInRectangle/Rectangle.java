package LabWorkingWithAbstraction.PointInRectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point upRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = upRight;
    }

    public boolean contains(Point point) {
        return point.isGreaterOrEqualByX(bottomLeft)
                && point.isLowerOrEqualByX(topRight)
                && point.isGreaterOrEqualByY(bottomLeft)
                && point.isLowerOrEqualByY(topRight);
    }

}
