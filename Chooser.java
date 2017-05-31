import java.io.Console;

public class Chooser {
  public static void main(String[] args){
    Console console = System.console();
    Game decisionTime = new Game();

    Choice choice1 = new Choice();
    Choice choice2 = new Choice();
    Choice choice3 = new Choice();
    Choice choice4 = new Choice();
    Choice choice5 = new Choice();

    System.out.println("Please name your first choice");
    String choice1Input = console.readLine();
    System.out.println("Please name your second choice");
    String choice2Input = console.readLine();
    System.out.println("Please name your third choice");
    String choice3Input = console.readLine();
    System.out.println("Please name your fourth choice");
    String choice4Input = console.readLine();
    System.out.println("Please name your fifth choice");
    String choice5Input = console.readLine();

    choice1.name = choice1Input;
    choice2.name = choice2Input;
    choice3.name = choice3Input;
    choice4.name = choice4Input;
    choice5.name = choice5Input;


    Choice result = decisionTime.decision(choice1, choice2, choice3, choice4, choice5);


    System.out.println("Choice Made!");
    System.out.println(result.name);

  }
}
