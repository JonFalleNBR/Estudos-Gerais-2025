import kotlin.system.exitProcess
import kotlin.io.*
import kotlin.random.Random


fun main() {


    // Estudo sobre a linguagem Kotlin -- Fundamentos e logica


    // Conversão de Temperatura
    /*
    var temp: Double;

    print("Informe a temperatura desejada em Celsius:");
    //var c = readLine()!!.toDouble();
    var input = readLine()
    var c = input?.toDoubleOrNull() ?: run{
        print("Entrada Invalida , encerrando o Programa.")
        exitProcess(0)

    }  //Essa abordagem é mais segura, uma vez que evita nullPointerException


    while(c >= -273.15) { // Verifica se a temperatura é válida (não pode ser menor que o zero absoluto)
        print("Informe o padrão de conversão desejado (F/K)")
        val opcao = readLine()?.uppercase() // Default para Fahrenheit

             if (opcao.isNullOrEmpty()) {
                print("Saindo do programa...")
                exitProcess(0)
            }

              when (opcao) {
                        "F" -> {
                            val fahrenheit = (c * 9 / 5) + 32;
                             print("A temperatura em Fahrenheit é: $fahrenheit")
                              break
                            }
                        "K" -> {
                             val Kelvin = c + 273.15;
                             print("A temperatura em Kelvin é $Kelvin")
                            break
                            }
                            else -> {
                            print("Opção inválida, por favor escolha novamente ou tecle Enter para sair.")
                            continue
                             }

                        }


                    }


    // Jogo de adivinhação


    val numeroSecreto = (1..100).random()

    var tentativas = 0;


    var acertou = false ;

    while(!acertou ){
        print("\nInforme um numero entre 1 e 100: ");
        val inputNum = readLine();
        val numero = inputNum?.toIntOrNull() ?: run {
            print("Entrada inválida, encerrando o programa.")
            exitProcess(0)
        }
            tentativas++


            if(numero < numeroSecreto) {
                println("O Numero Informado é menor que o numero secreto, tente novamente")
            }else if(numero > numeroSecreto){
                println("O numero informado é maior que o numero Secreto, tente novamente")
            }
            else {
                acertou = true;
                println("Parabens voce acertou o numero informado em $tentativas tentativas! \n " +
                        "O numero secreto era $numeroSecreto");


            }


        }


    var nome : String;

    print("Informe um nome : ");
    nome  = readLine().toString();
     // ou readLine()?: "Desconhecido"
    println("Ola $nome")




    // print de asteriscos
    val asterisco = "*";

    for(i in 1..10){

        val linha = asterisco.repeat(i)
        print(linha + "\n")
    }

*/
    // Sempre que eu quiser declarar uma variavel como null eu preciso usar o ? após o tipo da variavel

    var nomeCompleto : String? = null

    print("Digite")
    nomeCompleto = readLine().toString()?: null;
    print(nomeCompleto?.length)
    // Se eu tentar acessar o length de nomeCompleto quando ele for null, eu terei um NullPointerException


    // caso eu queira fazer uma chamada de um metodo , eu não posso faze-lo , sendo o nomeCompleto null - mesmo que atribua valor mais tarde

// uma maneira de garantir que receba a mensagem NullPointerException em um objeto que esteja Nulo é colocar o !! após a declaração da variavel

    var mensagem: String? = null;

    mensagem!!.length
// Exception in thread "main" java.lang.NullPointerException
        }










