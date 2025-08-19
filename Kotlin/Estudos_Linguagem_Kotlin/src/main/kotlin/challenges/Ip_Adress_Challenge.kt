package challenges

import java.io.File

/*
A ideia desse desafio e´ler um arquivo txt que irá ter uma lista de Ips bloqueados
e identificar via map qual o ip mais bloqueado da lista.


 */

fun main(args: Array<String>) {

var ipCount = mutableMapOf<String, Int>()


    File("src//60.ips.txt").forEachLine { ip ->
            ipCount[ip] = ipCount.getOrDefault(ip, 0) + 1


    }


    var mostBlockedIp = ipCount.maxByOrNull { it.value }

    println("The most Blocked Ip is ${mostBlockedIp?.key} (${mostBlockedIp?.value}) times")

    }
