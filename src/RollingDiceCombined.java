//******************************
// RollingDice.java         Author: Lewis/Loftus
//
//  Demonstrates the creation and use of a user-defined class.
//******************************
public class RollingDiceCombined {
    //--------------------------------
    // Creates two Die objects and rolls them several times
    //--------------------------------
    public static void main(String[] args)
    {
        myDie die1, die2;    // Initialize die1 and die2 objects from Die class
        int sum;           // Initialize sum object from int class (Redefine what you have already known for a long time)

        die1 = new myDie (); // Creating new die object (named die1) from Die Class
        die2 = new myDie (); // Creating new die object (named die2) from Die Class

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
        System.out.println("0 Die One: " + die1 + ", Die Two: " + die2);//We are printing the object, when we print an object
        //System.out.println("1 Die One: " + die1.toString() + ", Die Two: " + die2.toString());
        //System.out.println("2 Die One: " + die1.getFaceValue() + ", Die Two: " + die2.getFaceValue()); //The following line works and does the same job with the line above //Expected Writing, let see what it prints
        //===============================================================================================

        //System.out.println(5+5); //Works since in binary operator + could be used for two integer objects
        //System.out.println(" " + die1 + die2); //This works alright since first " " put everything to string mode
        //System.out.println(die1 + die2); //This gives an error since die1 and die2 are in string form




        die1.roll();  // Using roll operation(method) rolling die1 again
        die2.setFaceValue(4); // Using setFaceValue operation(method) change the state of the object

        System.out.println("Die One: " + die1 + ", Die Two: " + die2);//We are printing the object, I wonder what this will print :D

        sum = die1.getFaceValue() + die2.getFaceValue(); //sum object equals to sum of faceValue of two objects (die1 and die2)
        //The following line gives error since we can sum two objects from Die class with binary operator   //int sum2 = die1 + die2; //sum object equals to sum of faceValue of two objects (die1 and die2)
        //But we can sum two objects from int/double/float class using binary operator

        System.out.println("Sum: " + sum); //Printing the Sum
        //System.out.println("Sum2: " + sum2); //Printing the Sum


        sum = die1.roll() + die2.roll();  //Sum object equals to sum of the two rolls of two objects
        System.out.println("Die One: " + die1 + " , Die Two: " + die2);
        System.out.println("New sum: " + sum);


    } //End of the main method
} //end of the class

//**********************************
// Die.java         Author: Lewis/Loftus
//
// Represents one die (singular of dice) with faces showing values
// between 1 and 6.
//**********************************

class myDie {  //cannot use public since there are many classes within one .java file

    private final int MAX = 6; //maximum face value, written with final so that it will not change (like const in C++)
    int alpha;

    private int faceValue; // Initializing current value showing on the die
    private int backValue; // Initializing current value showing back of the die


    //----------------------------------------------------------------------------------
    // Constructor: Sets the initial face value. Note: Constructors are always same name with the class.
    // They are basically initializers of the object of the class
    //----------------------------------------------------------------------------------
    public myDie(){       //Constructor does not use return type since initializes the object
        faceValue = 1;
        backValue = 117;
        //System.out.println("Alpha is: " + alpha); //prints zero since alpha initialized to 0

    }

    //-----------------------------------------------------------------------------------
    // roll () method : Rolls the die and return the result
    //-----------------------------------------------------------------------------------
    public int roll(){
        faceValue = (int)(Math.random() * MAX) + 1;

        return faceValue;
    }

    //-------------------------------------------------------------------------------------
    // Face value mutator. This method help us to set the FaceValue
    //-------------------------------------------------------------------------------------
    public void setFaceValue (int value){

        faceValue = value;
    }

    //-------------------------------------------------------------------------------------
    // Face value accessor. This method helps us to get the FaceValue
    //-------------------------------------------------------------------------------------
    public int getFaceValue(){ // first word represents type of identifier like public/private/protected
        // second word represents type of value it returns
        // third word represents name of the method
        return faceValue;
    }

    //--------------------------------------------------------------------------------------
    // Returns a string representation of this die.
    //--------------------------------------------------------------------------------------
    public String toString () {
        String result = Integer.toString(faceValue);
        return result;
    }
}