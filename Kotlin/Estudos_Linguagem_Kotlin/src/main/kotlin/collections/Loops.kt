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


    // Sobre loops While e do-while

    var x = 9;

    while(x >= 0){
        print("\n $x")
        x -= 1; // ou x--
        // começou em 9 , e foi decrementando ate chegar a 0
        if(x == 0){

            print ("\nValor chegou a 0 amigue :D")
            //exitProcess(0);
        }
    }

    // em um loop while ele irá criar um loop enquanto a condição for verdadeira


    var i= 0;
    while(i <= 10){
        print(i)
        i++ // nesse caso o loop não vai rodar, pois a condição é falsa desde o começo

    }
    for(i in 1..10){
        // nesse caso o loop funciona foi estipula que 1 é o valor inicial de i e acaba no 10

    }


    var user = object {
        var isOnline = true
    }

    // loop while para verificar se o usuario esta online
    while(user.isOnline){
        print("Usuario esta Online, pressione qualquer tecla para sair... \n")
        val input = readLine()
        if(input != null && input.isNotEmpty()){
            print("Ate mais! \n")
            user.isOnline = false // altera o estado do usuario para offline
            //exitProcess(0)

        }
        return // sai do loop e encerra o programa

    }


    // uso do Break e Continue

    for(c in "python"){
        if ( c == 'o'){
            break // interrompe o loop quando encontrar a letra 'o'

        }
        print(c)

    }


    println("------------------------------------------")

    var lista = listOf("Book", "Table", "Chair", "Pen")

    for(str in list){
        if(!str.contains('o')){
            continue

        }

        print(str);

    }
// Em Kotlin não e muito comum ou recomendado o uso do Break ou COntinue, mas caso necessario é um recurso bom para interações entre fluxos de controle dentro dos loops




    // como nomear os loops

    outer@ for(i in 1 .. 10){
        for(j in 1..10){
            if(i - j == 5 ){
                break@outer
            }
            print("$i - $j \n")
        }
        // ele vai parar o loop externo quando a condição for atendida
        // foi usado o nome no loop externo para que o Break aponte para ele e funcione corretamente
        // para definir um nome use o @ antes no nome do Loop
    }
}