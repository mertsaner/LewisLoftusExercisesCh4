//**********************************
// Die.java         Author: Lewis/Loftus
//
// Represents one die (singular of dice) with faces showing values
// between 1 and 6.
//**********************************

public class Die {

    private final int MAX = 6; //maximum face value, written with final so that it will not change (like const in C++)

    private int faceValue; // Initializing current value showing on the die

    //----------------------------------------------------------------------------------
    // Constructor: Sets the initial face value. Note: Constructors are always same name with the class.
    // They are basically initializers of the object of the class
    //----------------------------------------------------------------------------------
    public Die(){       //Constructor does not use return type since initializes the object
        faceValue = 1;
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