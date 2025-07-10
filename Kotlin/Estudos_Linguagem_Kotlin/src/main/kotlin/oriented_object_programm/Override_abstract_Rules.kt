package oriented_object_programm

abstract class Course(val topic: String, val price: Double) {

    open fun learn() {
        println("Learning in the $topic Course")

    }
}
interface Learnable{
    fun learn(){
        println("Learning...")
    }

}

open class KotlinCourse(): Course("Kotlin", 99.99), Learnable{

    override final fun learn(){
        //super.learn() // chama o metodo paadrão da classe Course - para especificar qual metodo learn chamar, visto que tanto a classe base Course quanto a interface Learnable possuem um metodo learn - usa-se o
         // <> nesse caso
        super<Course>.learn() // chama o metodo learn da classe base Course para imprimir a mensagem padrão e evitar codigo repetido
        super<Learnable>.learn() // chama o metodo learn da interface Learnable para imprimir a mensagem padrão e evitar codigo repetido
        println("First you will learn the basics of Kotlin")

    }

}

class speacialKotlinCourse(): KotlinCourse(){
    /*
    override fun learn(){
        println("Then you will learn advanced topics of Kotlin")

    }
    o final na classe KotlinCourse impede que essa função seja sobrescrita em classes filhas
    */


}

fun main (args: Array<String>){
    val course = KotlinCourse()
    course.learn()


}