import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

abstract class InventoryItem( val title: String , val creator: String, val genre: String, val publicationYear: Int) : Lendable {

    override var message: String = "..."
    override var isBorrowed: Boolean = false

    abstract fun getItemDetails(): String

    override fun borrow(): String {
        print("=== Welcome to the Item Borrowing System! ====\n");


        println("verificando a disponibilidade do item ${title}...")


        if (isBorrowed){
            println("The Item $title is already borrowed.")


        }else{
            println("The Item $title is available for borrowing.")
            println("Do you like to borrow the item $title? (yes/no)")
            val response = readln().lowercase();
               if (response == "yes"){
                   var dias = LocalDateTime.now().plusDays(4);
                   val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm")
                   val formattedReturnDate = dias.format(formatter)
                   message =  "🎉 O item ${getItemDetails()} foi emprestado com sucesso!\n" +
                           "📅 Data de devolução: $formattedReturnDate"
                   isBorrowed = true;
                   println(message);
                   return message;

               }

                else if (response == "no") {
                   message = "The item "+ getItemDetails() + " was not borrowed."
                   isBorrowed = false;
                   println(message);
                   return message;

               }
                    else {
                        message = "Invalid response. Please enter 'yes' or 'no'."
                        print(message)
                        return message;
                    }


                }

        return message;
    }


}
