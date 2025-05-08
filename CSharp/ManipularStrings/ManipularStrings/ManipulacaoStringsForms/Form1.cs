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
            // Descomentar os exemplos abaixo para testar cada um deles


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



            #region Exemplo IndexOf - LastIndexOf

            //string nome = "João da Silva";


            //// Retorna a posição do primeiro caracter da string "da" dentro da string "nome"
            //// ele irá retornar apenas se estiver minusculo, uma vez que o C# é case sensitive
            //// Ele irá sempre retornar semrpe a primeira posição do caracter encontrado


            //int indice = nome.IndexOf("da"); // Retorna a posição do primeiro caracter da string "da" dentro da string "nome" 

            ////label1.Text = "indice: " + indice2.ToString(); // Retorna a posição do primeiro caracter da string "da" dentro da string "nome"


            //int indice2 = nome.IndexOf("ilv", 4); // Após a posição index 4, ele irá procurar a string "ilv" dentro da string "nome"
            //                                      // Isso é muito util para fazer buscas dentro de strings, uma vez que ele irá
            //                                      // retornar a posição do primeiro caracter da string "ilv" dentro da string "nome"

            ////label1.Text = "indice: " + indice2.ToString(); // Retorna a posição do primeiro caracter da string "da" dentro da string "nome"



            //int indice3 = nome.IndexOf("ilv", 4, 3); // Ele irá procurar o ilv apenas após o indice 4, tal qual o de cima, porem, defini aqui tambem que ele
            ////percorra apenas 3 caracteres, ou seja, ele irá retornar -1, uma vez que o ilv não existe dentro da string "nome" após o indice 4
            //// Esse exemplo é muito util para buscar de strings em um texto maior, e , apenas x caracteres, como 11 para cpf ,etc
            ////label1.Text = "indice: " + indice3.ToString();

            ////Nesse cenario ele não irá encontrar o ilv, uma vez que ele não existe dentro da string "nome" após o indice 4


            //string nome2 = "Jonathan Lopes ";

            //int indice4 = nome2.LastIndexOf("o"); // Retorna a ultima ocorrencia da string "da" dentro da string "nome"
            //                                     // Nesse caso ele irá retornar o segundo "o" do nome "Jonathan Lopes"
            //label1.Text = "indice: " + indice4.ToString();


            // IndexOf busca a primeira ocorrencai de um caracter dentro de uma string
            // LastIndexOf busca a ultima ocorrencia de um caracter dentro de uma string 

            #endregion



            #region Exemplo de Metodo Insert - Replace

            //string nome = "João da Silva";

            //// metodo replace um trecho da string por outro conforme definido na declaração do metodo

            //var nomeFinal = nome.Replace("João", "Jonathan");

            //label1.Text = nomeFinal; // Retorna a string "Jonathan da Silva"

            // Outro exemplo do Replacepara colar toda uma string
            //string nome = "Jonathan Lopes da Silva";
            //string nomeFinal = nome.Replace(" ", "");

            //label1.Text = nomeFinal;


            //// metodo insert insere um trecho dentro de uma string conforme definido na declaração do metodo

            //label1.Text = nomeFinal.Insert(0, "Ola "); // O 0 aqui é o indicie da string onde será inserido a nova palavra, ou seja, o "Ola" será inserido na posição 0 da string "nome"

            #endregion




            #region Exemplo do Metodo Length - Substring 

            //string nome = "Jonathan";
            //string resultado = "";

            ////var tam = nome.Length; // o Length retorna o tamanho da string - contando tambem os espaços em branco


            ////label1.Text = "O nome " + nome + " contem " + tam + " letras"; 

            //// EXEMPLO DE USO DO LENGTH EM UM LOOP FOR

            ////for(int i = 0; i < nome.Length; i++) // O length retorna o tamanho da string, ou seja, o loop irá ter sua atividade definida enquanto index (i) for menor que o tamano da string
            ////{

            ////    resultado += nome[i] + "\n"; // aqui ele irá retornar cada letra da string "nome" em uma linha diferente

            ////}


            ////label1.Text = resultado;


            ////------------------------------------------


            //// metodo Substring 


            //string parte = nome.Substring(0, 3); // O substring retorna uma parte da string conforme definido na declaração do metodo
            //// as duas assinaturas do substring são: 
            //// Substring(int startIndex, int length) - onde o startIndex é o indice inicial da string que será retornada e o length é o tamanho da string que será retornada
            //// No exemplo acima estou definindo que irá pegar do indice 0 ate o indice 3, ou seja, irá me retornar apenas os 3 primeiros caracteres

            //label1.Text = parte; // Retorna a string "Jon" - ou seja, os 3 primeiros caracteres da string "nome"

            ////Substring corta a string conforme o tamanho definido na declaração do metodo e ignora o resto da string 


            //// tambem podemos definir apenas o indice inicial, e o substring irá retornar o restante da string a partir do indice definido sem limite de tamanho

            //string nome2 = "Jonathan Lopes";

            //string parte2 = nome2.Substring(8); // O substring retorna uma parte da string conforme definido na declaração do metodo

            //label1.Text =  parte2; // imprime tudo que esta a partir do indice 8


            ////exe´mplo pratico para pegar um ponto especifico com IndexOf 

            //string nome3 = "Jonathan Lopes da Silva";
            //string parte3 = nome3.Substring(nome3.IndexOf("da"), 3); // O substring retorna uma parte da string conforme definido na declaração do metodo com o auxilio do IndexOf

            //// nesse caso ele irá retornar tudo que esta a partir do "da", e mais 3 adiante, conforme tamanho da length definido (3) ,mas tambem posso definir para pegar tudo tambem
            //// 
            //label1.Text = parte3; // imprime tudo que esta a partir do indice 8




            #endregion



            #region Metodo Split

            // metodo Split faz a divisão de uma string em varias partes - posso cortar uma mensagem em duas ou tres partes conforme delimitador 

            //string nomes = "Jonathan, Lucas, Gustavo, Marcelo, Carlos";


            //char[] separador = { ',' }; // O separador é o delimitador que irá dividir a string em partes, nesse caso estou definindo a virgula como delimitador

            //string[] resultado =  nomes.Split(separador); // O split divide a string conforme o delimitador definido na declaração do metodo


            //foreach(string nome in resultado)
            //{

            //    label1.Text += nome; // irá imprimir cada nome em uma linha diferente a partir do separador e com a quebra de linha "\n"

            //}
            // reapre que o split é um metodo muito util para dividir uma string em partes, como por exemplo, separar os nomes de uma lista de contatos,
            // ou separar os numeros de um telefone, etc
            // nesse exemplo ele usa a virgula como delimitador, ou seja, qualquer ponto da string que ele encontrar uma virgula ele irá dividir
            // a string em partes, e cada parte será armazenada em um array de strings,
            // que pode ser percorrido com um loop foreach, como no exemplo acima

            #endregion




            #region Exemplo do StartsWith - EndsWith

            //start e end with são metodos booleanos que verificam se a string começa ou termina com o trecho definido na declaração do metodo


            // --------------  Exemplo do StartsWith -------------
            //string nome = "Jonathan Lopes da Silva";

            //bool res; // Retorna true se a string começar com o trecho definido na declaração do metodo
            //bool res2; // Retorna true se a string terminar com o trecho definido na declaração do metodo

            //if (nome.StartsWith("Jonathan", StringComparison.OrdinalIgnoreCase)) // O StringComparison.OrdinalIgnoreCase serve para ignorar o case sensitive, ou seja, ele irá retornar true mesmo que a string esteja em minusculo
            //{

            //   res = true;

            //}else
            //{
            //    res = false;
            //}



            //// ------------------ Exemplo de EndWith ------------
            //string nome2 = "Marcus Fenix";


            //if (nome2.EndsWith("Fsnix", StringComparison.OrdinalIgnoreCase))
            //{

            //    res2 = true;

            //}
            //else
            //{
            //    res2 = false;
            //}

            //label1.Text = "StartWith é : " + res.ToString() + "\n" + "EndsWith é : " + res2.ToString(); // Retorna true se a string começar com o trecho definido na declaração do metodo



            // Pode ser apenas parte da String , StartWith(Jon) ja serve para retornar true
            // Também é importante se atentar para o uso do StringComparison, uma vez que o C# é case sensitive, ou seja, ele diferencia letras maiusculas de minusculas



            #endregion



            #region Exemplo do Metodo Trim - TrimStart - TrimEnd


            //string nome = " Jonathan Lopes da Silva ! ";

            //// nesse caso ele esta removendo os espaços em branco do começo e fim da string - resultado -> "Jonathan Lopes da Silva !"
            ////string imprime = nome.Trim();


            //string mensagem = " Ola Mundo! ";

            ////string imprime = mensagem.TrimStart(); // Nesse caso esta removendo apenas o espaço em branco do inicio da mensagem 

            //string mensagem2 = " Eu odeio Call of Duty Warzone !!!!   ";

            //string imprime  = mensagem2.TrimEnd(); // Nesse caso esta removendo os espaços em branco do final da mensagem 




            //label1.Text = imprime;





            #endregion


            #region Metodo CompareTo - Equals


            string nome = "Jonathan Lopes da Silva";
            string nome2 = "Jonathan Lopes da Silva";

            string res = nome.CompareTo(nome2).ToString(); // O CompareTo compara duas strings e retorna 0 se forem iguais, -1 se a primeira string for menor que a segunda e 1 se a primeira string for maior que a segunda


            label1.Text = res.ToString(); // Retorna 0 se as strings forem iguais, -1 se a primeira string for menor que a segunda e 1 se a primeira string for maior que a segunda


            #endregion

        }




    }
}
