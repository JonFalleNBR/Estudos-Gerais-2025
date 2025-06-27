package oriented_object_programm

interface Driveable {

    // a função de uma Interface não tem corpo, ou seja, não tem implementação , mas ela obrigará a classe que a implementa a fornecer uma implementação para essa função
     // a interface é um "contrato" que a classe deve seguir, implementando os métodos definidos nela - um hub de metodos pré definidos que devem ser implementados nas classes que a implementam


    fun drive();  // todo metodo de uma interface é por padrão abstrato
}


interface Buildable{
    val timeRequired: Int; // variável para armazenar o tempo necessário para construir a moto

    // a variável de uma interface é por padrão abstrata, ou seja, não tem implementação, mas deve ser implementada pelas classes que a implementam tal qual os metodos

    fun build(); // outro metodo de uma interface, que deve ser implementado pelas classes que a implementam

}


class Car(val color: String): Driveable, Buildable{

        override val timeRequired = 120 // tempo necessário para construir o carro, implementando a interface Buildable

    override fun drive (){
        println("DRIVING CAR")

    }

    override fun build(){
        println("BUILDING CAR, and it takes $timeRequired minutes to build it.")

    }

}

class Motorcycle(val color: String): Driveable, Buildable{

    override val timeRequired = 60

    override fun drive(){
        println("DRIVING MOTORCYCLE")
    }

    override fun build(){


        println("BUILDING MOTORCYCLE, and it takes $timeRequired minutes to build it.")
    }

}

fun main(args: Array<String>){
    val car = Car("Red")

    car.drive()  // chama o metodo drive da classe Car que implementa a interface Driveable para o carro

    car.build() // chama o metodo build da classe Car que implementa a interface Buildable para o carro

    val motorcycle = Motorcycle("Blue")

    motorcycle.drive()  // chama o metodo drive da classe Motorcycle que implementa a interface Driveable para a moto

    motorcycle.build() // chama o metodo build da classe Motorcycle que implementa a interface Buildable para a moto

    print("Motorcycle color: ${motorcycle.color}" + "\n")

}