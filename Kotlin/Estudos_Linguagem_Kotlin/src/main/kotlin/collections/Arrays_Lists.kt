package collections

fun main (args : Array<String>){


    //val array = arrayOf("João", "Marcos", "Lucas", "Mateus")

    /*val lista = listOf("Java", "Kotlin", "Python", "JavaScript")

    val arrayList = arrayListOf("Laranja", "Maçã", "Banana", "Pera")


    for (i in array.indices){
        print("Elemento ${array[i]} na posição $i \n")

    }


// ArrayMisto
   val mixed = arrayListOf("Java", 10, 3.14, true, 'F') // ArrayList pode conter diferentes tipos de dados

    for (item in mixed ){
        print("$item \n")
    }

    // Array de numeros Inteiros
    val numeros = intArrayOf(1,2,3,4)

    // array de numeros do tipo double
    val numerosDouble = doubleArrayOf(3.4,2.5,1.2)

    // arrays do tipo Boolean
    val booleanos = booleanArrayOf(true, false)

    // Nenhum desses arrays pode ser alterado após a criação, ou seja, são imutáveis.


    mixed[0] //como acesasr uma posição especifica do array ou imprimi-la - use o colchetes como em qualquer linguagem basica de programaçao

    print(mixed[1]) // numero 10

    val str = "Ola Mundo" // string aqui é uma coleção de caracteres, não um array
    println(str[0])
*/
    // exemplo de como concatenar arrays

   /* val array1 = arrayOf("Primeiro", "Segundo", "terceiro")
    val array2 = arrayOf("Quaarto", "Quinto", "Sexto")
    val allSrings = array1 + array2 // concatena os dois arrays
    println("\n array concatenado:  ${allSrings.size}")


    val empty : Boolean = numeros.isEmpty();

    if(array1.contains("Primeiro")){
        print("\n O array contém o elemento 'Primeiro'")

    }else{
        println("\n O array não contém o elemento Primeiro")

    }*/

    // como acessar elementos individuais de um array ou lista

    val arrayList = arrayListOf("João", "Marcos", "Lucas", "Mateus");
    val list = arrayListOf("Pedro")

    println (arrayList + list)

    println(arrayList.size)
    println(arrayList[0]) // Acessando o primeiro elemento do ArrayList
    println(arrayList.get(1))
    println(arrayList.isEmpty())
    println(arrayList.contains("Pedro"))

    arrayList.add("Judas") // nesse caso ele adiciona direto para o final do ArrayList

    arrayList.add(1, "Mary") // Adicionando "Mary" na posição 1 do ArrayList

    println(arrayList)
    /*

    use arrayOf para criar um novo Array
    use listOf para criar uma nova Lista

   use arrayListOf para criar uma nova ArrayLista

   A diferença da ArrayLista para os dois primeiros é que essa permite edição como adicionar ou remover um item -
   enquanto os outros dois são imutaveis , ou seja , não podem ser alterados após a criação.

     */
}