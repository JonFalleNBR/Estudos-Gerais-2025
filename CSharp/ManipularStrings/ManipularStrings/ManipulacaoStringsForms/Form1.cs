using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ManipulacaoStringsForms
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnExecutar_Click(object sender, EventArgs e)
        {

            #region Metodo Contains
            //string texto = "Tipo de Variavel Alfa Numerica"; // alterar o tipo em minusculo para ser enconttado na validação

            //// Exemplo do Metodo Contains()

            //// verifica se a string "texto" contém a palavra "tipo" - contains 
            //if (texto.ToLower().Contains("tipo")) // como o csahrp é case sensitive, o trecho "tipo" não é encontrado na string "texto" - a menos que agregue a validação com o toLower
            //{

            //    label1.Text = "A string contém a palavra 'tipo'";

            //}
            //else
            //{
            //    label1.Text = "A string Não contem o trecho tipo";

            //}
            #endregion


            #region Exmeplo do Metodo ToString
            // exemplo pratico do toString 
            // toda variavel tem esse metodo, uma vez que ele serve para converter a variavel em string 
            // o toString é um metodo herdado da classe object, que é a superclasse de todas as classes do C#


            //int num1 = 10;
            //label1.Text = num1.ToString(); // converte o inteiro em string
            #endregion


            #region Exemplo do Metodo ToLower / ToUpper
            //string texto = "Exemplo";

            //label1.Text = texto.ToUpper(); // Retorna uma copia da String em letras maiusculas

            //string texto2 = "EXEMPLO";

            //label1.Text = texto2.ToLower(); // Retorna uma copia da String em letras minusculas
            #endregion



            #region Exemplo LastIndexOf

            string nome = "João da Silva";


          ; // Retorna a posição do primeiro caracter da string "da" dentro da string "nome"
            // ele irá retornar apenas se estiver minusculo, uma vez que o C# é case sensitive
            // Ele irá sempre retornar semrpe a primeira posição do caracter encontrado


            int indice = nome.IndexOf("da"); // Retorna a posição do primeiro caracter da string "da" dentro da string "nome" 

            //label1.Text = "indice: " + indice2.ToString(); // Retorna a posição do primeiro caracter da string "da" dentro da string "nome"


            int indice2 = nome.IndexOf("ilv", 4); // Após a posição index 4, ele irá procurar a string "ilv" dentro da string "nome"
                                                  // Isso é muito util para fazer buscas dentro de strings, uma vez que ele irá
                                                  // retornar a posição do primeiro caracter da string "ilv" dentro da string "nome"

            //label1.Text = "indice: " + indice2.ToString(); // Retorna a posição do primeiro caracter da string "da" dentro da string "nome"



            int indice3 = nome.IndexOf("ilv", 4, 3); // Ele irá procurar o ilv apenas após o indice 4, tal qual o de cima, porem, defini aqui tambem que ele
            //percorra apenas 3 caracteres, ou seja, ele irá retornar -1, uma vez que o ilv não existe dentro da string "nome" após o indice 4
            // Esse exemplo é muito util para buscar de strings em um texto maior, e , apenas x caracteres, como 11 para cpf ,etc
            //label1.Text = "indice: " + indice3.ToString();

            //Nesse cenario ele não irá encontrar o ilv, uma vez que ele não existe dentro da string "nome" após o indice 4


            string nome2 = "Jonathan Lopes";

            int indice4 = nome2.LastIndexOf("o"); // Retorna a ultima ocorrencia da string "da" dentro da string "nome"
                                                 // Nesse caso ele irá retornar o segundo "o" do nome "Jonathan Lopes"
            label1.Text = "indice: " + indice4.ToString();


            // IndexOf busca a primeira ocorrencai de um caracter dentro de uma string
            // LastIndexOf busca a ultima ocorrencia de um caracter dentro de uma string 
           
            #endregion

        }




    }
}
