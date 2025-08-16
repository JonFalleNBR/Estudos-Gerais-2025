package challenges

import java.io.File

/*
A ideia desse desafio e´ler um arquivo txt que irá ter uma lista de Ips bloqueados
e identificar via map qual o país que mais bloqueia ips


 */

fun main(args: Array<String>) {


    val ipCount = mutableMapOf<String, Int>()

    File("src//60.ips.txt").forEachLine{ ip ->
        ipCount[ip] = ipCount.getOrDefault(ip, 0) + 1


    }


    val mostBlockedIp = ipCount.maxByOrNull { it.value }

    println("Ips mais bloqueados: ${mostBlockedIp?.key} (${mostBlockedIp?.value} vezes)" )


    }

