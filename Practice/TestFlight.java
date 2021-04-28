package Practice;

import java.util.Scanner;

public class TestFlight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Flight flight = new Flight(1080, "Everes");
        flight.display();
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
        System.out.println("Enter the destination: ");
        String destination = scan.next();
        Flight f1 = new Flight(number, destination);
        f1.display();
    }
}
