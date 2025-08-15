package IO

import java.io.File


fun main(args: Array<String>) {
    // Reading a file line by line
    var lineNumber = 0 ;
    File("src//inputfile.txt").forEachLine {
        println(it);
        ++lineNumber;
        println("Line $lineNumber: $it")

    }

// forEachLine é uma função que le cada linha por linha de um arquivo por vez, e executa a ação passada como lambda para cada linha.


}