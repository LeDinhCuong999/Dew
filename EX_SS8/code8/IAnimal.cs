using System;

namespace code8
{
    interface IAnimal
    {
        void Drink();
    }

    interface ICarnivorous
    {
        void Eat();
    }

    interface IReptile : IAnimal, ICarnivorous
    {
        void Habitat();
    }

    class Crocodile : IReptile
    {
        public void Drink()
        {
            Console.WriteLine("Drink fresh water");
        }
        public void Habitat()
        {
            Console.WriteLine("Can stay in Water and Land");
        }

        public void Eat()
        {
            Console.WriteLine("Eats Flesh");
        }

        static void Main(string[] args)
        {
            Crocodile objCrocodile = new Crocodile();
            Console.WriteLine(objCrocodile.GetType().Name);
            objCrocodile.Habitat();
            objCrocodile.Eat();
            objCrocodile.Drink();
        }
    }
}
