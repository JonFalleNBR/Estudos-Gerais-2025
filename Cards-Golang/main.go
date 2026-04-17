package main

import "fmt"

func main() {

	cards := []string{newCard(), newCard(), "Ace of Spades"}
	cards = append(cards, "Six of Spades") // append adds a new element to the end of the slice and returns the updated slice

	for i, card := range cards {
		fmt.Println(i, card)
	}
}

func newCard() string {
	return "Five of Diamonds"
}

func deckSize() int {

	return 53
}
