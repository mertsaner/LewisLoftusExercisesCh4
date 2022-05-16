//*******************************************************************************
//  PushCounter.java            Author: Lewis/Loftus
//
//  Demonstrates a graphical user interface and an event listener.
//*******************************************************************************
import javax.swing.JFrame;

public class PushCounter {

    //----------------------------------------------------------------------------
    //  Creates the main program frame.
    //----------------------------------------------------------------------------

    public static void main (String[] args){

        JFrame frame = new JFrame("My Counter"); // Updated Push Counter
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new PushCounterPanel()); // new PushCounterPanel object passed to the add method of java.awt.Component package
        frame.pack();
        frame.setVisible(true);     //Enables that JFrame will be visible to us
    }
}
