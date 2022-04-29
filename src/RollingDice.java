//******************************
// RollingDice.java         Author: Lewis/Loftus
//
//  Demonstrates the creation and use of a user-defined class.
//******************************
public class RollingDice {
    //--------------------------------
    // Creates two Die objects and rolls them several times
    //--------------------------------
    public static void main(String[] args)
    {
        Die die1, die2;    // Initialize die1 and die2 objects from Die class
        int sum;           // Initialize sum object from int class (Redefine what you have already known for a long time)

        die1 = new Die (); // Creating new die object (named die1) from Die Class
        die2 = new Die (); // Creating new die object (named die2) from Die Class

        die1.roll();  // Using roll operation(method) to roll die1
        die2.roll();  // Using roll operation(method) to roll die2

        System.out.println("Die One: " + die1 + ", Die Two: " + die2);//We are printing the object, I wonder what this will print :D
        //System.out.println("Die One: " + die1.getFaceValue() + ", Die Two: " + die2.getFaceValue());//Expected Writing, let see what it prints


        die1.roll();  // Using roll operation(method) rolling die1 again
        die2.setFaceValue(4); // Using setFaceValue operation(method) change the state of the object

        System.out.println("Die One: " + die1 + ", Die Two: " + die2);//We are printing the object, I wonder what this will print :D

        sum = die1.getFaceValue() + die2.getFaceValue(); //sum object equals to sum of faceValue of two objects (die1 and die2)
        System.out.println("Sum: " + sum); //Printing the Sum

        sum = die1.roll() + die2.roll();  //Sum object equals to sum of the two rolls of two objects
        System.out.println("Die One: " + die1 + " , Die Two: " + die2);
        System.out.println("New sum: " + sum);
    } //End of the main method
}
