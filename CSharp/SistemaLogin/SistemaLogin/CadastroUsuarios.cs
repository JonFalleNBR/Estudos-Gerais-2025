using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SistemaLogin
{
    static class CadastroUsuarios
    {

        // Classe responsavel por cadastrar os usuarios e verificar se o usuario ja existe


        private static Usuario[] usuarios =
        {

            new Usuario() { Nome = "Gabriel", Senha = "abc123" },
            new Usuario() { Nome = "Danny", Senha = "123abc" },
            new Usuario() { Nome = "Arthur", Senha = "abcd" }
    };

        private static Usuario _userLogado = null;


        public static Usuario UsuarioLogado
        {
            get { return _userLogado; }
            set { _userLogado = value; }
        }


        public static bool Login(string nome, string senha)
        {


            foreach (Usuario usuario in usuarios)
            {
                // Verifica se o usuario e senha estao corretos e existem na lista
                if (usuario.Nome == nome && usuario.Senha == senha)
                {
                    UsuarioLogado = usuario;
                    return true;
                }

            }

            return false;


        }
    }
}

