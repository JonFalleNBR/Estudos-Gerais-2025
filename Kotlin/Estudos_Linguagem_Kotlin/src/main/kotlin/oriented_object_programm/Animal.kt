package oriented_object_programm

class Animal {

   private  var age : Int = 0  // em kotlin , os getters e setters são criados automaticamente, mas podemos definir manualmente se quisermos
    /*
        get() = field;
    set(value){
        if(value >= 0){
            field = value // field é a propriedade interna que armazena o valor

        }

     */

    protected  var name : String = "";
    internal val species : String = "";
    public var weight: Double = 0.0;

    }

/*
private é o nivel mais restrito de visibilidade dentre os modificadores de acesso em Kotlin, significa que a propriedade só pode ser acessada dentro da própria classe
protected é o modificiador que pode ser acessado dentro da propria classe e em subclasses que herdarem dessa classe , mas não de fora do contexto
internal é o modificador que permite acesso dentro do mesmo módulo, ou seja, dentro do mesmo projeto ou biblioteca
public é o modificador de acesso padrão, que permite acesso a partir de qualquer lugar do código
 */


//val só possui a pripriedade Getter, uma vez que é imutável, ou seja, não pode ser alterada após a inicialização

val name = ""
get() = field
    /* set nao vai funcionar pois o name é um val, ou seja, imutavel. como comentado acima -> só colocar get nesse caso


     */



fun main(agrs: Array<String>) {

    var animal = Animal();

    /*
    animal.age = 5 // definindo a idade do animal
    animal.age = -2;

    println(animal.age) // imprimindo a idade do animal, que será 5, pois o setter não permite valores negativos

     */
}