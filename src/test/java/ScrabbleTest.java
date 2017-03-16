import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {

    @Test
    public void calculateScore_returnsScoreForSingleLetter_1() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("a"));
  }

    @Test
    public void calculateScore_returnsScoreForTwoLetters_2() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 2;
    assertEquals(expected, testScrabble.calculateScore("ra"));
  }

    @Test
    public void calculateScore_returnsScoreForManyLettersDiffValues_10() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 10;
    assertEquals(expected, testScrabble.calculateScore("rack"));
  }

    @Test
    public void calculateScore_returnsScoreForAnyLettersDiffValues_43() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 43;
    assertEquals(expected, testScrabble.calculateScore("qjkfbdaq"));
  }

}
