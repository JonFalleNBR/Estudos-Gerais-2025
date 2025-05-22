fun main() {
    //println("Hello, Kotlin!")

/*
    var nome : String;

    print("Informe seu Nome:")
    nome = readLine() ?: "";

    println ("Ola $nome");



    // loop simples
    val asterisco = "*";

    for(i in 0..10){
        println(asterisco.repeat(i))
    }
*/
// Sequencia de Fibonnacci

    var a = 0;
    var b = 1;
    var c : Int;


    print("Quantos serão os valores ? ")
    val input = readLine();
    val valores = input?.toIntOrNull() ?: 0;

    println("Sequencia de Fibonnaci com $valores valores");

    for (i in 0 until valores) {


        if(i < valores -1){
           print("$a, ")


        }else{

            print("$a");

        }

        c = a + b;
        a = b;
        b = c;

    }
    }


