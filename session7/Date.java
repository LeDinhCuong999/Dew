package session7;

import java.util.Scanner;

public class Date {

    private byte day;
    private byte month;
    private short year;

    public Date(byte month, byte day, short year) {
        this.day = month;
        this.month = day;
        this.year = year;
    }

    @Override
    public String toString() {
        return month + "\\" + day + "\\" + year;
    }
}
