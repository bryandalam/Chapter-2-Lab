
// **************************************************
//   RollingDice.java
//
//   To generate two random "lucky" numbers
// **************************************************
 
import java.util.Random;
 
public class RollingDice
{
   public static void main (String[] args)
   {
          Random generator = new Random();
          int dice1, dice2; 
 
          // Generate First Dice roll
          dice1 = (int) (generator.nextFloat() * 6) + 1;
 
          // Generate Second Dice Roll
 
          dice2 = (int) (generator.nextFloat() * 6) + 1;
 
          System.out.println ("You rolled: " + dice1 + " and " + dice2);
          System.out.println ("The total of your two rolls is: " + (dice1 + dice2));
          
        }
}
