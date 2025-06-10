package oriented_object_programm

class Person {

    var name: String = "Jon";
    var age : Int = 18;



}

fun main(args: Array<String>) {
    val person = Person()
    println("Name: ${person.name}, Age: ${person.age}")


    person.name = "Michelle"
    person.age = 17
}