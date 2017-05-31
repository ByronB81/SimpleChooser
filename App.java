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

    System.out.println("+===========================+");
    System.out.println("+---------------------------+");
    System.out.println("+===Decision  Indecisions===+");
    System.out.println("+-----------by--------------+");
    System.out.println("+=======Byron=Blocker=======+");
    System.out.println("+---------------------------+");
    System.out.println("+===========================+");
    System.out.println();
    System.out.println("I'm here to help indecisive people make choices");
    System.out.println("but first...");
    System.out.println();

    System.out.println("What is your name?");
    player1.setName(console.readLine());
    System.out.println("And what is your friend's name?");
    player2.setName(console.readLine());
    System.out.println();
    System.out.println("Super awesome, well, " + player1.name + " and " + player2.name);

    while (appRunning){
      System.out.println("LET'S MAKE SOME CHOICES!!!");
      player1.playerTurn();
      choice1.setName(console.readLine());
      player2.playerTurn();
      choice2.setName(console.readLine());
      player1.playerTurn();
      choice3.setName(console.readLine());
      player2.playerTurn();
      choice4.setName(console.readLine());

      System.out.println();
      System.out.println("And whose idea was it to use this awesome app?");
      System.out.println("...cuz they totes get an extra turn..");
      String wildCard = console.readLine();
      if (wildCard.equals(player1.name)){
        player1.playerTurn();
      } else {
        player2.playerTurn();
      }


      choice5.setName(console.readLine());

      Choice result = decisionTime.decision(choice1, choice2, choice3, choice4, choice5);

      System.out.println();
      System.out.println("Good choices... let me think about it");
      System.out.println();
      System.out.println("##");
      System.out.println("####");
      System.out.println("######");
      System.out.println("########");
      System.out.println("###########");
      System.out.println("#Choice Made#");
      System.out.println();
      System.out.println("*******it is time for*******");
      System.out.println();
      System.out.println(result.name.toUpperCase() +  " " + result.name.toUpperCase() + " " + result.name.toUpperCase());
      System.out.println();
      System.out.println("That wasn't so hard, was it?");
      System.out.println();
      System.out.println("          8====D   O        ");
      System.out.println();
      System.out.println();
      System.out.println("Would you like to play again or quit?");
      String appNav = console.readLine();
      if (appNav.equals("quit")){

        System.out.println("+===========================+");
        System.out.println("+---------------------------+");
        System.out.println("+===========Goodbye=========+");
        System.out.println("+---------------------------+");
        System.out.println("+============Human==========+");
        System.out.println("+---------------------------+");
        System.out.println("+===========================+");

        appRunning = false;
      }
    }

  }
}
