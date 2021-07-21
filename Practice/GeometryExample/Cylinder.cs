using System;

namespace GeometryExample
{
    class Cylinder 
    {
        static void Main(string[] args)
        {
            Result();
        }
        private static void Process(double Radius, double Height)
        {
            double BaseArea = Radius * Radius * Math.PI;
            double LateralArea = 2 * Math.PI * Radius * Height;
            double TotalArea = 2 * Math.PI * Radius * (Height + Radius);
            double Volume = Math.PI * Radius * Radius * Height;
            Console.WriteLine($"Base: {Math.Round(BaseArea, 2)}  | Lateral: {Math.Round(LateralArea, 2)}  | Total; {Math.Round(TotalArea, 2)}  | Volume: {Math.Round(Volume, 2)}");
        }

        private static void Result()
        {
            Console.WriteLine("Enter the dimenstions os the cylinder");
            Console.WriteLine("Radius:");
            double r = double.Parse(Console.ReadLine());
            Console.WriteLine("Height:");
            double h = double.Parse(Console.ReadLine());
            Console.WriteLine("cylinder Characteristics");
            Console.WriteLine($"Radius: {r}, Height: {h}");
            Process(r, h);
        }
    }
}
