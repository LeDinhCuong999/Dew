package session4.java1_10;

public class Circle {

    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }
    public Circle(double r) {
        radius = r;
        color = "red";
    }
    public  Circle(double r, String c) {
        radius = r;
        color = c;
    }

    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {

        Circle c1 = new Circle(2.0, "blue");
        System.out.println("The radius is: " + c1.getRadius());
        System.out.println("The color is: " + c1.getColor());
        System.out.println("The area is: %.2f%n" + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("The radius is: " + c2.getRadius());
        System.out.println("The  color is: " + c2.getColor());
        System.out.println("The area is: %.2f%n" + c2.getArea());

        Circle c3 = new Circle();
        System.out.println("The radius is: " + c3.getRadius());
        System.out.println("The color is: " + c3.getColor());
        System.out.println("The area is: %.2f%n" + c3.getArea());
    }
}

















