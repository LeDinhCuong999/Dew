using System;

namespace code5
{
    interface IAnimal
    {
        void Habitat();
    }

    class Cat : IAnimal
    {
        public void Habitat()
        {
            Console.WriteLine("Can be housed with human beings");
        }

        static void Main(string[] args)
        {
            Cat objCat = new Cat();
            Console.WriteLine(objCat.GetType().Name);
            objCat.Habitat();
        }
    }
}
