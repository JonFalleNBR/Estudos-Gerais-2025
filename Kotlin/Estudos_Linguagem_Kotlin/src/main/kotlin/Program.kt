import kotlin.system.exitProcess
import kotlin.io.*


fun main() {


    // Estudo sobre a linguagem Kotlin -- Fundamentos e logica

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


            }



