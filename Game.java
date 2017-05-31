import java.util.Random;

public class Game {

  public static Choice decision(Choice choice1, Choice choice2, Choice choice3, Choice choice4, Choice choice5) {
    Random rand = new Random();
    int rnJesus = rand.nextInt(5) + 1;
    if (rnJesus == 5) {
      return choice5;
    } else if (rnJesus == 4) {
      return choice4;
    } else if (rnJesus == 3) {
      return choice3;
    } else if (rnJesus == 2) {
      return choice2;
    } else {
      return choice1;
    }
  }

}
