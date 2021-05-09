package session12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Temperatures {
    public static void main(String[] args) {
        double sum=0;
        int j=0;

        System.out.println("How many days' temperatures? ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int temperatures[]  = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Day" + (i+1) + "'s high temp: ");
            Scanner y = new Scanner(System.in);
            temperatures[i] = y.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sum+= temperatures[i];
        }
        System.out.println("Average = " + sum/n);

        for (int i = 0; i < n; i++) {
            if (temperatures[i] > (sum/n))
                j = j + 1;
        }
        System.out.printf("%d days above Average", j);
    }
}
