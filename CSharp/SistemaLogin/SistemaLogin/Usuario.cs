using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SistemaLogin
{
    class Usuario
    {
       

        public string Nome { get; set; }

        public string Senha { get; set; }



        public Usuario(string nome, string senha)
        {
            Nome = nome;
            Senha = senha;
        }


        public String NomeUsu
        {
            get { return Nome; }

            set
            {
                if (string.IsNullOrEmpty(value))
                {
                    throw new Exception("Usuario Invalido");
                    MessageBox.Show("Informe um usuario válido", "ERRO", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                }
                Nome = value;
            }
        }


        public String SenhaUsu
        {


            get { return Senha; }
            set
            {
                if (string.IsNullOrEmpty(value))
                {
                    throw new Exception("Senha Invalida");
                    MessageBox.Show("Informe uma senha Válida", "ERRO", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                }
                Senha = value;
            }

        }
    }
}

