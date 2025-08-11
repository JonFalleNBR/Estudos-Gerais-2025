package oriented_object_programm

class Animal {

var age : Int = 0  // em kotlin , os getters e setters são criados automaticamente, mas podemos definir manualmente se quisermos
    get() = field;
    set(value){
        if(value >= 0){
            field = value // field é a propriedade interna que armazena o valor

        }

    }

//val só possui a pripriedade Getter, uma vez que é imutável, ou seja, não pode ser alterada após a inicialização

val name = ""
get() = field
    /* set nao vai funcionar pois o name é um val, ou seja, imutavel. como comentado acima -> só colocar get nesse caso


     */
}


fun main(agrs: Array<String>) {

    var animal = Animal();

    animal.age = 5 // definindo a idade do animal
    animal.age = -2;

    println(animal.age) // imprimindo a idade do animal, que será 5, pois o setter não permite valores negativos
}