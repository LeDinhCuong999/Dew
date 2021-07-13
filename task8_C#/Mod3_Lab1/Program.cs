using System;

namespace Mod3_Lab1
{
    class Program
    {
        //EX1
        //static void Main (string[] args)
        //{
          //  Sum(20, 40);
        //}
        //static void Sum(int first, int second)
        //{
          //  int sum = first + second;
          //  Console.WriteLine($"The sum of {first} and {second} is: {sum}");
        //}



        //EX2
        //static void Main(string[] args)
        //{
          //  int result = Sum(20, 40);
          //  Console.WriteLine($"The sum of 20 and 40 is {result}");
        //}
        //static int Sum(int first, int second)
        //{
          //  int sum = first + second;
          //  return sum;
        //}


        //EX3
        static void Main(string[] args)
        {
            int result = Sum(20, 40);
            Console.WriteLine($"Calling Sum() with two arguments, result is: {result}");

            int result3 = Sum(10, 50, 60);
            Console.WriteLine($"Calling Sum() with three arguments, result is: {result3}");

            double dbResult = Sum(20.5, 30.6);
            Console.WriteLine($"Calling Sum() that takes doubles result in: {dbResult}");

        }
        static int Sum(int first, int second)
        {
            int sum = first + second;
            return sum;
        }
        static int Sum(int first, int second, int third)
        {
            int sum = first + second + third;
            return sum;
        }
        static double Sum(double first, double second)
        {
            double result = first + second;
            return result;
        }


    }
}
