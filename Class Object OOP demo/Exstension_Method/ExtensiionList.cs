using System;
using System.Collections.Generic;
using System.Text;
using System.Linq;


namespace Exstension_Method
{
    static class ExtensiionList
    {
        public static List<T> RemoveDuplicate<T>(this List<T> allCities)
        {
            List<T> finalCities = new List<T>();
            foreach (var eachCity in allCities)
                if (!finalCities.Contains(eachCity))
                    finalCities.Add(eachCity);
            return finalCities;
        }
    }
}
