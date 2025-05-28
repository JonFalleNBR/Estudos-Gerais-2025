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

    var result = when(numero){
        1 ->
            println("O numero é 1")

        2 ->
            println("O numero é 2")

        3 -> println("O numero é 3")
        else ->{
            println("Numero invalido")

        }

    }


    // posso usar variaveis para iniciar as estruturas condicionais
    val x = if (numero < 0){
        "negativo"



    }else{
        "positivo"

    }

    print(x);


    // more advanced usage of when

    val x1 = 10;

    when(x1){
        5 -> println("é igual a 5");
        3*12 -> println("é igual a 36")
        in 1..20 -> println("está entre 1 e 20") // podemos usar ranges - verifica se valor de x1 esta entre 1 e 20
        else -> println("não é igual a 5, 36 ou está entre 1 e 20")

        // podemos usar expressoes mais complexas e ainda mesmo usar funções
    }

    val x2 = 15;

    when(x2){
        "Hey there".length -> println("é igual ao tamanho da String Hey There")


    }

  // Isso coloca o when como uma ferramenta ainda mais poderosa que o switch case do Java - uma vez que:
        // 1 - não precisa de Break
        // 2 - pode ser usado como uma expressão que retorna um valor
        // 3 - permite expressoes complexas diretamente no when
}