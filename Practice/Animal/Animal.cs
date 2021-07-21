using System;

namespace Animal
{
    class Animal
    {
        public string Name { get; set; }
        public double Weight { get; set; }

        public void SetMe(string name, double weight)
        {
            Name = name;
            Weight = weight;
        }

        public void Show()
        {
            Console.WriteLine($"Name: {Name}, Weight {Weight}");
        }
    }

    class Lion: Animal
    {
        public Lion()
        {
            Name = "Lion";
            Weight = 350;
        }
    }

    class Tiger: Animal
    {
        public Tiger()
        {
            Name = "Tiger";
            Weight = 300;
        }
    }

    class Program
    {
        static void Main(string[] args)
        {
            Tiger tiger = new Tiger();
            Console.WriteLine();
            Lion lion = new Lion();

            tiger.Show();
            lion.Show();
        }
    }
}
