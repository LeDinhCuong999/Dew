package practice2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public  static  StudentList student = new StudentList("C123456");
    public static void main(String[] args) {
            boolean quit = false;

            while (!quit) {
                System.out.println("\nEnter action: (4 to show available actions");
                int action = scanner.nextInt();
                scanner.nextLine();
                switch (action) {
                    case 1:
                        addNewStudent();
                        break;

                    case 2:
                        student.printStudentList();
                        break;

                    case 3:
                        student.save();
                        break;

                    case 4:
                        System.out.println("Exit down");
                        quit = true;
                        break;
                }
            }
        }



    private static void addNewStudent() {
        System.out.println("1.Add records into a collection of students: ");
        System.out.println("Enter student id: ");
        String id = scanner.nextLine();
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter student address: ");
        String address = scanner.nextLine();
        System.out.println("Enter student phone: ");
        int phone = Integer.parseInt(scanner.nextLine());
        Student newStudent = Student.createStudent(id, name, address, phone);
        if (student.addNewStudent(newStudent)) {
            System.out.println("New Student Added: ID = "+ id + " , Name" + name+
                    ", Address = "+address+", Phone = "+phone);
    } else {
            System.out.println("Cannot add," + name + "already on file");
        }
    }
}
