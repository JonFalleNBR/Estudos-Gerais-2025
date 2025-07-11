

abstract class InventoryItem( val title: String , val author: String, val genre: String, val publicationYear: Int) : Lendable {

override var message: String = "..."
    override var isBorrowed: Boolean = false

    abstract fun getItemDetails(): String


    override fun borrow(): String {
        /*
       Enquanto não estiver com isBorrowed = true , o loop de irá seguir com a logica a ser implementada

        */

        print("Welcome to the Book Borrowing System!\n");


        print("Enter the name of the book to check its status: ")
        val itemName = readln()

        if (isBorrowed){
            println("The Book or DVD $itemName is already borrowed.")


        }else{
            println("The Book $itemName is available for borrowing.")
            println("Do you like to borrow the book $itemName? (yes/no)")
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
