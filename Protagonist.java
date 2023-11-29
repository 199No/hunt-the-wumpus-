import java.util.Scanner;

class Protagonist{
  Scanner user;
  int attack;
  int health;
  String choose;
  int heal;
  public Protagonist(int attack, int health, Scanner user){
    this.attack = attack;
    this.health = health;
    this.user = user;
    this.heal = 10;
  }

  public String choice(){
    System.out.println("Would you like to attack, heal or run?");
    System.out.println("______________________________________");
    System.out.println();
    choose = user.next();
    return choose;
  }
}
