package oriented_object_programm

object Cache {
    val name = "Hyoercache"


    fun retrieveDate(): Int {

        return 0


    }

//exemplo de um singleton em kotlin - objeto que só pode ter uma instancia
// Singletons são uma classe que só pode ter uma única instância durante o tempo de execução do programa.
    // nai poide ser instanciada como new Cache()

    val nome = Cache.name
    fun showName() = println("Cache name is $nome")

}

fun main(args: Array<String>){

val CacheaName = Cache;
    CacheaName.showName()


}