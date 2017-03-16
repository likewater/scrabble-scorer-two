import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("I'm a Scrabble Scorer application! Please enter a word and I will return its scrabble score.");
    String usersWord = myConsole.readLine();
    Scrabble scrabble = new Scrabble();
    Integer scrabbleResult = scrabble.calculateScore(usersWord);
    System.out.println(scrabbleResult);
  }
}
