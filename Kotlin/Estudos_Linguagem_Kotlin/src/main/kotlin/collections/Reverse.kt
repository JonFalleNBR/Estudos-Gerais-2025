package collections

fun main(args: Array<String>){
    val numbers = listOf(1,2, 3, 4, 5, 6, 7, 8, 9, 10)

    println(reverse(numbers))

    println(reverse2(numbers))


    //form mais simples ainda
    val reversed = numbers.reversed();
    println(reversed)
}

fun reverse(list: List<Int>): List<Int>{
    val result = arrayListOf<Int>()

    // for(i in 0..list.size - 1){ // outra forma de fazer a mesma coisa abaixo - percorre a lista toda com o range de indices de 0 a 9
    for(i in 0 until list.size){
        result.add(list.get(list.size - 1 - i))
    }

    return result;

}

// Outra forma de fazer a mesma coisa, mas mais simples e elegante
fun reverse2(list: List<Int>): List<Int>{
    val result = arrayListOf<Int>()

    // O que é o downTo? É uma forma de iterar de trás para frente
    for(i in list.size - 1 downTo 0){
        result.add(list.get(i))

    }

    return  result



}