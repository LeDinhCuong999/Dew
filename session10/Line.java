package session10;

import session10.Shape;

public class Line extends Shape {

    private int length;
    public Line(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int value) {
        this.length = value;
    }

    public void draw() {
        for(int i=0; i<length; i++) {
            System.out.print("-");
        }
    }
}
