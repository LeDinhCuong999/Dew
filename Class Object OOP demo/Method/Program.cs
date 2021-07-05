using System;
using System.Collections.Generic;
using System.Text;

namespace Method
{
    class Program
    {
        static void Main(string[] args)
        {
            Book objBook = new Book();
            objBook.Input("C#-The Complete Refrence");
            Console.WriteLine(objBook.Print());
            Console.ReadKey();
        }
    }
}
