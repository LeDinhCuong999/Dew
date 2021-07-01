using System;

namespace StudentDetails
{
    class StudentDetails
    {
        string _studName = "James";
        int _rollNumber = 20;
        static void Main(string[] args)
        {
            StudentDetails objStudents = new StudentDetails();
            Console.WriteLine("Student Name: " + objStudents._studName);
            Console.WriteLine("Roll Number: " + objStudents._rollNumber);
        }
    }
}
