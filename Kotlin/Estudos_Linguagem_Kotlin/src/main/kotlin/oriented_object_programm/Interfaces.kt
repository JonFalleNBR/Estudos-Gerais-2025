package oriented_object_programm

interface Driveable {

    // a função de uma Interface não tem corpo, ou seja, não tem implementação , mas ela obrigará a classe que a implementa a fornecer uma implementação para essa função
     // a interface é um "contrato" que a classe deve seguir, implementando os métodos definidos nela - um hub de metodos pré definidos que devem ser implementados nas classes que a implementam


    fun drive();  // todo metodo de uma interface é por padrão abstrato
}

class Car(val color: String): Driveable{

    override fun drive (){
        println("DRIVING CAR")

    }

}

class Motorcycle(val color: String): Driveable{


    override fun drive(){
        println("DRIVING MOTORCYCLE")
    }

}

fun main(args: Array<String>){
    val car = Car("Red")

    car.drive()  // chama o metodo drive da classe Car que implementa a interface Driveable para o carro

    val motorcycle = Motorcycle("Blue")

    motorcycle.drive()  // chama o metodo drive da classe Motorcycle que implementa a interface Driveable para a moto

    print("Motorcycle color: ${motorcycle.color}" + "\n")

}