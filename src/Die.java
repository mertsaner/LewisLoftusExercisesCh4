//**********************************
// Die.java         Author: Lewis/Loftus
//
// Represents one die (singular of dice) with faces showing values
// between 1 and 6.
//**********************************

public class Die { //Die class responsible from initializing and updating of face value, which is called ENCAPSULATION
                    //The main method should not (and in fact cannot) access the faceValue variable directly.

    private final int MAX = 6; //maximum face value, written with final so that it will not change (like const in C++)
    int alpha;

    private int faceValue; // Initializing current value showing on the die
    private int backValue; // Initializing current value showing back of the die

    //All the variables defined privately so they we enforce encapsulation

    //----------------------------------------------------------------------------------
    // Constructor: Sets the initial face value. Note: Constructors are always same name with the class.
    // They are basically initializers of the object of the class
    //----------------------------------------------------------------------------------
    public Die(){       //Constructor does not use return type since initializes the object
        faceValue = 1;  //This initilization is optional
        backValue = 6;
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

    //-------------------------------------------------------------------------------------
    // getFaceDown method in coverage of Self-Review 4.21
    //-------------------------------------------------------------------------------------
    public int getFaceDown(){
        switch (faceValue) {//On a standard die, the sum of any two opposite faces is seven
            case 1:
                backValue = 6;
                break;
            case 2:
                backValue = 5;
                break;
            case 3:
                backValue = 4;
                break;
            case 4:
                backValue = 3;
                break;
            case 5:
                backValue = 2;
                break;
            case 6:
                backValue = 1;
                break;
        }
        return backValue;
    }


    //--------------------------------------------------------------------------------------
    // Returns a string representation of this die.
    //--------------------------------------------------------------------------------------
    public String toString () {
        String result = Integer.toString(faceValue);
        return result;
    }

    //All methods defined publicly so in here methods provide services to clients
    //These all are service methods
}
//========================================================================================
//                        public               ===             private
//====Variables==Violate Encapsulation         ===      Enforce Encapsulation
//====Methods====Provide Services to Clients   ===   Support other methods in the class
//========================================================================================