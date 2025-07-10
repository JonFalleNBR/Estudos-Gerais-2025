package oriented_object_programm

class Book(val title: String, val author: String, val publicationYear: Int, var price: Double){

}


data class DataBook(val title: String, val author: String, val publicationYear: Int, var price: Double) {

    // Data classes automatically generate equals(), hashCode(), toString(), and copy() methods
    // This is useful for creating immutable data objects with built-in functionality
    // The primary constructor parameters are used to define the properties of the data class

    // apesar dos metodos equals, hashCode, toString e copy serem gerados automaticamente, tambem podemos
    // implementar metodos proprios na data class, como o print() abaixo
    fun print(): String {
        val message =  "";
        println(message)
        return message

    }

    /*

    - Basicamente a diferença entre os dois ali é
    que um ja cria os metodos genericos que consomem
     os dados do construtor, enquanto a classe Book comum
      eu preciso gerar na mão ... entendi bem ?


        Sim, você entendeu corretamente. A principal diferença entre a classe comum Book e a
         data class DataBook é que a data class já
         gera automaticamente métodos como equals(), hashCode(), toString() e
         copy() com base nos parâmetros do construtor primário. Na classe comum Book,
         você precisaria implementar esses métodos manualmente, caso precise deles.

     */

}

fun main(args: Array<String>){

    val book = Book("Dear John", "John Doe", 1910, 99.99);
    val book2 = Book("Dear John", "JohnDoe", 1910, 99.99);

    val dataBook = DataBook("Supe Book", "Super Author", 2025, 99.99);
    val dataBook2 = DataBook("Supe Book", "Super Author", 2025, 99.99);

    println(book) // imprime a referência de memória da classe Book, pois não tem o método toString() implementado
    println(dataBook) // ja tem o metodo toString implementado automaticamente

    //metodo equals
    println(book.equals(book2)) // false, pois não tem o método equals() implementado
    println(dataBook.equals(dataBook2)) // true, pois o método equals() é gerado automaticamente e compara os valores dos atributos

    // metodo copy
    val dataBook3 = dataBook.copy(price = 89.99) // cria uma cópia do dataBook com o preço alterado
    println(dataBook3)


    // Desestruturação de dados - posso imprimir os valores dos atributos sem precisar acessar cada um deles individualmente
    val (title, author, publicationYear, price) = dataBook

    println(title)
    println(author)


    // Hesh Code
    val set = hashSetOf(dataBook, dataBook2, dataBook3) // cria um conjunto de dataBooks, usando o hashCode() gerado automaticamente
    println("O SET AQUI DO HAS => $set")


}