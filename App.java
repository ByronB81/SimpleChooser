import java.io.Console;

public class App {
  public static void main(String[] args){
    boolean appRunning = true;
    Console console = System.console();

    Game decisionTime = new Game();

    Player player1 = new Player();
    Player player2 = new Player();

    Choice choice1 = new Choice();
    Choice choice2 = new Choice();
    Choice choice3 = new Choice();
    Choice choice4 = new Choice();
    Choice choice5 = new Choice();

    while (appRunning){
      System.out.println("What is player 1's name?");
      player1.setName(console.readLine());
      System.out.println("What is player 2's name?");
      player2.setName(console.readLine());


      player1.playerTurn();
      choice1.setName(console.readLine());
      player2.playerTurn();
      choice2.setName(console.readLine());
      player1.playerTurn();
      choice3.setName(console.readLine());
      player2.playerTurn();
      choice4.setName(console.readLine());

      System.out.println("And whose idea was it to use the app?");
      System.out.println("...cuz they totes get an extra turn..");
      String wildCard = console.readLine();
      if (wildCard.equals(player1.name)){
        player1.playerTurn();
      } else {
        player2.playerTurn();
      }


      choice5.setName(console.readLine());

      Choice result = decisionTime.decision(choice1, choice2, choice3, choice4, choice5);


      System.out.println("Choice Made!");
      System.out.println(result.name);

      System.out.println("Would you like to play again or quit?");
      String appNav = console.readLine();
      if (appNav.equals("quit")){
        appRunning = false;
      }
    }

  }
}
