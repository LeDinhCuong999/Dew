package session12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double sum=0;
        int intArray[] = new int[5];

        System.out.println("Enter 5 integer values: ");
        for (int i=0; i<5; i++) {
            Scanner scan = new Scanner(System.in);
            intArray[i] = scan.nextInt();
        }

        for (int i=0; i<5; i++) {
            System.out.println("Element " + i + ", type value was " + intArray[i]);
            sum+=intArray[i];
        }

        System.out.println("Average is: " + sum/5);
    }
}
