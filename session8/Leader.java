package session8;

import java.util.Scanner;

public class Leader extends Staff{

    public double upSalary;

    public Leader(int age, String ID, String name, double upSalary) {
        super(age, ID, name);
        this.upSalary = upSalary;
    }

    public double getUpSalary(){
        return upSalary;
    }

    public void setUpSalary(double upSalary) {
        this.upSalary = upSalary;
    }

    @Override
    public double getSalary() {
        return upSalary + upSalary/10;
    }

    @Override
    public String toString(){
        return "leader" + "Name: " + super.getName()
                + "ID: " + super.getID()
                + "age: " + super.getAge()
                + "Salary: " + getSalary();
    }



}