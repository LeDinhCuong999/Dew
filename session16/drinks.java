package session16;

import java.sql.*;
import java.util.Scanner;

public class drinks {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/drink", "root", "");
                PreparedStatement pstmt = conn.prepareStatement("insert into drinks values (?, ?, ?, ?, ?)");
                PreparedStatement pstmtSelect = conn.prepareStatement("select * from drinks");
        ) {
            boolean quit = false;
            while(!quit){
                System.out.println("\nEnter action: (6 to show available actions");
                int action = Integer.parseInt(scanner.nextLine());
                scanner.nextLine();
                switch (action){
                    case 1:
                        System.out.println("Danh sách đồ uống");
                        ResultSet rset = pstmt.executeQuery( "select * from drinks" );
                        ResultSetMetaData rsetMD = rset.getMetaData();
                        int numColumn = rsetMD.getColumnCount();
                        for (int i = 1; i <= numColumn; ++i) {
                            System.out.printf( "%-30s", rsetMD.getColumnName( i ) );
                        }
                        System.out.println();

                        while (rset.next()) {
                            for (int i = 1; i <= numColumn; ++i) {
                                System.out.printf( "%-30s", rset.getString( i ) );
                            }
                            System.out.println();
                        }
                        break;
                    case 2:
                        System.out.println("Ten cua do uong ban muon them:");
                        String dName = scanner.nextLine();
                        System.out.println("id:");
                        int dId = Integer.parseInt(scanner.nextLine());
                        System.out.println("thuong hieu:");
                        String dBrand = scanner.nextLine();
                        System.out.println("gia tien:");
                        double dPrice = Integer.parseInt( scanner.nextLine());
                        System.out.println("so luong:");
                        int dQty = Integer.parseInt( scanner.nextLine());
                        pstmt.setInt(1, dId);
                        pstmt.setString(2, dName);
                        pstmt.setString(3, dBrand);
                        pstmt.setDouble(4, dPrice);
                        pstmt.setInt(5, dQty);
                        int rowsInserted = pstmt.executeUpdate();
                        System.out.println(rowsInserted + "Them do uong moi thanh cong!");


                        ResultSet rset1 = pstmt.executeQuery( "select * from drinks" );
                        ResultSetMetaData rsetMD1 = rset1.getMetaData();
                        int numColumn1 = rsetMD1.getColumnCount();
                        for (int i = 1; i <= numColumn1; ++i) {
                            System.out.printf( "%-30s", rsetMD1.getColumnName( i ) );
                        }
                        System.out.println();

                    while (rset1.next()) {
                        for (int i = 1; i <= numColumn1; ++i) {
                           System.out.printf( "%-30s", rset1.getString( i ) );
                        }
                        System.out.println();
                   }
                        break;
                    case 3:
                        System.out.println("Ten cua do uong ban muon them:");
                        String nName = scanner.nextLine();
                        System.out.println("id:");
                        int nId = Integer.parseInt(scanner.nextLine());
                        System.out.println("thuong hieu:");
                        String nBrand = scanner.nextLine();
                        System.out.println("gia tien:");
                        double nPrice = Integer.parseInt( scanner.nextLine());
                        System.out.println("so luong:");
                        int nQty = Integer.parseInt( scanner.nextLine());

                        String update = "update drinks"+"set nName=?,nBrand=?,nPrice=?,nQty=?"+"where id=?";
                        PreparedStatement pstmt3 = conn.prepareStatement( update );
                        conn.setAutoCommit( false );
                        pstmt3.setString( 1,nName );
                        pstmt3.setInt( 3,nId );
                        pstmt3.setString( 2,nBrand );
                        pstmt3.setDouble( 4,nPrice );
                        pstmt3.setInt(5,nQty);
                        pstmt3.addBatch();
                        System.out.println("Đồ uống đã được cập nhật thành công");
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("Ten do uong can xoa:");
                        String name4 = scanner.nextLine();
                        String delete = "DELETE FROM drinks WHERE name ='"+name4+"';";
                        PreparedStatement pstmt4 = conn.prepareStatement(delete);
                        pstmt4.executeUpdate();
                        System.out.println("DELETED!");
                        break;
                }
            }



        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
