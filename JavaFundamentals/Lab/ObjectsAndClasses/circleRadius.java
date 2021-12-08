package LabObjectsAndClasses;


public class circleRadius {
    private static Object Circle;

    static class Circle {
        double radius;

        Circle() {
            this(0);
        }

        Circle(double radius) {
            this.radius = radius;
        }

        double getArea() {
            return radius * radius * Math.PI;
        }

        void scale(double factor) {
            radius *= factor;
        }

        double getRadius() {
            return this.radius;
        }

        void setRadius(double radius) {
            this.radius = radius;
        }

    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c.getArea());
        c.setRadius(10);
        System.out.println(c.getArea());

        Circle c2 = new Circle(4);
        c2.scale(3);
        System.out.println(c2.getArea());

        Circle x = new Circle();
        System.out.println(x.getArea());

    }
}
