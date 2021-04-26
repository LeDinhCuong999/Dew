package session9;

abstract public class DemoAbstract {

    private String color;

    public DemoAbstract(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "DemoAbstract{" +
                "color='" + color + '\'' +
                '}';
    }

    abstract public double getArea();
}
