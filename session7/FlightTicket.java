package session7;

public class FlightTicket {

    Date departureDate;
    Time departureTime;
    private byte noOfTicket;
    private double price = 1000;
    private double totalPrice;
    private byte typeOFCabin;

    public FlightTicket(Date departureDate, Time departureTime, byte noOfTicket, byte typeOFCabin) {
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.noOfTicket = noOfTicket;
        this.price = price;
        this.typeOFCabin = typeOFCabin;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(byte day, byte month, short year) {
        this.departureDate = departureDate;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public byte getNoOfTicket() {
        return noOfTicket;
    }

    public double getTotalPrice() {
        return totalPrice = noOfTicket * price;
    }

    public void displayTicketInformation() {
        System.out.println("Following is the information about the ticket(s) booked:");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Departure Date:" + departureDate);
        System.out.println("Departure Time:" + departureTime);
        System.out.println("Number of tickets:" + getNoOfTicket());
        if(typeOFCabin==1) {
            System.out.println("Type of cabin: Business class");
            this.price=5000;
        }
        else if(typeOFCabin==2) {
            System.out.println("Type of cabin: First class");
            this.price=4500;
        }
        else {
            System.out.println("Type of cabin: Economy class:");
            this.price=3500;
        }
        System.out.println("Total cost of the ticket: $" + getTotalPrice());

    }
}

























