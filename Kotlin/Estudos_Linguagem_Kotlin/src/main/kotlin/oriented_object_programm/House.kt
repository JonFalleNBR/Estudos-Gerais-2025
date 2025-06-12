package oriented_object_programm

class House(val height: Double, val color : String , val price: Int = 500000  ){
// sobre nomes de parametros e Default Values
//  o valor de price esta definido como default 500000, caso nao seja passado um valor para ele

    fun print(){
        println("\nHouse Info: " +
                "\n[height: $height" +
                "\ncolor: $color" +
                "\nprice: $price" +
                "]")
    }


}

fun main (args: Array<String>){

    val house = House(10.0, "Blue", 200000)
    house.print()

    val redHouse = House(color = "Red", price = 150000, height = 8.0) // usando named arguments alterando a ordem do construtor original
    redHouse.print()

    val defaultHouse = House(12.0, "Green") // usando o valor default de price
    defaultHouse.print()

    //defaultHouse.price = 10000; // isso nao funciona, pois price é um val (imutável), se fosse var funcionaria
}