public class Player {
  String name;
  Choice playerChoice1;
  Choice playerChoice2;
  boolean playerTurn = false;

  public void setName(String nameSetter){
    this.name = nameSetter;
  }

  public void setChoice1(Choice choiceSetter) {
    this.playerChoice1 = choiceSetter;
  }

  public void setChoice2(Choice choiceSetter) {
    this.playerChoice2 = choiceSetter;
  }

  public void playerTurn(){
    System.out.println(this.name + " make a choice.");
  }

}
