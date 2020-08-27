using System;
using System.IO;
using System.Reflection;
using System.Text.RegularExpressions;

namespace TehnicalAssesment
{
    class Program
    {
        static void Main(string[] args)
        {
            String inputString = "apples, pears # and bananas\ngrapes\nbananas !apples"; // There you can declare your string that you want to strip
            String[] markers = { "#", "!" }; // There you can declare your set of comment markers 

            string StripComments(string str, string[] marker)
            {
                String result = null;

                for(int i = 0; i < marker.Length; i++)  //verify each marker or groups of markers
                {
                    result = Regex.Replace(inputString, marker[i] + ".+", string.Empty).Trim(); // I used regular expression for finding a marker(character)/groups of characters
                    inputString = result;                                                       // and replace method for replacing everything that following it with an empty string
                }                                                                               // Trim() method remove all beginning and ending white space 
                return result;
            }
            Console.WriteLine(StripComments(inputString,markers)); // use the algorithm and display the result
            Console.ReadKey();
        }

    }
}

