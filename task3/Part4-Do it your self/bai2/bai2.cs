using System;

namespace bai2
{
    class bai2
    {
        static void Main(string[] args)
        {           
            Console.WriteLine("Nhap 3 so nguyen: ");
            Console.Write("So thu nhat: ");
            int x = int.Parse(Console.ReadLine());
            Console.Write("So thu hai: ");
            int y = int.Parse(Console.ReadLine());
            Console.Write("So thu ba: ");
            int z = int.Parse(Console.ReadLine());

            if (x > y && x > z)
            {
                Console.WriteLine("giá trị lớn nhất trong 3 số là {0}", x);
            }
            else if (y > z && y > x)
            {
                Console.WriteLine("giá trị lớn nhất trong 3 số là {0}", y);
            }
            else
            {
                Console.WriteLine("giá trị lớn nhất trong 3 số là {0}", z);
            }
            Console.ReadKey();
        }
    }
}
