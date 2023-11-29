//Noah Wichman and Cole Anderson
//Hunt The Wumpus
//11/21/2023
//Period 6

//Chating
/* CHATING
// MAYBE HAVE THEM IN A LIST THEN REMOVE AS SELECTED
//List can be complicted might want to stay away from their and just have public var
//Lets talk to teach about teams later
.// you dont like our group?
//Im not worried abour are group if we were to do it with are group we do it perfctly fine its just it would be borning becs we wouldnt do anything extra
// We definitely could do extra but we'll talk more later
//Yea Im think of doing a 3rd person 8 bit style version like how pokeomon works that veiw
//POkemon? You know what am talking about look at my computer
// Kk


// REiber probaly wants us to have a team of 3 becs that what the slides said 3-8
*/

// Random Maze
/* HOW TO MAKE THE RANDOM MAZE


//Get 3 random location on a 5 by 5 grid (maybe 5 x 5 x 5) 
//Make sure the 3 random locations ARE NOT one the same tile
//Define location as a bottom less pit
//One location as Wumpus
//One location as Bats


*/


//3 judges 
//TO THE SPEC
//CREATIVTY / INVOATIED
//CODE IS CLEAN


//------------------------- Importing Labs --------------------------------\\
import java.io.*; 
import java.util.Random;
import java.util.Scanner; 


//--------------------------- Main Class -----------------------------------\\
class Main {

  //------------------------------ Main Method -----------------------------\\
  public static void main(String[] args) {
  
    // Creating A Scanner \\
    Scanner user = new Scanner(System.in);
    Random RandomN = new Random();
    
    // Getting A Random Location \\
    int[] coordinateList = getRandomLocations();
    int rand_x = coordinateList[0];
    int rand_y = coordinateList[1];


    // Creating the hunter

    Protagonist prot = new Protagonist(1,40, user);
    //Creating the monster
    Monster wumpus = new Monster (rand_x, rand_y, 10, 10, "wumpus", RandomN, prot);
    wumpus.battle();

    



    //Ran without error Print statment \\
    System.out.println("Ran without Error");
    
  }
  
  //------------------------------------------------------------------------\\
  
  //------------------------ Getting A random Location ---------------------\\
  public static int[] getRandomLocations(){

    
    // Creating The Random Object
    
    Random RandomN = new Random();

    //Getting A Random Values
    int rand_X = RandomN.nextInt(6) + 0;
    int rand_Y = RandomN.nextInt(6) + 0;

    
    return new int[] {rand_X, rand_Y};
    

  }
  //------------------------------------------------------------------------\\
}
//---------------------------------------------------------------------------\\
