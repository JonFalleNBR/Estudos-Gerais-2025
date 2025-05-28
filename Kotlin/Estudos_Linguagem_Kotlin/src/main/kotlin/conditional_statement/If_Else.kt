package conditional_statement

fun main (args: Array<String>){

    // sobre if else em kotlin

    var numero : Int;

    print ("Informe um numero: ")
    val input = readLine()
    numero = input?.toIntOrNull()?: 0;

    if(numero > 0){
        print ("O numero é posivo")



    }else if (numero <= 0){
        print("O numero é negativo ou zero")


    }else{
        print("Entrada Invalida")


    }

}