using System;

namespace Code6
{
    class Animal
    {
        public Animal()
        {
            Console.WriteLine("Animal constructor wwithout paramenters");
        }
        public Animal(String name)
        {
            Console.WriteLine("Animal constructor with a string paramenters");
        }
    }
    class Canine : Animal
    {
        public Canine() : base("Lion")
        {
            Console.WriteLine("Derived Canine");
        }
    }
    class Details
    {
        static void Main(String[] args)
        {
            Canine objCanine = new Canine();
        }
    }
}
