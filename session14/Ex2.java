package session14;

import java.sql.*;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter name you want to search:");
        String name = scanner.nextLine();
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        )
        //1.
        {
            String customer1 = "select * from customrs";
            System.out.println("The SQL statement is: " + customer1 + "\n");
            ResultSet rset1 = stmt.executeQuery(customer1);

            while (rset1.next()) {
                String CustomerID = rset1.getString("CustomerID");
                String CompanyName = rset1.getString("CompanyName");
                String ContactName = rset1.getString("ContactName");
                String ContactTitle = rset1.getString("ContactTitle");
                String Address = rset1.getString( "Address" );
                String City = rset1.getString( "City" );
                String Region = rset1.getString( "Region" );
                String PostalCode = rset1.getString( "PostalCode" );
                String Country = rset1.getString( "Country" );
                String Phone = rset1.getString( "Phone" );
                String Fax = rset1.getString( "Fax" );
                System.out.println(CustomerID + ", " + CompanyName + ", " + ContactName + ", " + ContactTitle + ", " + Address + ", " + City + ", " + Region + ", " + PostalCode + ", " + Country + ", " + Phone + ", " + Fax);
            }

        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
