package session8;

public class Cylinder2 extends Circle {

    private double height;

    public Cylinder2() {
        super(2.5, "blue");
        System.out.println("This is a Cylinder2");
        this.height = 10;
    }

    @Override
    public String toString() {
        return "Cylinder2{" +
                "height=" + height +
                '}';
    }
}
