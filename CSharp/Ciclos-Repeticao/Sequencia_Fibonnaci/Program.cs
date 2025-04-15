using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sequencia_Fibonnaci
{
    internal class Program
    {
        static void Main(string[] args)
        {
            // Sequencia de Fibonnaci é uma sequencia em que cada numero é a soma de seus dois antecessores 
            // 0 1 1 2 3 5 8


            int a = 0, b = 1, c = 0;


            Console.Write("Quantos valores ? ");
            int valores = int.Parse(Console.ReadLine());


            Console.WriteLine("Sequencia de Fibonnacci com : " + valores + " valores");

            for (int i = 0; i < valores; i++)
            {

                if(i < valores - 1)
                {

                Console.Write(a + ", ");

                }else
                {

                Console.Write(a);

                }
                c = a + b;
                a = b; b = c;

            }

            Console.ReadKey();

        }
    }
}
