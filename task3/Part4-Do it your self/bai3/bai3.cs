using System;

namespace bai3
{
    class bai3
    {
        static void Main(string[] args)
        {           
            Console.Write("Nhap 1 so ngau nhien (1-7): ");
            int ngay;
            ngay = Convert.ToInt32(Console.ReadLine());

            switch (ngay)
            {
                case 1:
                    Console.WriteLine("Thu hai");
                    break;
                case 2:
                    Console.WriteLine("Thu ba");
                    break;
                case 3:
                    Console.WriteLine("Thu tu");
                    break;
                case 4:
                    Console.WriteLine("Thu nam");
                    break;
                case 5:
                    Console.WriteLine("Thu sau");
                    break;
                case 6:
                    Console.WriteLine("Thu bay");
                    break;
                case 7:
                    Console.WriteLine("Chu nhat");
                    break;

            }

        }
    }
}
