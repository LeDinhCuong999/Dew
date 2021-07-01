using System;

namespace Book
{
    class Book
    {
        string _bookName;
        public string Print()
        {
            return _bookName;
        }

        public void Input(string bkName)
        {
            _bookName = bkName;
        }
        static void Main(string[] args)
        {
            Book objBook = new Book();
            objBook.Input("C#-the Complete Reference");
            Console.WriteLine(objBook.Print());
        }
    }
}
