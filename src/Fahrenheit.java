// Fahrenheit.java
// Purpose: Demonstrates the use of text fields

import javax.swing.*;

public class Fahrenheit {

    public static void main (String [] args){

        JFrame frame = new JFrame("Fahrenheit");        // New frame Object from JFrame class will be created
                                                            // Title of the frame is Fahrenheit
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // When cross button pushed program will be closed and execution of the program will stop

        FahrenheitPanel panel = new FahrenheitPanel();      // New panel object from FahrenheitPanel class created

        frame.getContentPane().add(panel);          // Check again this kind of multiple .().() in the future
        // panel added to the frame using add method
        frame.pack();       //Make screen fully as declared in setPreferredSize method which passes dimension object from Dimension Class
        frame.setVisible(true);     //Make frame visible
    }
}
