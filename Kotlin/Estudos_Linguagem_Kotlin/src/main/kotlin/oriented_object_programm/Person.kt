package oriented_object_programm

class Person {

    var name: String = "Jon";
    var age : Int = 28;

    //metodos em kotlin são funções dentro de uma classe

    fun speak(): String{
        val message = "Hello, my name is $name and i am $age yo"
        print(message)

        return message
    }
    // fun sem o : String será por padrão do tipo Unit, que é o void do Kotlin , ou seja ,um metodo sem retorno



    fun greet(name : String){
        print("\nHello World, $name")

    }
    //metodo com parametro no construtor, do tipo string

    fun count(name: String, age: Int): String{
        val message = "\nHello, my name is $name and i am $age yo"
        println(message)


        return message

    }
    // metodo com multiplos parametros e tipo definido de retorno


    //fun getYearofBithDay(): Int{
      //  return 2025 - age
    //}

fun getYearofBirthDay() = 2025 - age;
    // função de uma linha, sem o return, mas com o tipo definido - mesma de cima, mas mais elegante ja que o tratamento é mais simples


}

fun main(args: Array<String>) {
    val person = Person()
    //println("Name: ${person.name}, Age: ${person.age}")


   // person.name = "Michelle"
    //person.age = 17

    person.speak()
    person.greet("Mark")
    person.count("Anton", 20)
    println("\nYear of Birth: ${person.getYearofBirthDay()}")
}