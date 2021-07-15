using System;
using System.Collections.Generic;
using System.Text;
using System.Linq;
using System.Collections;

namespace IssuesWithNonGenericCollections
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("***** Issues with Non-Generic Collections *****\n");
            UsePersonCollection();
            Console.WriteLine();
            UseGenericList();

            Console.ReadLine();
        }

        #region Simple Box / Unbox
        private static void SimpleBoxUnboxOperation()
        {
            int myInt = 25;

            object boxedInt = myInt;

            try
            {
                long unboxedInt = (long)boxedInt;
            }
            catch (InvalidCastException ex)
            {
                Console.WriteLine(ex.Message);
            }
        }
        #endregion


        #region ArrayList box / unbox
        static void WorkWithArrayList()
        {
            ArrayList myInts = new ArrayList();
            myInts.Add(10);
            myInts.Add(20);
            myInts.Add(35);
            Console.ReadLine();
        }
        #endregion

        #region ArrayList og random objects
        static void ArrayListOfRandomObjects()
        {
            ArrayList allMyObjects = new ArrayList();
            allMyObjects.Add(true);
            allMyObjects.Add(new OperatingSystem(PlatformID.MacOSX, new Version(10, 0)));
            allMyObjects.Add(66);
            allMyObjects.Add(3.14);            
        }
        #endregion

        #region Uae custom generic class
        static void UsePersonCollection()
        {
            Console.WriteLine("***** Custom Person Collection *****\n");
            PersonCollection myPeople = new PersonCollection();
            myPeople.AddPerson(new Person("Homer", "Simpson", 40));
            myPeople.AddPerson(new Person("Marge", "Simpson", 38));
            myPeople.AddPerson(new Person("Code", "Lean", 9));
            myPeople.AddPerson(new Person("Bart", "Simpson", 7));
            myPeople.AddPerson(new Person("Maggie", "Simpson", 2));

            foreach (Person p in myPeople)
                Console.WriteLine(p);
        }
        #endregion


        #region Use generic list 
        static void UseGenericList()
        {
            Console.WriteLine("***** Fun with Generics *****\n");
            List<Person> morePeople = new List<Person>();
            morePeople.Add(new Person("Frank", "Black", 50));
            Console.WriteLine(morePeople[0]);

            List<int> moreInts = new List<int>();
            moreInts.Add(10);
            moreInts.Add(2);
            int sum = moreInts[0] + moreInts[1];

        }
        #endregion
    }
}
