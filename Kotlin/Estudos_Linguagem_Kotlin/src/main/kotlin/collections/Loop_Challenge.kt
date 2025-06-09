package collections

fun main(args: Array<String>) {


    // desafio é escrever um programa que calcula a soma valores de 100 a 100,000 e printa o resultado

    var sum = 0L // tipo Long

    for (i in 100..1000000) {
        sum += i;

// na pratica isso é 0 + 100  // 100 + 101 // 201 + 102 // 303 + 103 e assim por diante
//
// }

        print(sum)


        // MINHA RESPOSTA

/*
    var numero: Int = 100;

    for(i in numero..100000){
        val numero = numero + i;

        print(numero) // imprime o resultado da soma

    }
    */

        // Respsta mais elegante

        val resultado = (100..100000).sumOf { it.toLong() }
        println("\n A soma dos valores de 100 a 100000 é de $resultado")

    }
}// FIM DO DESAFIO





