using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CalculadoraForm
{
    public partial class Calculadora : Form
    {
        public Calculadora()
        {
            InitializeComponent();


            PainelOperacao.Font = new Font("Arial", 15, FontStyle.Bold);

        }


        int num1 = 0, num2 = 0, resultado = 0;
        string operador = "";
        bool operadorSelecionado = false;
        string operacaoCompleta = "";

        private void btnNumero_Click(object sender, EventArgs e)
        {
            Button btn = (Button)sender;


            PainelOperacao.Text += btn.Text;

            operacaoCompleta += btn.Text;

            PainelOperacao.Items.Clear(); // Limpa o painel antes de adicionar a nova operação
            PainelOperacao.Items.Add(operacaoCompleta);


        }


        private void btnOperador(object sender, EventArgs e)
        {
            if (int.TryParse(PainelOperacao.Text, out num1))
            {
                Button btn = (Button)sender;
                operador = btn.Text;

                operadorSelecionado = true;
                operacaoCompleta += $"{operador}";
                PainelOperacao.Text = string.Empty;
            }
            else
            {
                MessageBox.Show("Por favor, insira um número válido.", "Erro de Entrada");
            }

            PainelOperacao.Items.Add($"{num1} {operador}");

            PainelOperacao.Items.Clear();
            PainelOperacao.Items.Add(operacaoCompleta);


        }

        private void btnIgual_Click(object sender, EventArgs e)
        {
            if (PainelOperacao.Text != "" && operadorSelecionado)
            {
                if (int.TryParse(PainelOperacao.Text, out num2))
                {
                    switch (operador)
                    {
                        case "+":
                            resultado = num1 + num2;
                           
                            break;
                        case "-":
                            resultado = num1 - num2;
                            break;
                        case "X":
                            resultado = num1 * num2;
                            break;
                        case "/":
                            if (num2 != 0)
                                resultado = num1 / num2;
                            else
                            {
                                MessageBox.Show("Divisão por zero não é permitida.");
                                return;
                            }
                            break;
                    }

                  
                    operacaoCompleta = $"{num1} {operador} {num2} = {resultado}";

                  
                    PainelOperacao.Items.Clear(); 
                    PainelOperacao.Items.Add(operacaoCompleta);

                  
                    PainelOperacao.Text = resultado.ToString();

                    // LOGICA PARA LIMPAR A OPERAÇÃO
                    operadorSelecionado = false;
                    operacaoCompleta = "";
                }
                else
                {
                    MessageBox.Show("Por favor, insira um número válido.", "Erro de Entrada");
                }
            }
        }



        private void btnLimpar_Click(object sender, EventArgs e)
        {
            PainelOperacao.Text = string.Empty;
            PainelOperacao.Items.Clear();
            operador = "";
            operadorSelecionado = false;
            num1 = num2 = resultado = 0;
            operacaoCompleta = "";

            //PainelOperacao.Items.Remove($"{num1} {operador} {num2} = {resultado}");

        }





    }
}
