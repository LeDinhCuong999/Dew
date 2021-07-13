using System;

namespace Mod3_Lab3
{
    class Program
    {
        static void Main(string[] args)
        {
            GetStudentInformation();
        }
        static void GetStudentInformation()
        {
            Console.WriteLine("Enter the student's first name: ");
            string firstName = Console.ReadLine();
            Console.WriteLine("Enter the student's last name: ");
            string lastName = Console.ReadLine();
            Console.WriteLine("Enter the student's birthday:");
            string birthday = Console.ReadLine();
        }

        static void PrintStudentDetails(string firstName, string lastName, string birthday)
        {
            Console.WriteLine("{0} {1} was born on: {2}", firstName, lastName, birthday);
        }

        
    }
}
