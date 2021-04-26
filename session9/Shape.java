package session9;

public class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public double getArea() {
        System.out.println("deo hieu!");
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
