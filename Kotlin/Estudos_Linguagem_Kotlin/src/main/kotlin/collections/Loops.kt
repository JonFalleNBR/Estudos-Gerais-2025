package collections

import kotlin.system.exitProcess

fun main(args: Array<String>){


    // classe para testes com Loops - For e While


    val array = arrayOf ("João", "Michelle", "Anton", "Mark")

    for (i in array.indices ){

        print("Elemento ${array[i]} na posição $i \n")
    }

    // tabuada

    var numero: Int;



        print("Informe o numero que voce quer ver a tabuada: ")
        val input = readLine()
        numero = input?.toIntOrNull() ?: 0 ;

        if (numero <= 0){
            println("Numero Invalido - Não é possivel realizar Multiplicação com numeros menores ou iguais a 0 ou maiores que 10. \n")

        }else{
            for (i in 1..10){
                val resultado = numero * i;
                println("$numero x $i = $resultado")

            }

        }

// in no for cria um range - o for no kotlin é bem mais simples que em outras linguagens fortemente tipadas

    var list = listOf("Kotlin", "Java", "Python", "JavaScript")

    for(item in list){ // semelhante ao foreach em outras linguagens - percorre uma lista de objetos
        print(item) // imprime os itens da lista


    }

    for((index, value) in list.withIndex()){
        println("Item na posição $index é $value") // imprime o indice e o valor do item na lista

        /*
        Semelhante ao forEach em outras linguagens, o withIndex() permite acessar o índice e o valor do item na lista.
        e tem a forma de fazer a mesma coisa aqui da seguinte forma

        for(item in list){
            print("Item esta na posição $item.indices \n" +
                  "Item na posição $item é ${list[item]} \n"
        }
         */

    }


}