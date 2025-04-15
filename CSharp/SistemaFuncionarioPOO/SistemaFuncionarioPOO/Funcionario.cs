using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SistemaFuncionarioPOO
{
    abstract class Funcionario
    {

        private string Nome;
        private int Idade;


        // Exemplo de encapsulamento, onde as variaveis privadas não podem ser acessadas fora da classe.
        public string NomeFuncionario
        {
            get { return Nome; }
            set { Nome = value; }
        }

        public int IdadeFuncionario
        {
            get { return Idade; }
            set { Idade = value; }
        }

        public Funcionario(string nome, int idade)
        {
            this.Nome = nome;

            this.Idade = idade;


        }


        public abstract double CalcularSalario();

    }
}
