package collections

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


}