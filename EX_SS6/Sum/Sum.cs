using System;

namespace Sum
{
    class Sum
    {
        int Add(int numOne, int numTwo)
        {
            int addResult = numOne + numTwo;
            Console.WriteLine("Addition =" + addResult);
        }
        static void Main(string[] args)
        {
            Sum objSum = new Sum();
            objSum.Add();
        }
    }
}
