package session14;

import java.sql.*;

public class JdbcSelectTest {
    public static void main(String[] args) {
        try (
                // Step 1: Allocate a database 'Connection' object
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");   // For MySQL only
                // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"

                // Step 2: Allocate a 'Statement' object in the Connection
                Statement stmt = conn.createStatement();
        ) {
            // Step 3: Execute a SQL SELECT query. The query result is returned in a 'ResultSet' object.
            String strSelect = "select title, price, qty from books";
            System.out.println("The SQL statement is: " + strSelect + "\n"); // Echo For debugging

            ResultSet rset = stmt.executeQuery(strSelect);

            // Step 4: Process the ResultSet by scrolling the cursor forward via next().
            //  For each row, retrieve the contents of the cells with getXxx(columnName).
            System.out.println("The records selected are:");
            int rowCount = 0;
            while(rset.next()) {   // Move the cursor to the next row, return false if no more row
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                int    qty   = rset.getInt("qty");
                System.out.println(title + ", " + price + ", " + qty);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);






// Kết hợp làm Ex1:
            {
                String strSelect1 = "select * from books";
                System.out.println("The SQL statement is: " + strSelect1 + "\n");
                ResultSet rset1 = stmt.executeQuery(strSelect1);

                System.out.println("The records select are:");
                int rowCount1 = 0;
                while (rset1.next()) {
                    int id = rset1.getInt("id");
                    String title = rset1.getString("title");
                    String author = rset1.getString("author");
                    double price = rset1.getDouble("price");
                    int qty = rset1.getInt("qty");
                    System.out.println(id + ", " + title + ", " + author + ", " + price + ", " + qty);
                    ++rowCount1;
                }
                System.out.println("Total number of records = " + rowCount1);


                String strSelect2 = "select title, price from books where author = 'CodeLean VN' ";
                System.out.println("The SQL statement is: " + strSelect2 + "\n");
                ResultSet rset2 = stmt.executeQuery(strSelect2);

                System.out.println("The records select are:");
                int rowcount2 = 0;
                while (rset2.next()) {
                    String title = rset2.getString("title");
                    double price = rset2.getDouble("price");
                    System.out.println(title + "," + price);
                    ++rowcount2;
                }
                System.out.println("Total number of records = " + rowcount2);


                String strSelect3 = "select title, author, price, qty from books where author = 'CodeLean VN' or price >= 30 order by price DESc, id ASC";
                System.out.println("The SQL statement is: " + strSelect3 + "\n");
                ResultSet rset3 = stmt.executeQuery(strSelect3);

                System.out.println("The records select are:");
                int rowcount3 = 0;
                while (rset3.next()) {
                    String title = rset1.getString("title");
                    String author = rset1.getString("author");
                    double price = rset1.getDouble("price");
                    int qty = rset1.getInt("qty");
                    System.out.println(title + ", " + author + ", " + price + ", " + qty);
                    ++rowcount3;
                }
                System.out.println("Total number of records = " + rowcount3);
            }

        } catch(SQLException ex) {
            ex.printStackTrace();
        }  // Step 5: Close conn and stmt - Done automatically by try-with-resources (JDK 7)
    }
}
