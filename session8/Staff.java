package session8;

public class Staff {
    private int age;
    private double salary;
    private String ID, name;

    public Staff(int age, double salary, String ID, String name) {
        this.age = age;
        this.salary = salary;
        this.ID = ID;
        this.name = name;
    }

    public Staff(int age, String ID, String name) {
        this.age = age;
        this.ID = ID;
        this.name = name;
    }

    public String getID(){
        return ID;
    }

    public void setID(String ID){
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "ID=" + ID +
                ", age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}