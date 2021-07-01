using System;

namespace Code8
{
    class Animal
    {
        public virtual void Eat()
    {
        Console.WriteLine("Every animal eats some thing");
    }
    protected void DoSomething()
    {
        Console.WriteLine("Every animal does something");
    }
}
class Cat : Animal
{
    public override void Eat()
    {
        Console.WriteLine("Cat loves to eat the mouse");


    }
    static void Main(String[] args)
    {
        Cat objCat = new Cat();
        objCat.Eat();
    }
}
}
