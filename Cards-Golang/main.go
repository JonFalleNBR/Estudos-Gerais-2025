package main

func main() {

	cards := newDeck() // aqui estamos criando uma nova variável chamada cards, que é do tipo deck, e estamos atribuindo a ela o valor retornado pela função newDeck(), que é um slice de strings com as cartas do baralho.
	cards.print()      // chama o metodo print() do tipo deck, que imprime cada carta na tela
}
