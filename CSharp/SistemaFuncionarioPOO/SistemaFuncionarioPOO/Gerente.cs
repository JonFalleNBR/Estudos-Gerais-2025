using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SistemaFuncionarioPOO
{
     class Gerente : Funcionario 
    {

        // Aqui temos um exemplo de encapsulamento, onde as variaveis privadas não podem ser acessadas fora da classe.
        // Os atributos genericos são: Nome, Idade e Salario, que são herdados da classe Funcionario.
        // Os atributos especificos do Gerente são: salarioBase e bonus, que são usados para calcular o salario do Gerente.

        private double bonus { get; set; }

        private double salarioBase { get; set; }


        // Construtor da classe Gerente, onde estamos passando os valores para as variaveis privadas.

   
        public Gerente(string nome, int idade, double salario) : base(nome, idade)
        {
            this.NomeFuncionario = nome;
            idade = this.IdadeFuncionario;
            salario = this.salarioBase;
        }


        // Aqui estamos sobrescrevendo o metodo CalcularSalario da classe Funcionario, onde estamos fazendo o calculo do salario do Gerente. Isso é Herança, onde a classe Gerente herda os metodos e propriedades da classe Funcionario.
        public override double CalcularSalario()
        {

            salarioBase = 15000f;
            bonus = 2000f;
            double calcula = salarioBase + (salarioBase + bonus );

            Console.WriteLine($"O salario do Gerente de nome {NomeFuncionario}, somando o calculo com Bonus é de R$ {calcula} mil ");

            return calcula;
        }


    }
}
