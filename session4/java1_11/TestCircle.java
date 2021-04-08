package session4.java1_11;

public class TestCircle {

    public static void main(String[] args) {

        Circle c1 = new Circle(5.0);
        System.out.println("The circle has radius of "
            + c1.getRadius() + " and area of " + c1.getArea());
        System.out.println(c1.toString());

        Circle c2 = new Circle(1.2);
        System.out.println("The circle has radius of "
            + c2.getRadius() + " and area of " + c2.getArea());
        System.out.println(c2.toString());  // explicit call
        System.out.println(c2);             // println() calls toString() implicitly, same as above
        System.out.println("Operator '+' invokes toString() too: " + c2);   // '+' invokes toString() too

        Circle c4 = new Circle();
        c4.setRadius(5.0);
        System.out.println("radius is: " + c4.getRadius());
        c4.setColor("pink");
        System.out.println("color is: " + c4.getColor());
    }
}
