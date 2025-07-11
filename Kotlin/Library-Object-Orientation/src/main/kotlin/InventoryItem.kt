

abstract class InventoryItem( val title: String , val author: String, val genre: String, val publicationYear: Int) : Lendable {

    override var message: String = "..."
    override var isBorrowed: Boolean = false

    abstract fun getItemDetails(): String



    override fun borrow(): String {
        print("=== Welcome to the Item Borrowing System! ====\n");


        print("verificando a disponibilidade do item ${title}...\n")


        if (isBorrowed){
            println("The Item $title is already borrowed.")


        }else{
            println("The Item $title is available for borrowing.")
            println("Do you like to borrow the item $title? (yes/no)")
            val response = readln().lowercase();
               if (response == "yes"){
                   message = "The item " + getItemDetails() + " was borrowed successfully!";
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
