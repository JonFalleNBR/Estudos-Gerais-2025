package funcions

import java.util.*


// Sem parametros e sem valores para retorno
fun HelloWorld() {

   print("Hello, World!")

}

// "Kotlin" -> K O T L I N
// 1 parametro, mas sem retorno
fun imprime(text: String){
   for(char in text){
      print( char + " ")
   }
   println();
}


// Funcção para reornar a data Atual
// retorno , mas sem parametros
fun getDataAtual(): Date{
   val dtAtual = Date()
   println ("Data Atual: $dtAtual\n")
   return dtAtual


}

// com 2 parametros e com retorno
fun max(a: Int, b: Int): Int{
   if(a > b ){
        println("O maior valor é: $a")
      return a;
   }else{
        println("O maior valor é: $b")
      return b;
   }

}


// Função principal que chama outras funções
fun main(args: Array<String>){
   //HelloWorld()
   imprime("Jon")

   getDataAtual()

   max(20,15);


}


/*
Função é uma unidade de codigo que executa uma tarefa especifica
tal qual o Metodo no Java ou C#

Para declarar uma função no Kotlin, usamos a palavra-chave `fun`, seguida pelo nome da função, parênteses e um bloco de código.

Funções podem receber parâmetros e retornar valores, mas também podem ser declaradas sem parâmetros ou sem retorno.


para declarar o tipo de uma função, usamos a seguinte sintaxe:

fun olaMundo(): String {
   return "ola Mundo"
}
nesse caso colocamos : após o nome da função, o que é similar ao que fazemos no Java, com public String olaMundo(){
}

caso não haja essa declaração, a função é por padrão um Unit, que é o equivalente ao void no Java, ou seja , não tem retorno algum
 */




