package oriented_object_programm

class Pessoa(val nome: String, val idade: Int) {

    init{
        println("Pessoa criada: Nome = $nome, Idade = &idade" +
                "\n")

    }
    fun falar(){
        println("Ola meu nome é $nome e tenho $idade anos.")

    }




}