import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FahrenheitPanel extends JPanel
{

    private JLabel inputLabel, outputLabel, resultLabel;
    private JTextField fahrenheit;

    //---------------------------------------
    //Constructor: Sets up the main GUI components.
    //---------------------------------------
    public FahrenheitPanel() {       //Same name with class name

        inputLabel = new JLabel("Enter Fahrenheit temperature");
        outputLabel = new JLabel("Temperature in Celsius: ");
        resultLabel = new JLabel("---");

        //new fahrenheit object is created
        fahrenheit = new JTextField(5); // Is this a initial value?
        fahrenheit.addActionListener(new TempListener());

        //Adding all objects of JLabel to the Diagram
        add(inputLabel);
        add(fahrenheit);
        add(outputLabel);
        add(resultLabel);

        setPreferredSize(new Dimension(300, 75));
        setBackground(Color.yellow);
    }

    //Represents an action listener for the temperature input field.

    private class TempListener implements ActionListener
    {

        //--------------------------------
        // ActionPerformed method performs the conversion when the enter key is pressed in the text field
        //--------------------------------

        public void actionPerformed(ActionEvent event) {
            int fahrenheitTemp, celsiusTemp;
            String text = fahrenheit.getText();

            fahrenheitTemp = Integer.parseInt(text);
            celsiusTemp = (fahrenheitTemp-32) * 5/9;

            resultLabel.setText(Integer.toString(celsiusTemp));
        }
    }
}
