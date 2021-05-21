package practice2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
            boolean quit = false;
            while (!quit) {
                System.out.println("\nEnter action: (4 to show available actions");
                int action = scanner.nextInt();
                scanner.nextLine();
                switch (action) {
                    case 1:
                        addrecords();
                        break;

                    case 2:
                        displayrecords();
                        break;

                    case 3:
                        saverecords();
                        break;

                    case 4:
                        exit();
                        break;
                }
            }
        }

    }

    private static void addrecords() {
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
        if (StudentList.addNewStudent(newStudent)) {
            System.out.println("New contract adder: name=" + name + "");
    } else {
            System.out.println("Cannot add," + name + "already on file");
        }

    private static void displayrecords() {
        System.out.println("2.Display all students in the collection: ");

    }

    private static void saverecords() {

    }

    private static void exit() {

    }
}
