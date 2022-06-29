public class BitValue {

    public static void main (String[] args)
    {
        Bits myBit, yourBit;

        myBit = new Bits();     //Creating new Bits object (named myBit) from Bits driver class
        yourBit = new Bits();     //Creating new Bits object (named yourBit) from Bits driver class

        System.out.println("Program Started!");
        System.out.println("You can see intial value of the bits below!");
        System.out.println("Value of the myBit is: " + myBit);
        System.out.println("Value of the myBit is: " + yourBit);

        System.out.println("ChangeBit function called! ");
        myBit.changeBit();
        yourBit.changeBit();

        System.out.println("Value of the myBit is: " + myBit);
        System.out.println("Value of the myBit is: " + yourBit);

        System.out.println("SetBit function called! ");
        myBit.setBit();
        yourBit.setBit();

        System.out.println("Value of the myBit is: " + myBit);
        System.out.println("Value of the myBit is: " + yourBit);

        System.out.println("ChangeBit function called! ");
        myBit.changeBit();
        yourBit.changeBit();

        System.out.println("Value of the myBit is: " + myBit);
        System.out.println("Value of the myBit is: " + yourBit);

        System.out.println("ChangeBit function called! ");
        myBit.changeBit();
        yourBit.changeBit();

        System.out.println("Value of the myBit is: " + myBit);
        System.out.println("Value of the myBit is: " + yourBit);
    }
}

class Bits {            //Driver Class, in which we define getters,setters,toString and  certain functions related with logic of the program

    private Boolean bit;    // variable bit declared as Boolean

    public Bits() {     //Constructor which initializes bits to true

        bit = true;     // each bit initialized to true
    }

    public void changeBit(){
        if (bit) {
            bit = false;
        }
        else {
            bit = true;
        }
    }

    public void setBit(){
        bit = true;
    }

   public String toString(){
        String result = Boolean.toString(bit);

        return result;
   }
}