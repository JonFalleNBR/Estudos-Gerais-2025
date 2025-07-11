import java.util.Date

class Book(title: String, author: String, genre: String, publicationYear: Int) : InventoryItem( title, author,  genre, publicationYear) {

    override fun getItemDetails(): String {

        return "Title: $title, Author: $author, Genre: $genre, Publication Year: ${publicationYear}"
    }


}


class DVD(title: String, val director: String, genre: String, releaseYear: Int) : InventoryItem(title, director, genre, releaseYear) {

    override fun getItemDetails(): String {
        return "Title: $title, Director: $director, Genre: $genre, Release Year: ${publicationYear}";
    }

}


