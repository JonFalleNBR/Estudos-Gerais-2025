package oriented_object_programm

fun playGame() {

    println("Enter a word to guess:")
    val word = readLine();

    if (word == null) {
        println("No word entered, exiting the game.")
        return

    }


    for (i in 1..1000) {
        println()


    }

    // Tree
    // ['t', 'r', 'e', 'e']
    // {'t', 'r', 'e'} -- once word is entered, we can convert it to a set of unique letters and finish the game when all letters are guessed
    val letters = word.toLowerCase().toCharArray().toHashSet();
    val correctGuesses = mutableSetOf<Char>() // set to store correct guesses
    var fail = 0 // number of attempts made by the user
    // is that what hash do ?
    val attempts = 6;
    while (letters != correctGuesses && fail < attempts) {
        // print the =word that has been guessed so far
        // _______
        // _ e _ e _

        printExploredWord(word, correctGuesses)
        println("\nGuess a letter:")
        val guess = readLine()?.toLowerCase()?.get(0) // read a single
        if (guess == null || guess !in 'a'..'z') {
            println("Please enter a valid letter.")
            continue // skip the rest of the loop if input is invalid
        }
        if (guess in correctGuesses) {
            println("You already guessed that letter. Try again.")
            continue // skip the rest of the loop if letter was already guessed
        }
        if (guess in letters) {
            correctGuesses.add(guess) // add the guessed letter to the set of correct guesses
            println("Good guess!")
        } else {
            fail++ // increment attempts if the guess is wrong
            println("Wrong guess! Try again.")
        }


    }

    println("## wrong guesses : $fail")
    if (letters == correctGuesses) {
        println("🎉 Well done! You guessed the word: $word")
    } else {
        println("💀 You lost! The word was: $word")
    }


}


fun main(args: Array<String>) {

    do{
        playGame()
        println("Do you want to play again? (yes/no)")
        val answer = readLine()?.toLowerCase() ?: "no" // default to "

    }while(answer == "yes" || answer == "y") // ask the user if they want to play again

    println("Thanks for playing! Goodbye!")
}


fun printExploredWord(word: String, correctGuesses: Set<Char>) {
    // prints the word with underscores for unguessed letters
    val displayedWord = word.map { if (it in correctGuesses) it else '_' }.joinToString(" ")
    println(displayedWord)
}