
//--------------------------- Monster Class --------------------------------\\
import java.util.Random;

class Monster {

    int x;
    int y;
    int health;
    int damage;
    String type;
    Random random;
    String wumpusDrops[];
    Protagonist prot;
    String protChoice;
    public Monster(int x, int y, int health, int damage, String type, Random random, Protagonist prot) {
        this.random = random;
        this.x = x;
        this.y = y;
        this.health = health;
        this.damage = damage;
        this.type = type;
      this.prot = prot;
        this.wumpusDrops = new String[]{"Horn", "Horn", "Horn", "Horn", "Horn", "Guts", "Guts", "Guts", "Teeth", "Horn", "Horn", "Horn", "Horn", "Horn", "Horn", "Horn", "Horn", 
            "Guts", "Guts", "Guts", "Teeth", "Horn", "Horn", "Horn", "Horn", "Horn", "Guts", "Guts", "Guts", "Teeth", "Horn", "Horn", "Horn", "Horn", "Horn", "Guts", "Guts", "Guts",
            "Teeth", "Horn", "Horn", "Horn", "Horn", "Horn", "Guts", "Guts", "Guts", "Teeth", "Horn", "Horn", "Horn", "Horn", "Horn", "Guts", "Guts", "Guts", "Teeth", "Horn", "Horn", 
            "Guts", "Guts", "Guts", "Teeth", "Horn", "Horn", "Horn", "Horn", "Horn", "Guts", "Guts", "Guts", "Teeth", "Horn", "Horn", "Horn", "Horn", "Horn", "Guts", "Guts", "Guts",
            "Teeth", "Crown"};
    }

    public void run(Monster monster) {
        this.x += random.nextInt(7) - 3;
        this.y += random.nextInt(7) - 3;
    }

    public void death() {
        // Add logic for what happens when a monster dies
      System.out.println("It dropped " + this.wumpusDrops[random.nextInt(this.wumpusDrops.length)]  );
    }

  // Battling with the wumpus
  public void battle(){
    boolean battling = true;
    System.out.println("The " + this.type + " has found you!");
    System.out.println("The battle has begun");
    int turn = 1;
    while (battling){
      
      System.out.println("--------------------------- Turn " + turn + "-------------------------------");


      protChoice = prot.choice();
      if(protChoice.equals("attack")){
      System.out.println("You deal " + prot.attack + " damage");
      this.health -= prot.attack;
      System.out.println("The " + this.type + " has " +  this.health + " health points remaining");
      }
      else if(protChoice.equals("heal")){
        System.out.println("You heal " + prot.heal + " health points");
        prot.health += prot.heal;
        System.out.println("The " + this.type + " has " +  this.health + " health points remaining");
      }
      else{
        System.out.println("You ran away");
        battling = !battling;
        break;
      }
      
      System.out.println("The " + this.type + " deals " + this.damage + " damage");
      prot.health -= this.damage;
      System.out.println("You have " +  prot.health + " health points remaining");
      

      if (prot.health <= 0){
        System.out.println("You have fallen");
        //prot.death();
        battling = false;
      }


      
      else if (prot.health <= 5){
        
        System.out.println("You will die next Turn");
        System.out.println("Better Heal Up");
        
      }

      if (this.health <= 0){
        System.out.println("The " + this.type + " has fallen");
        this.death();
        battling = false;
      }



      else if (this.health <= 5){

        System.out.println("The " + this.type + " is dying");
        System.out.println("The " + this.type + " ran away");

        battling = !battling;

      }
      turn++;
    }
  }
}
