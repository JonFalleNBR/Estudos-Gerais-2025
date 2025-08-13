package IO

import java.util.Random


fun main(args: Array<String>) {
    val number = Random().nextInt(100) + 1;
    var input: String?;
    var guess = -1;

    var attempts = 0;

    while (guess != number) {

        print("Guess the number between 1 and 100: ")
        input = readLine();

        if (input != null) {

            guess = input.toInt();
            attempts++;

        }
        if (guess < number) {
            println("too low, try again")
        } else if (guess > number) {
            println("too high, try again")


        }


    }
    println("CONGRATZ! You guesse the number $number in $attempts attempts!")
    println("would you like to play again? (yes/no)")
    val playAgain = readLine();

    if (playAgain == null || playAgain.lowercase() != "yes") {
        println("Thanks for playing!")

    } else {
        // Reset the game
        guess = -1;
        attempts = 0;
    }
}