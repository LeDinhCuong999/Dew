using System;

namespace session6
{
    class Students
    {
        string _studName = "James Anderson";
        int _studAge = 27;

        void Display()
        {
            Console.WriteLine("Student Name: " + _studName);
            Console.WriteLine("Studnet Age: " + _studAge);
        }
        static void Main(string[] args)
        {
            Students objStudents = new Students();
            objStudents.Display();
        }
    }
}
