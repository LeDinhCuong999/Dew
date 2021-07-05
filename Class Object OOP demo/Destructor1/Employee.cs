using System;

namespace Destructor1
{
    class Employee
    {
        private int _empId;
        private String _empName;
        private int _age;
        private double _salary;
        Employee(int id, String name, int age, double salary)
        {
            Console.WriteLine("Constructor for Employee called");
            _empId = id;
            _empName = name;
            _age = age;
            _salary = salary;

        }
        ~Employee()
        {
            Console.WriteLine("Destructor for Employee called");
        }
        static void Main(string[] args)
        {
            Employee emp = new Employee(1, "John", 45, 35000);
            Console.WriteLine("Employee ID:" + emp._empId);
            Console.WriteLine("Emplyee Name:" + emp._empName);
            Console.WriteLine("Age:" + emp._age);
            Console.WriteLine("Salary" + emp._salary);
        }
    }
}
