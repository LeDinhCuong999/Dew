package session14;
import java.sql.*;
import java.util.Scanner;
public class Ex2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter name you want to search:");
        String name = scanner.nextLine();
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            String customer2 = "select * from customers \nWHERE ContactName='"+name+"';";
            System.out.println("The SQL statement is: "+ customer2+"\n");
            ResultSet rset2 = stmt.executeQuery(customer2);
            while (rset2.next()){
                String CustomerID = rset2.getString("CustomerID");
                String CompanyName = rset2.getString("CompanyName");
                String ContactName = rset2.getString("ContactName");
                String ContactTitle = rset2.getString("ContactTitle");
                String Address      = rset2.getString("Address");
                String City = rset2.getString("City");
                String Region = rset2.getString("Region");
                String PostalCode = rset2.getString("PostalCode");
                String Country = rset2.getString("Country");
                String Phone = rset2.getString("Phone");
                String 	Fax = rset2.getString("Fax");
                System.out.println(CustomerID+" , "+CompanyName+" , "+
                        ContactName+" , "+ContactTitle+" , "+Address+" , "+
                        City+" , "+Region+" , "+PostalCode+" , "+Country+" , "+
                        Phone+" , "+Fax);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}

