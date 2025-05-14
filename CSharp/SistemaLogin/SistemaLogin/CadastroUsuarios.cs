using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SistemaLogin
{
    class CadastroUsuarios
    {

        // Classe responsavel por cadastrar os usuarios e verificar se o usuario ja existe

        private List<Usuario> usuarios = new List<Usuario>();


        public void CadastrarUsuario(string nome, string senha)
        {
            // Verifica se o usuario ja existe
            if (usuarios.Any(u => u.Nome == nome))
            {
                throw new Exception("Usuario ja existe");
                MessageBox.Show("Usuario ja existe na base de Dados", "Aviso", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            }
            // Adiciona o usuario a lista
            usuarios.Add(new Usuario(nome, senha));
        }


        public bool Login(string nome, string senha)
        {

           
            foreach (Usuario usuario in usuarios)
            {
                // Verifica se o usuario e senha estao corretos e existem na lista
                if (usuario.Nome == nome && usuario.Senha == senha)
                {
             
                    return true;
                }
                              
            }

            return false;


        }
    }
}
