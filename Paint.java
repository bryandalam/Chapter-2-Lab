
//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
 import java.util.Scanner;
 import java.lang.Math;
public class Paint
{
        public static void main(String[] args)
        {
            Scanner keyboard = new Scanner(System.in);
            final int COVERAGE = 350;  //paint covers 350 sq ft/gal
            //declare integers length, width, and height;
            int length;
            int height;
            int width;
            int doors;
            int windows;
            //declare double totalSqFt;
            double totalSqFt;
            //declare double paintNeeded;
            double paintNeeded;
    
            //Declare and initialize the length of the room
            System.out.println("What is the length of the room");
            length = keyboard.nextInt();
 
            //Declare and initialize the width of the room
            System.out.println("What is the width of the room");
            width = keyboard.nextInt();
 
            //Declare and initialize the height of the room
            System.out.println("What is the height of the room");
            height = keyboard.nextInt();
            //Declare and initialize the number of doors
            System.out.println("How many doors are in the room?");
            doors = 20 * keyboard.nextInt();
            //Declane and itialize the number of windows in the room
            System.out.println("How many windows are in the room?");
            windows = 15 * keyboard.nextInt();
 
            //Compute the total square feet to be painted--think
            //about the dimensions of each wall
            totalSqFt = (2 *(length * height) + 2 * (width* height) + (length * width)) - (windows + doors);
 
            //Compute the amount of paint needed
            paintNeeded = (totalSqFt/350);
 
            //Print the length, width, and height of the room and the
            //number of gallons of paint needed.
            System.out.println("Length = " + length);
            System.out.println("Width = " + width);
            System.out.println("Height = " + height);
            System.out.printf("The number of gallons of paint needed = " +  paintNeeded);
        }
}
