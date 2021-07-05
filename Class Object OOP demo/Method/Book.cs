using System;

namespace Method
{
    class Book
    {
        String _bookName;
        public string Print()
        {
            return _bookName;

        }
        public void Input(string bkName)
        {
            _bookName = bkName;
        }
    }
}
