// *******************************************************************
//   PlusTest.java
//
//   Demonstrate the different behaviors of the + operator
// *******************************************************************
public class PlusTest
{
        // -------------------------------------------------
        // main prints some expressions using the + operator
        // -------------------------------------------------
        public static void main (String[] args)
        {
         System.out.println ("This is a long string that is the " +
                                 "concatenation of two shorter strings.");
         //Will print one long string
         System.out.println ("The first computer was invented about" + 55 +
                                 "years ago.");
         //Will print out one long string with no space between
         System.out.println ("8 plus 5 is " + 8 + 5);
         //Will just put the 8 and 5 next to each other
         System.out.println ("8 plus 5 is " + (8 + 5));
         //Will actually add 8 and 5
         System.out.println (8 + 5 + " equals 8 plus 5.");
         //Will print out 13 equals 8 plus 5
        }
}
