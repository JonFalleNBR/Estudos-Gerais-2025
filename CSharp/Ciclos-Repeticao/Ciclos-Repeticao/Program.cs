using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ciclos_Repeticao
{
    internal class Program
    {
        static void Main(string[] args)
        {

            // o bloco de comandos será executando enquanto a condição for verdadeira

            #region while
            //    int valor = 0;
            //inicio:
            //    Console.WriteLine("Informe um valor: ");
            //    valor = int.Parse(Console.ReadLine());

            //    while (valor < 10)
            //    {
            //        // bloco de comandos sempre será executado enquando condição for verdadeira
            //        Console.WriteLine("O valor é " + valor);
            //        valor++; // incremento ate que valor seja maior ou igual que 10 - ele sai do laço
            //    }

            //    char resp;
            //    if (valor >= 10)
            //    {
            //        Console.WriteLine("[ Valor Ultrapassa 10] - Gostaria de informar um novo ? (s/n) ");
            //        resp = char.Parse(Console.ReadLine());

            //        switch (resp)
            //        {
            //            case 's':
            //                goto inicio;
            //            case 'n':
            //                Console.WriteLine("[Até Logo!]");
            //                Console.ReadKey();
            //                break;
            //        }
            //    }
            //    else if (valor < 10)
            //    {
            //        Console.WriteLine("Fim do while - Valor Incremental Ultrapassou ou igualou 10 - Gostaria de inserir novamente ? (s/n)");
            //        resp = char.Parse(Console.ReadLine());

            //        switch (resp)
            //        {
            //            case 's':
            //                goto inicio;
            //            case 'n':
            //                Console.WriteLine("[Até Logo!]");
            //                Console.ReadKey();
            //                break;
            //        }
            //    }

            //    else
            //    {
            //        Console.WriteLine("Valor Inválido - Insira novamente");
            //        goto inicio;

            //    }

            #endregion

            #region do - while
            //A diferença do Do - While para o While simple é que pelo menos uma unica vez o bloco de repetição será executado
            // faça enquanto a condição for verdadeira - a diferença é que o bloco de comandos será executado pelo menos uma vez

            //int valor = 0;
            ////int valor = 15;  no caso do While ele não iria executar nunca o bloco de comandos ja que a condição é falsa
            ////- no caso do Do - While ele executaria pelo menos uma vez porem saira do Loop

            //do
            //{
            //    Console.WriteLine("O valor é " + valor );
            //    valor++;
            //} while (valor <= 10);

            //Console.WriteLine("Fim do Do - While");
            //Console.ReadKey();


            #endregion


            #region for

            // O conceito de um for é o mesmo de um while,
            // a diferença é que o for é mais utilizado quando se sabe a quantidade de vezes que o bloco de comandos será executado           
            // o for é composto por 3 partes - inicialização, condição e incremento - incialização é executada uma unica vez - a condição é verificada a cada iteração - o incremento é executado a cada iteração


            //for (int i = 0; i <= 10; i++) // variavel de inicialização comumente chamada i(index) - condicao que define o fim do loop - incremento ou decremento da variavel
            //{
            //    Console.WriteLine("O valor é " + i);
            //    // Executa o bloco de comandos enquanto a condição for verdadeira - no caso i <= 10 - ele irá executar até que i seja maior ou igual a 10


            //}
            //Console.WriteLine("------------------------");
            //// Abaixo exemplo de um for com mais de uma variavel de incialização e condições compostas - tal qual vimos no If - Else || &&

            //for (int i = 0, j= 10; i <= 10 && j >= 0; i++, j--) // execute o looping enquanto i for menor que 10 e j for maior que 0
            //{

            //    Console.WriteLine("O valor de i é : " + i + " | E o valor de j é : " + j);
            //}

            //Console.WriteLine("Fim do For");
            //Console.ReadKey();
            #endregion


            #region for each

            // for each é uma estrutura de repetição tal qual o for comum, porem 
            // foi arquitetado para atender estruturas de coleção (arrays, vetores, listas, maps, etc) 
            // Ele é ideal para percorrer os dados de uma coleção sem precisar de um contador ou manipulação manual dos indices


            int[] numeros = {1,2,3,4,5};

            foreach(int numero in numeros) // Irá percorrer todos os dados do array, e a cada repetição, guardar na variavel numero o valor seguinte .
            {
                Console.WriteLine(numero); // imprime o valor atual 

            }

            Console.WriteLine("Fim do Foreach");
            Console.ReadKey();

            #endregion



        }
    }
}
