package practice2;
import practice2.Student;

import java.sql.*;
import java.util.AbstractList;
import java.util.ArrayList;

public class StudentList {
    private String myStudent;
    private AbstractList<Student> studentList;

    public StudentList(String myStudent) {
        this.myStudent = myStudent;
        this.studentList = new ArrayList<Student>();
    }

    public boolean addNewStudent(Student student){
        if(findStudent(student.getStudentId())>=0){
            System.out.println("Student is already on file");
        }
        studentList.add(student);
        return true;
    }

    private  int findStudent(Student student){
        return this.studentList.indexOf(student);
    }

    private int findStudent(String studentID){
        for(int i =0; i < studentList.size(); i++) {
            // Creating another temporary object to hold the name and compare
            Student student = this.studentList.get(i);
            if(student.getStudentId().equals(studentID)) {
                return i;
            }
        }
        return -1;
    }
    public void printStudentList() {
        System.out.println("StudentId     StudentName       Address                Phone");
        for(int i = 0; i < this.studentList.size(); i++) {
            System.out.println(
                    this.studentList.get(i).getStudentId() +"     "+
                            this.studentList.get(i).getStudentName()+ "       "+
                            this.studentList.get(i).getAddress() +"       "+
                            this.studentList.get(i).getPhone());
        }
    }

    public void save(){
        try(
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/school",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String insert1= "insert into students values(?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(insert1);
            int rowsInserted = 0;
            for(int i = 0; i < this.studentList.size(); i++){
                pstmt.setString(1,this.studentList.get(i).getStudentId());
                pstmt.setString(2,this.studentList.get(i).getStudentName());
                pstmt.setString(3,this.studentList.get(i).getAddress());
                pstmt.setInt(4, this.studentList.get(i).getPhone());
                rowsInserted = pstmt.executeUpdate();
            }
            System.out.println(rowsInserted + " student inserted!");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Student queryStudent(String studentID) {
        int position = findStudent(studentID);
        if(position >=0) {
            return this.studentList.get(position);
        }
        return null;
    }
}
