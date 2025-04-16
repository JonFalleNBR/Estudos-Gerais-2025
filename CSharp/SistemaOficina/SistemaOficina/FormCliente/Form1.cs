using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using SistemaOficina;

namespace FormCliente
{
    public partial class Form1 : Form
    {

        private List<Cliente> clientes = new List<Cliente>();

        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string nome = txtNome.Text.Trim(); // Remove leading and trailing whitespace
            string email = txtEmail.Text.Trim();
            string telefone = txtDDD.Text.Trim() + txtTel.Text.Trim(); // Concatenate DDD and phone number

            if(string.IsNullOrEmpty(nome) || string.IsNullOrEmpty(email) || string.IsNullOrEmpty(telefone))
            {

                MessageBox.Show("Preencha todos os campos.", "Aviso", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                return;
            }

            Cliente cliente = new Cliente
            {
                Nome = nome,
                Email = email,
                Telefone = telefone


            };

            clientes.Add(cliente);
            AtualizarLista();
            LimparCampos();

        }


        private void AtualizarLista()
        {

            listBox1.Items.Clear();
            listBox1.Items.Add($"{"Nome",-20} | {"Email",-25} | {"Telefone",-15}");
            listBox1.Items.Add(new string('-', 65));

            foreach (var cliente in clientes)
            {
                listBox1.Items.Add(cliente);
            }
        }

        private void LimparCampos()
        {
            txtNome.Clear();
            txtEmail.Clear();
            txtDDD.Clear();
            txtTel.Clear();
            txtNome.Focus(); // Esse focus serve para que o cursor fique no campo Nome
        }


        private void btnExcluir_Click(object sender, EventArgs e)
        {
            if (listBox1.SelectedItem != null)
            {
                clientes.Remove((Cliente)listBox1.SelectedItem);
                AtualizarLista();
            }
            else
            {
                MessageBox.Show("Selecione um cliente para excluir.", "Aviso", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            }
        }

    }
}
