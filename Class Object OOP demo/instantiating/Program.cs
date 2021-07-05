using System;

namespace instantiating
{
    class Program
    {
        static void Main(string[] args)
        {
            House londonHouse = new House { HouseName = "London Street", Members = 3 };
            Console.WriteLine("house Name: {0}, Members: {1}", londonHouse.HouseName, londonHouse.Members);
        }
    }
}
