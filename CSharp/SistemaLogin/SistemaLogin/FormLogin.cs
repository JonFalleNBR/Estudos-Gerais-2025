using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SistemaLogin
{
    public partial class FormLogin : Form
    {
        public FormLogin()
        {
            InitializeComponent();
        }

        private void FormLogin_Load(object sender, EventArgs e)
        {
          
        }

        private void button1_Click(object sender, EventArgs e)
        {

            string nome = txtUsuario.Text;
            string senha = txtSenha.Text;

            if (CadastroUsuarios.Login(nome, senha))
            {

                MessageBox.Show("Login Efetuado com sucesso", "Sucesso", MessageBoxButtons.OK, MessageBoxIcon.Information);

                Close();
                Form1 form1 = new Form1();
                form1.ShowDialog();

            }
            else
            {
                MessageBox.Show("Usuario ou senha invalidos", "Erro", MessageBoxButtons.OK, MessageBoxIcon.Error);
                txtUsuario.Clear();
                txtSenha.Clear();

                txtUsuario.Focus();
                /*Environment.Exit(0)*/


            }
        }

        private void btnCancelar_Click(object sender, EventArgs e)
        {
            Environment.Exit(0);
        }
    }
}
