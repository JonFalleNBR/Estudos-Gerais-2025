using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SistemaFuncionarioPOO
{
    class Estagiario : Funcionario
    {

        private double SalarioBase { get; set; }


        public Estagiario(string nome, int idade, double salario) : base(nome, idade)
        {
            nome = this.NomeFuncionario;
            idade = this.IdadeFuncionario;
            salario = this.SalarioBase;
        }

        public override double CalcularSalario()
        {


            SalarioBase = 2000f;


            Console.WriteLine($"O salario do estagiario de nome {NomeFuncionario} é de R$ {SalarioBase} mil e sem Bônus ");

            return SalarioBase;
        }
    }
}
