package oriented_object_programm

open class Pessoa(open val nome: String, open val idade: Int) {

    init{
        println("Pessoa criada: Nome = $nome, Idade = &idade" +
                "\n")

    }
    fun falar(){
        println("Ola meu nome é $nome e tenho $idade anos.")

    }

    fun cumprimentar(): String{
        val message = "Ola $nome, tudo bem ?"
        println(message)

        return message

    }


    fun anoNascimento(): Int{
        val anoNascimento: Int = 2025 - idade;
        print("Eu nasci em $anoNascimento" +
                "\n")
        return anoNascimento

    }


}

class Aluno(override val nome: String, override var idade:Int, val nota: Double): Pessoa(nome, idade){

    fun CalculaNota(nota1: Double, nota2: Double, nota3: Double): Double{
        val media = (nota1 + nota2 + nota3) / 3

        if(media >  6.0){
            println("Aluno $nome aprovado com media: %.2f".format(media) + "\n")

        }else{
            println("Aluno $nome reprovado com media: %.2f".format(media) + "\n")

        }

        return media

    }

}


fun main(args: Array<String>){


    val aluno = Aluno("João", 20, 8.5)
    aluno.falar()
    aluno.cumprimentar()
    aluno.anoNascimento()
    aluno.CalculaNota(8.0, 9.0, 7.5)


}