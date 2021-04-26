package session7;

import java.util.Scanner;

public class TestFlightTicket {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter departure date (mm dd yyyy):");
        byte month = scan.nextByte();
        byte day = scan.nextByte();
        short year = scan.nextShort();
        Date d = new Date(day,month,year);

        System.out.println("Enter departure time (hh mm):");
        byte hour = scan.nextByte();
        byte minutes = scan.nextByte();
        Time t = new Time(hour,minutes);

        System.out.println("Enter the type of cabin:");
        System.out.println("1.Business");
        System.out.println("2.First");
        System.out.println("3.Economy");
        byte typeOfCabin = scan.nextByte();
        System.out.println("Enter the number of tickets:");
        byte noOfTicket = scan.nextByte();
        FlightTicket f = new FlightTicket(d, t, noOfTicket, typeOfCabin);
        f.displayTicketInformation();
    }
}
