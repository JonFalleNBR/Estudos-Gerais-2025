package oriented_object_programm

enum class Color(val rgb: Int) {

    RED(0xFF0000) , GREEN(0x00FF00), BLUE(0x0000FF), YELLOW (0xFFFF00), BLACK(0x000000), WHITE(0xFFFFFF);

    // Enum é uma classe especial que define um conjunto fixo de constantes, neste caso, as cores - AULA 46

}

fun main(args: Array<String>) {

    // numeros entre 0..9 ->
    // aula sobre sistema headecimal e binario
    println(0x10) // 16 em decimal - é o 0 com todos os numeros entre 0 e 9 e letras A a F
    println(0x1F) // 31 em decimal
    println(0xFF) // 255 em decimal

    println(0x000000) //preto
    println(0xFFFFFF) // branco
    println(0xFF0000) // vermelho
    println(0x00FF00) // verde
    println(0x0000FF) // azul
}