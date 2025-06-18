package oriented_object_programm

 open class Person(open val name: String, open var age:Int) {// construtor primário com parametros - não é obrigatório, mas é uma boa prática
// Essa caracteristica é diferente de outras linguagens como Java, onde o construtor é separado da classe

     // open indica que a classe pode ser herdada, ou seja, outras classes podem estender essa classe - aula dia 17/06/2025 - Herança
     init {
         println("Object was created")
     }


     //metodos em kotlin são funções dentro de uma classe

     fun speak(): String {
         val message = "Hello $name, I am $age years old."
         print(message)

         return message
     }
     // fun sem o : String será por padrão do tipo Unit, que é o void do Kotlin , ou seja ,um metodo sem retorno


     fun greet(name: String) {
         print("\nHello World, $name")

     }
     //metodo com parametro no construtor, do tipo string

     fun count(name: String, age: Int): String {
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

// ------ classes Student e Employee - Herança em Kotlin ------
class Student(override val name: String,override var age:Int, val studentID: Long ): Person(name, age){
    // sobre Open Classes and Inheritance - Herança em Kotlin
    // override indica que estamos sobrescrevendo o construtor primário da classe Person - que esta declarado com open na classe mãe
    // A classe Student herda as propriedades e métodos da classe Person, e pode adicionar ou modificar comportamentos específicos

    init {
        println("Student created: Name = $name, Age = $age, Student ID = $studentID")
    }

    fun isIntelligent() = true;

}
// A classe Student e Employee herdam as propriedades e métodos da classe Person, e pode adicionar ou modificar comportamentos específicos
class Employee(override val name: String,override var age: Int): Person(name, age){

    fun receivePayment(){
        println("\nPayment received")

    }

}

fun main(args: Array<String>) {
   // val person = Person() // criando um objeto da classe Person com os parametros do construtor primário")
    //println("Name: ${person.name}, Age: ${person.age}")


    val student = Student("John", 22, 1234); // criando um objeto da classe Student com os parametros do construtor primário
    student.speak() // chamando o método speak da classe Person

    student.isIntelligent()

    val employee = Employee("Jane", 30); // criando um objeto da classe Employee com os parametros do construtor primário

    employee.getYearofBirthDay()

    employee.receivePayment()
}