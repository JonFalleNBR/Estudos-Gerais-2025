
import InventoryItem
import java.util.*
import kotlin.system.exitProcess

fun main(args: Array<String>){

    val inventory = listOf(
        Book("Harry Potter", "J.K. Rowling", "Fantasia", 1996),
        Book("O Hobbit", "J.R.R. Tolkien", "Fantasia", 1937),
        DVD("Matrix", "Lana Wachowski", "Sci-Fi", 1999),
        DVD("Gladiador", "Ridley Scott", "Ação", 2000)
    )


print("Enter the name of the book: ")
    val input = readln()

    val item = inventory.find { it.title.equals(input, ignoreCase = true) }

    if(item != null){
        println("Item found ${inventory.indexOf(item) + 1}: ${item.getItemDetails()}")
        item.borrow()

    }else{
        println("Item not found. Good Bye ^ v ^")
        exitProcess(1);
    }


    }
