using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SistemaFuncionarioPOO
{
     class Desenvolvedor : Funcionario
    {


  
        private double SalarioBase { get; set; }

        private double bonus { get; set; }


        public Desenvolvedor(string nome, int idade, double salario) : base(nome, idade)
        {
            this.NomeFuncionario = nome;
            this.IdadeFuncionario = idade;
             this.SalarioBase = salario;
        }

        public override double CalcularSalario()
        {


            Console.WriteLine("Digite o nivel do desenvolvedor: (junior / pleno / senior) ");
            string nivel = Console.ReadLine();


            if (nivel == "junior")
            {
                SalarioBase = 5000f;
                bonus = 1000f;
                double calcula = SalarioBase + bonus;
                Console.WriteLine($"### O nível do {this.NomeFuncionario} é Junior ###");
                Console.WriteLine($"O salario do desenvolvedor junior, somando o calculo com Bonus é de R$ {calcula} mil ");
                return calcula;

            }
            else if (nivel.ToLower() == "pleno")
            {
                SalarioBase = 7000;
                bonus = 1500f;
                double calcula = SalarioBase + (SalarioBase + bonus);
                Console.WriteLine($"### O nível do {this.NomeFuncionario} é Pleno ###");
                Console.WriteLine($"O salario do desenvolvedor junior, somando o calculo com Bonus é de R$ {calcula} mil");
                return calcula;

            }
            else if (nivel.ToLower() == "senior")
            {
                SalarioBase = 10000;
                bonus = 2000f;
                double calcula = SalarioBase + (SalarioBase + bonus);
                Console.WriteLine($"### O nível do {this.NomeFuncionario} é Senior ###");
                Console.WriteLine($"O salario do desenvolvedor junior, somando o calculo com Bonus é de R$ {calcula} mil");
                return calcula;
            }
            else
            {
                Console.WriteLine("Nivel não encontrado");


            }
            return CalcularSalario();
        }

    }

}

