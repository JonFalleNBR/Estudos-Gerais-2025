using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http.Headers;
using System.Text;
using System.Threading.Tasks;

namespace SistemaFuncionarioPOO
{
    internal class Program
    {
        static void Main(string[] args)
        {


            string nome;
            int idade;
            string cargo;



            Console.WriteLine($"Digite o cargo do funcionario: ");
            cargo = Console.ReadLine();


            if (cargo.ToLower() == "gerente")
            {



                bool acesso;
                char resp;

                Console.WriteLine("Digite o usuario: ");
                string usuario = Console.ReadLine();
                Console.WriteLine("Digite a senha: ");
                string senha = Console.ReadLine();

                if (usuario == "admin" && senha == "1234")
                {

                    Console.WriteLine($"Acesso Liberado --- Bem vindo");
                    acesso = true;
                    Console.WriteLine("Gostaria de fazer uma conferencia ? (s/n)");
                    resp = char.Parse(Console.ReadLine());
                    if (resp == 's')
                    {


                        Console.WriteLine($"### Sistema de Conferencia de Funcionarios ###");

                        Console.WriteLine("Digite o nome do funcionario: ");
                        nome = Console.ReadLine();
                        Console.WriteLine("Digite o nome do Cargo: ");
                        cargo = Console.ReadLine();



                        if (cargo.ToLower() == "dev")
                        {
                            Console.WriteLine($"Digite a idade do funcionario {nome}: ");
                            idade = int.Parse(Console.ReadLine());

                            Desenvolvedor d = new Desenvolvedor(nome, idade, 0);
                            d.CalcularSalario();

                        }
                        else if (cargo.ToLower() == "estagiario")
                        {
                            Console.WriteLine($"Digite a idade do funcionario {nome}: ");
                            idade = int.Parse(Console.ReadLine());


                            Funcionario e = new Estagiario(nome, idade, 0);
                            e.CalcularSalario();

                        }
                        else if (cargo.ToLower() == "gerente")
                        {
                            Console.WriteLine($"Digite a idade do funcionario {nome}: ");
                            idade = int.Parse(Console.ReadLine());
                            Funcionario g = new Gerente(nome, idade, 0);
                            g.CalcularSalario();
                        }
                        else
                        {
                            Console.WriteLine("Cargo não encontrado ou Invalido");




                        }
                    }
                    else if (resp == 'n')
                    {
                        Console.WriteLine("Obrigado , volte Sempre");
                    }



                }
                else
                {
                    Console.WriteLine("Acesso Negado --- Usuario ou senha incorretos");
                    return;
                }

            }
            else
            {

                Console.WriteLine($"### Acesso Negado ###");
            }

            Console.ReadKey();

        }
    }
}
