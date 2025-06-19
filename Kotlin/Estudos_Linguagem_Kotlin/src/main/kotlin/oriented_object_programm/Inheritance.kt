package oriented_object_programm

abstract class Pessoa(open val nome: String, open val idade: Int) {

    // abstract class Pessoa é uma classe abstrata, ou seja, não pode ser instanciada diretamente - mas configura como uma
    // classe base para outras classes que herdam dela, como Aluno - e ´por padrão já possui o modificador open
    init{
        println("Pessoa criada: Nome = $nome, Idade = &idade" +
                "\n")

    }
    abstract fun falar()
       // println("Ola meu nome é $nome e tenho $idade anos.")



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

     override fun falar() {
            val message = "Olá, meu nome é $nome e tenho $idade anos. Minha nota é %.2f".format(nota)
            println(message)

            // Chama o método cumprimentar da classe base Pessoa
            cumprimentar()

     }


}

class Funcionario(override val nome: String, override var idade:Int, val salario: Double): Pessoa(nome, idade) {

    fun calcularSalarioAnual(): Double {
        val salarioAnual = salario * 12
        println("O salario anual de $nome é R$%.2f".format(salarioAnual) + "\n")
        return salarioAnual

    }

    override fun falar(){
        val message = "Olá, meu nome é $nome e tenho $idade anos. Meu salário é R$%.2f".format(salario)
        println(message)

        // Chama o método cumprimentar da classe base Pessoa
        cumprimentar()

    }
}

fun main(args: Array<String>){


    val aluno = Aluno("João", 20, 8.5)
    aluno.falar()
    aluno.cumprimentar()
    aluno.anoNascimento()
    aluno.CalculaNota(8.0, 9.0, 7.5)



    val funcionario = Funcionario("Maria", 30, 2500.00)
    funcionario.falar()
    funcionario.calcularSalarioAnual()

}