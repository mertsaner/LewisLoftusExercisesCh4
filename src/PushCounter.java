//*******************************************************************************
//  PushCounter.java            Author: Lewis/Loftus
//
//  Demonstrates a graphical user interface and an event listener.
//*******************************************************************************
import javax.swing.JFrame;
import java.util.* ;
public class PushCounter {

    //----------------------------------------------------------------------------
    //  Creates the main program frame.
    //----------------------------------------------------------------------------

    public static void main (String[] args){

        JFrame frame = new JFrame("My Counter"); // Updated Push Counter
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new PushCounterPanel()); // new PushCounterPanel object passed to the add method of java.awt.Component package
        frame.pack();
        //frame.setVisible(true);     //make  visible to us
        //Changed in a way that requires user input to work

        System.out.println("Please enter a number bigger than 0 to show the display");
        int input = 0;
        Scanner scan = new Scanner(System.in);

        while (input <= 0 ) {           //Keep receiving input until user enter an input which is bigger than 0
            input = scan.nextInt();     //scan object uses nextInt() method which defined in Scanner class
            if (input > 0) {
                frame.setVisible(true);
            }
        }
    }
}
