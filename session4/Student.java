package session4;

import java.util.Scanner;

public class Student {

        String studName;
        int studAge;

        void initialize()
        {
            studName = "James Anderson";
            studAge = 26;
        }

        void display()
        {
            System.out.println("Student Name: " + studName);
            System.out.println("Student Age: " + studAge);
        }

        void input()
        {
            System.out.println("Nhap ten cua ban: ");
            Scanner scan = new Scanner(System.in);
            studName = scan.nextLine();
            System.out.println("Nhap tuoi cua ban: ");
            studAge = scan.nextInt();
        }

        void iniriaLize2()
        {
            studName = "Fernando Torres";
            studAge = 37;
        }

    public static void main(String[] args)
    {
        Student objStudent = new Student();
        objStudent.initialize();
        objStudent.display();

        Student objStudent1 = new Student();
        objStudent1.input();
        objStudent1.display();

        Student objStudent2 = new Student();
        objStudent2.iniriaLize2();
        objStudent2.display();

        int ques;
        do {
            Student objStudent3 = new Student();
            objStudent3.input();
            objStudent3.display();
            System.out.println("Tiep tuc nhap du lieu?(1:YES - 2:NO");
            Scanner scan = new Scanner(System.in);
            ques = scan.nextInt();
        }while (ques == 2);
        System.out.println("Ket thuc truong chinh! Xin cam on!");
    }
}
