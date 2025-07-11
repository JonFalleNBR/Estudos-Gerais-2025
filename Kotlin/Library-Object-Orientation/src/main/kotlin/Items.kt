import java.util.Date

class Book(title: String, author: String) : InventoryItem( title, author,  "Horror", 1990) {

    override fun getItemDetails(): String {

        return "Title: $title, Author: $author, Genre: $genre, Publication Year: ${publicationYear}"
    }


}


class DVD(title: String, val director: String) : InventoryItem(title, director, "Horror", 1990) {

    override fun getItemDetails(): String {
        return "Title: $title, Director: $director, Genre: $genre, Release Year: ${publicationYear}";
    }

}


