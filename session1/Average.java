package session1;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        // Declaring and initializing the variables
        float toan, ly, hoa, diemTB;

        // Initializing the variable
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap diem toan:");
        toan = scan.nextFloat();
        System.out.println("Nhap diem ly:");
        ly = scan.nextFloat();
        System.out.println("Nhap diem hoa:");
        hoa = scan.nextFloat();

        // Displaying the values of the variable.R
        diemTB = (toan + ly + hoa)/3;
        System.out.printf("Diem trung binh: %f", diemTB);
    }
}
