package session18.testcontroller;

import session18.testmodel.Users;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.Scanner;

public class Register {
    List<Users> usersList = new ArrayList<>();

    public List<Users> loading() {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testonline", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String select = "Select * from users";
            ResultSet rset = stmt.executeQuery(select);
            while (rset.next()) {
                Users obj = new Users();
                obj.setUserId(rset.getInt("UserId"));
                obj.setName(rset.getString("name"));
                obj.setPass(rset.getString("pass"));
                obj.setType(rset.getInt("type"));
                obj.setCreat(rset.getString("creat"));
                obj.setUpdates(rset.getString("updates"));
                usersList.add(obj);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return usersList;
    }

    public boolean signUp(Users users) {
        try (
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testonline", "root", "");
            Statement stmt = conn.createStatement();
        ) {
            String signUp = "insert into users(name,pass,type,creat) values('" + users.getName() + "','" + users.getPass() + "'," + users.getType() + "," + "CURRENT_DATE())";

            stmt.executeUpdate(signUp);
            loading();
            System.out.println("Signup successfully");
            return true;
    } catch (SQLException ex) {
        ex.printStackTrace();
        return false;
        }
    }
    public Users signIn() {
        Users obj = new Users();
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testonline", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = input.nextLine();
            System.out.println("Enter your pass: ");
            String pass = input.nextLine();
            String select = "Select * from users where name = '" + name + "' and pass = '" + pass + "' ";
            ResultSet rset = stmt.executeQuery(select);
            int row = 0;
            while (rset.next()) {
                int userId = rset.getInt("userId");
                name = rset.getString("name");
                pass = rset.getString("pass");
                int type = rset.getInt("type");
                String creat = rset.getString("creat");
                String updates = rset.getString("updates");
                obj = new Users(userId, name, pass, type, creat, updates);
                ++row;
            }
            if(row==0){
                System.out.println("Wrong name or pass");
            }else
                System.out.println("Sign in successfully");
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return obj;
    }public void displayUsers() {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testonline", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String stt = "Select * from users";
            ResultSet rset = stmt.executeQuery(stt);
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numColumn = rsetMD.getColumnCount();
            for (int i=1; i<=numColumn;i++){
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            loading();
            for (int i=0;i<usersList.size();i++) {
                System.out.println(usersList.get(i).toString());
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
