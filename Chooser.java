import java.io.Console;

public class Chooser {
  public static void main(String[] args){
    Console console = System.console();

    Choice choice1 = new Choice();
    Choice choice2 = new Choice();

    System.out.println("Please name your first choice");
    String choice1Input = console.readLine();
    System.out.println("Please name your second choice");
    String choice2Input = console.readLine();

    choice1.name = choice1Input;
    choice2.name = choice2Input;

    String result = decision();


    System.out.println("Choice Made!");
    System.out.println("You have chosen " + choice1.name + " or " + choice2.name);

  }
}
