package session7;

import java.util.Scanner;

public class Time {

    private byte hours;
    private byte minutes;

    public Time(byte hours, byte minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return hours + ":" + minutes;
    }
}
