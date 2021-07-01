using System;

namespace Code3
{
    class Animal
    {
        protected string Food;
        protected string Activity;
    }

    class Cat : Animal
    {
        static void Main (String[] args)
        {
            Cat objCat = new Cat();
            objCat.Food = "Mouse";
            objCat.Activity = "laze around";
            Console.WriteLine("The Cat loves to eat" + objCat.Food + ".");
            Console.WriteLine("The Cat loves to" + objCat.Activity + ".");
        }
    }
}
