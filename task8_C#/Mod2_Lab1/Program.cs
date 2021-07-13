using System;
using System.Collections.Generic;
using System.Text;
using System.Linq;
using System.Threading.Tasks;


namespace Mod2_Lab1
{
    class Program
    {
        static void Main(string[] args)
        {

            var employee1 = new TechnicalEmployee("Torres");
            var employee2 = new BusinessEmployee("Eriksen");
            var employee3 = new BusinessEmployee("Upamecano");
            Console.WriteLine(employee1.employeeStatus() + "..." + employee2.employeeStatus() + "..." + employee3.employeeStatus());
        }
    }
}
