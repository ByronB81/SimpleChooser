import java.util.Random;

public class Game {

  public static Choice decision(Choice choice1, Choice choice2) {
    Random rand = new Random();
    int rnJesus = rand.nextInt(2) + 1;
    if (rnJesus == 2) {
      return choice2;
    } else {
      return choice1;
    }
  }

}
