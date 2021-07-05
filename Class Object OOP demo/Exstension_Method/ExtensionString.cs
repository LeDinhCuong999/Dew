using System;
using System.Collections.Generic;
using System.Text;
using System.Linq;

namespace Exstension_Method
{
    static class ExtensionString
    {
        public static string FerstLetterLower(this string result)
        {
            if (result.Length > 0)
            {
                char[] s = result.ToCharArray();
                s[0] = char.ToLower(s[0]);
                return new string(s);
            }
            return result;
        }
    }
}
