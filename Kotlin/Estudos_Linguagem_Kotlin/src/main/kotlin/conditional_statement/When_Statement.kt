package conditional_statement

fun main (args : Array<String>){

    var numero: Int;

    print ("Informe um numero: ")
    val imput = readLine()
    numero = imput?.toIntOrNull() ?: 0

    when {
        numero > 0 -> println("O numero é positivo")
        numero < 0 -> println("O numero é negativo")
        else -> println("O numero é zero")
    }

    when(numero){
        1 ->
            println("O numero é 1")

        2 ->
            println("O numero é 2")

        3 -> println("O numero é 3")
        else ->{
            println("Numero invalido")

        }




    }


}