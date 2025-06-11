package oriented_object_programm

class Vehicle(model: String, color: String)
{
// construtor primário com parametros - não é obrigatório, mas é uma boa prática
// Essa caracteristica é diferente de outras linguagens como Java ou C#, onde o construtor é separado da classe
    //Isso facilita a legibilidade deixando o codigo menos verboso, e mais leve, fora que é bem util em classes DTOs


    var model: String
    var color: String


    init{
        // Bloco de inicialização - é executado quando o objeto é criado
        this.model = model
        this.color = color
        println ("Vehicle created with model: $model and color: $color")


    }




    /*
No java

    public class Vehicle{
        public string modelo ;
        public string cor ;


        public Vehicle(String modelo, String cor){
            this.modelo = modelo;
            this.cor = cor;
            System.out.println("Veiculo criado com modelo: " + modelo + " e cor: " + cor);
        }

    }


    Kotlin de maneira mais enxuta ainda

    class Vehicle(var model: String, var color: String) {
    init {
        println("Vehicle created with model: $model and color: $color")
    }


}

    */
    // Os objetos ja tem Getters and Setters por padrão, não é necessário declarar - e podem ser acessados diretamente por qualquer metodo da classe
    fun Modelito(): String {

      val mensagem =  "\nO Modelo é : $model"
        println(mensagem)
        return mensagem
    }

}


fun main (args: Array<String>){

val vehicle = Vehicle("Civic", "Red")

    // criando um objeto da classe Vehicle com os parametros do construtor primário
    vehicle.Modelito();
    // vehicle.model = "Civic"
    // vehicle.color = "Red"
     println("Model: ${vehicle.model}, Color: ${vehicle.color}")

}