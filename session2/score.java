package session2;

import java.util.Scanner;

public class score {
    public static void main(String[] args) {

        int Maths, Science, English, Total, Percentage;

        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap diem Maths:");
        Maths = scan.nextInt();
        System.out.println("Nhap diem Science:");
        Science = scan.nextInt();
        System.out.println("Nhap diem English:");
        English = scan.nextInt();

        System.out.println("Marks of Dew:");
        System.out.printf("Maths = %d \n", Maths);
        System.out.printf("Science = %d \n", Science);
        System.out.printf("English = %d \n", English);

        Total = Maths + Science + English;
        System.out.printf("Tong diem cua Dew = %d \n", Total);
        Percentage = Total*100/300;
        System.out.println("Percentage =" + Percentage + "%");

        if(Percentage>75%)
            System.out.println("Hoc bong 20000$");

    }
}
