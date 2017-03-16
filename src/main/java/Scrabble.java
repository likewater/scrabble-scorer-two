public class Scrabble {
  public Integer calculateScore(String input){
    Integer score = 0;
    String[] wordList = input.split("");

    for (String lettersSplit : wordList) {
      if (lettersSplit.equals("a") || lettersSplit.equals("e") || lettersSplit.equals("i") || lettersSplit.equals("o") || lettersSplit.equals("u") || lettersSplit.equals("l") || lettersSplit.equals("n") || lettersSplit.equals("r") || lettersSplit.equals("s") || lettersSplit.equals("t")) {
        score += 1;
      } else if (lettersSplit.equals("d") || lettersSplit.equals("g")) {
        score += 2;
      } else if (lettersSplit.equals("b") || lettersSplit.equals("c") || lettersSplit.equals("m") || lettersSplit.equals("p")) {
        score += 3;
      } else if (lettersSplit.equals("f") || lettersSplit.equals("h") || lettersSplit.equals("v") || lettersSplit.equals("w") || lettersSplit.equals("y")) {
        score += 4;
      } else if (lettersSplit.equals("k")) {
        score += 5;
      } else if (lettersSplit.equals("j") || lettersSplit.equals("x")) {
        score += 8;
      } else {
        score += 10;
      }
    }
    return score;
  }
}
