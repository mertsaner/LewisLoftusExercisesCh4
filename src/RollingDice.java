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

        //===============================================================================================
        //Important these three calling style does the exact same thing
        // IMPORTANT: The "toString" method of any object gets "called automatically" whenever you pass the object to
        // a print or println method to obtain a string description of the object to print.
        //============

        // So first two is exactly the same
        // Last one is different method but reaches the same value
        //============ !IMPORTANT!=====
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);//We are printing the object, when we print an object
        //System.out.println("1 Die One: " + die1.toString() + ", Die Two: " + die2.toString());
        //System.out.println("2 Die One: " + die1.getFaceValue() + ", Die Two: " + die2.getFaceValue()); //The following line works and does the same job with the line above //Expected Writing, let see what it prints
        //===============================================================================================

        //System.out.println(5+5); //Works since in binary operator + could be used for two integer objects
        //System.out.println(" " + die1 + die2); //This works alright since first " " put everything to string mode
        //System.out.println(die1 + die2); //This gives an error since die1 and die2 are in string form


        die1.roll();  // Using roll operation(method) rolling die1 again
        die2.setFaceValue(4); // Using setFaceValue operation(method) change the state of the object
        //die2.setFaceValue(40); Normally setting 40 should not permitted

        System.out.println("Die One: " + die1 + ", Die Two: " + die2);//We are printing the object, I wonder what this will print :D

        sum = die1.getFaceValue() + die2.getFaceValue(); //sum object equals to sum of faceValue of two objects (die1 and die2)
        //The following line gives error since we can sum two objects from Die class with binary operator   //int sum2 = die1 + die2; //sum object equals to sum of faceValue of two objects (die1 and die2)
        //But we can sum two objects from int/double/float class using binary operator

        System.out.println("Sum: " + sum); //Printing the Sum
        //System.out.println("Sum2: " + sum2); //Printing the Sum


        sum = die1.roll() + die2.roll();  //Sum object equals to sum of the two rolls of two objects
        System.out.println("Die One: " + die1 + " , Die Two: " + die2);
        System.out.println("New sum: " + sum);

        System.out.println("BackValues are: ");
        System.out.println("Die One: " + die1.getFaceDown() + " , Die Two: " + die2.getFaceDown());

        return; //Although main is a void method there is nothing wrong with writing return(without return variable)
        // at the end of void methods
    } //End of the main method
}