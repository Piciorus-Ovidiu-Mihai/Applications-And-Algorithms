using System;

namespace StrongPasswordChecker
{
    class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                Console.Clear();
                Console.WriteLine("Enter a password: ");
                string s = Console.ReadLine();
                PasswordCorrect pass = new PasswordCorrect();
                Console.WriteLine("Minimum changes required to make a strong password: {0} ", pass.PasswordCheck(s));
                Console.ReadKey();
            }
        }
    }
}
