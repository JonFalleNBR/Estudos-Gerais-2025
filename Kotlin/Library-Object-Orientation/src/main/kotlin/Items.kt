import java.util.Date

class Book(title: String, author: String, genre: String, publicationYear: Int) : InventoryItem( title, creator = author,  genre, publicationYear) {

    override fun getItemDetails(): String {

        return "Title: $title, Author: $creator, Genre: $genre, Publication Year: ${publicationYear}"
    }


}


class DVD(title: String, val director: String, genre: String, releaseYear: Int) : InventoryItem(title, creator = director, genre, releaseYear) {

    override fun getItemDetails(): String {
        return "Title: $title, Director: $director, Genre: $genre, Release Year: ${publicationYear}";
    }

}


