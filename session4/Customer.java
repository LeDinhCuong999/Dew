package session4;

public class Customer {
    // Declare instance variables
        int customerID;
        String customerName;
        int customerAge;
        String customerAddress;

    /* As main() method is a member of class, so it can access other
     * member of the class
     */

    public static void main(String[] args) {
        // Declares and instantiates an object of type Customer
            Customer objCustomer = new Customer();

        // Accesses the instance variables to store values
            objCustomer.customerID = 100;
            objCustomer.customerName = "John";
            objCustomer.customerAge = 30;
            objCustomer.customerAddress = "123 Street";

        // Displays the objCustomer1 object details
        System.out.println("Customer Identification Number: " + objCustomer.customerID);
        System.out.println("Customer Name: " + objCustomer.customerName);
        System.out.println("Customer Age: " + objCustomer.customerAge);
        System.out.println("Customer Address: " + objCustomer.customerAddress);
    }

    void changeCustomerAddress(String address) {
        customerAddress = address;
    }
    void displayCustomerInformation() {
        System.out.println("Customer Identification Number: " + customerID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Address: " + customerAddress);
        System.out.println("Customer Age: " + customerAge);
    }
}
