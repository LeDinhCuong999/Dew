using System;

namespace Bai5
{
    class bai5
    {
        static void Main(string[] args)
        {
            int x = 1;
            int result = 20;


            for (int i = 1; i <= result; i++)
            {
                x *= i;
                Console.WriteLine(x);
            }
        }
    }
}
