// Updated version of FahrenheitPanel.java app
// Button added to the program
// Hence user can use both enter key or push button to see result of the calculation

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class FahrenheitPanel extends JPanel {

    private JLabel inputLabel, outputLabel, resultLabel;        //Object Declarations in class level
    private JTextField fahrenheit;
    private JButton push;   //"declaration" of push object from JButton class


    //----------------------------------------------
    //Constructor: Sets up the main GUI components.
    //----------------------------------------------
    public FahrenheitPanel() {       //Same name with class name

        // decleared Ojects are initialized, objects in this class are inputLabel, outputLabel, resultLabel, fahrenheit
        inputLabel = new JLabel("Enter Fahrenheit temperature");
        outputLabel = new JLabel("Temperature in Celsius: ");
        resultLabel = new JLabel("---");

        push = new JButton("Push me!");


        //new fahrenheit object is created
        fahrenheit = new JTextField(6); // Is this a initial value?
        fahrenheit.addActionListener(new TempListener());   //new TempListener Object from TempListener class created and passed to the addActionListener method

        TempListener newListener = new TempListener();//New object called newListener is added to ActionListener via push button
        //Here doing this doable since both objects(push button and enter key do the exact same thing
        //But if different kind of thing needed like adding a check box then it will do something different than calculation Fahrenheit value and
        //In such cases it is better to define new Java Class which implements ActionListener interface again (differently then initial version this times)
        push.addActionListener(newListener);

        //Adding all objects of JLabel to the Diagram
        add(inputLabel);
        add(fahrenheit);
        add(outputLabel);
        add(resultLabel);
        add(push);

        setPreferredSize(new Dimension(300, 125));   //Setting dimensions for Panel as we wish
        setBackground(Color.yellow);        //Set the color of the background panel
    }

    //Represents an action listener for the temperature input field.

    private class TempListener implements ActionListener    //TempListener Class  provides actual implementation of ActionListener in this program
    {
        //--------------------------------
        // ActionPerformed method performs the conversion when the enter key is pressed in the text field
        //--------------------------------
        public void actionPerformed(ActionEvent event) {
            int fahrenheitTemp, celsiusTemp; //ints
            String text = fahrenheit.getText(); //String text

            fahrenheitTemp = Integer.parseInt(text);        //text changed to int and make fahrenheitTemp equalized to it
            celsiusTemp = (fahrenheitTemp - 32) * 5 / 9;        //Actual Calculation

            resultLabel.setText(Integer.toString(celsiusTemp)); // resultLabel object uses setText method to write celcuisTemp to the frame in terms of String type
            //this type of writing shows there is an object which uses some methods
        }
    }
}
