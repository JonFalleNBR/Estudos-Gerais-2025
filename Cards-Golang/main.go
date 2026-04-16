package main // define as an executable package
import "fmt"

func main() {
	// var card string = "Ace of Spades"
	card := "Ace of Spades"   // type inference, no need to specify type
	card = "Five of Diamonds" // reassigning the value of card
	fmt.Println(card)
}
