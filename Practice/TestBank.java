package Practice;

import java.util.Scanner;

public class TestBank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bank bank = new Bank(1000,10);
        System.out.println(bank.toString());
        System.out.println("Enter the balance: ");
        double balance = scan.nextDouble();
        System.out.println("Enter the rate: ");
        double rate = scan.nextDouble();
        Bank bank1 = new Bank(balance, rate);
        System.out.println(bank1.toString());
    }
}
