using System;
using System.Collections.Generic;
using System.Text;
using System.Linq;

namespace AnonymousType
{
    class Program
    {
        static void Main1(string[] args)
        {
            var stock = new { Name = "Michgan Enterprises", Code = 1301, Price = 35056.75 };
            Console.WriteLine("Stock Name: " + stock.Name);
            Console.WriteLine("Stock Code: " + stock.Code);
            Console.WriteLine("Stock Price: " + stock.Price);
            Console.Read();
        }

        public static void Main(string[] args)
        {
            Employee david = new Employee();
            david.DisplayDetails(new { FirstName = "David", LastName = "Blake", Age = 30 });
            Console.Read();
        }
    }
}
