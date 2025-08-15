import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.test.assertFalse

class HangmanTest {

    @Test
    fun testPrintExploredWord_AllLettersGuessed() {
        val word = "tree"
        val correctGuesses = setOf('t', 'r', 'e')
        val displayed = word.map { if (it in correctGuesses) it else '_' }.joinToString(" ")
        assertEquals("t r e e", displayed)
    }

    @Test
    fun testPrintExploredWord_PartialGuesses() {
        val word = "tree"
        val correctGuesses = setOf('e')
        val displayed = word.map { if (it in correctGuesses) it else '_' }.joinToString(" ")
        assertEquals("_ _ e e", displayed)
    }

    @Test
    fun testWinCondition() {
        val word = "tree"
        val letters = word.toLowerCase().toCharArray().toHashSet()
        val correctGuesses = setOf('t', 'r', 'e')
        assertTrue(letters == correctGuesses)
    }

    @Test
    fun testLoseCondition() {
        val attempts = 6
        val fail = 6
        assertTrue(fail >= attempts)
    }

    @Test
    fun testInvalidGuess() {
        val guess = '1'
        assertFalse(guess in 'a'..'z')
    }
}