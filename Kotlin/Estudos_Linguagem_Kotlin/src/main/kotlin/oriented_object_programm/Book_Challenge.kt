package oriented_object_programm

class Book_Challenge {

    // Classe de livro que faz parte do desafio proposto no curso

    // O livro deve conter os seguintes atributos: name, publication_year e se is borrowed or not

    var name: String = "Default Book Name"

    var publication_year: Int = 1900

    var author = "Default Author Name"

    var borrowed : Boolean = false

    init{
        this.name = name
        this.publication_year = publication_year
        this.author = author
        this.borrowed = borrowed

    }

    // Metodo para emprestar o Livro
    fun borrowedBook(): String {
        var message: String = ""

        while (!borrowed) {
            print("Enter the name of the book: ")
            name = readln() ?: "Default Book Name"
            print("do you like to borrow the book $name? (yes/no): ")
            val response = readln().lowercase()

            when (response) {
                "yes" -> {
                    var message = "The Book $name was borrowed successfully!"

                    borrowed = true
                }
                "no" -> {
                    message = "The Book $name was not borrowed."
                    borrowed = false
                }
                else -> {
                    message = "Invalid response. Please enter 'yes' or 'no'."
                    print(message)
                    continue // repete o loop se a resposta for inválida
                }

            }

        }

        print("Enter the name of the book to check its status: ")
        name = readln() ?: "Default Book Name"

        if (borrowed) {
            println("The book '$name' is currently borrowed.")
        } else {
            println("The book '$name' is available for borrowing.")
        }

        val info = getBookInfo()
        return info;
    }


    fun getBookInfo(): String {

        val result =
            "\nBook Name: $name," +
                    "\n Publication Year: $publication_year," +
                    "\n Autor: $author," +
                    "\n Borrowed Status: $borrowed"

        println(result)
        return result
    }


}


fun main (args: Array<String>) {
    val book = Book_Challenge() // criando um objeto da classe Book_Challenge

    // Definindo os atributos do livro
    book.name = "Kotlin Programming"
    book.publication_year = 2023
    book.borrowed = false

    // Chamando o metodo para emprestar o livro
    book.borrowedBook()
    // Verificando se o livro está emprestado ou não
}