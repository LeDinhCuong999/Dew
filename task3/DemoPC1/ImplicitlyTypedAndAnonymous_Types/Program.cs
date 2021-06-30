using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace ImplicitlyTypedAndAnonymous_Types
{
    class Program
    {
        static void Main(string[] args)
        {
            var p1 = new { Name = "A", Price = 3 };
            Console.WriteLine("Name = {0}\nPrice = {1}",
                p1.Name.ToLower(), p1.Price);


            var i = 5;
            var s = "hello";
            Console.WriteLine("type of i: " + i.GetType());
            Console.WriteLine("First letter of s: " + s.Substring(1, 1));
            Console.ReadLine();
        }
    }
}
