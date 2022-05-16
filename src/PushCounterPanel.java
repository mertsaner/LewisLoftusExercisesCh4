import java.awt.*;  //Importing Java Abstract Window Toolkit (Java AWT)
import java.awt.event.*;    //Importing Java Abstract Window Toolkit (Java AWT)
import javax.swing.*; //Importing javax.swing package


// Importing these built-in packages enable us to use
// components and events that are predefined by classes in the Java Class library.

public class PushCounterPanel extends JPanel {

    private int count;
    private JButton push;   //"declaration" of push object from JButton class
    private JLabel label;   //"declaration" of label object from JLabel Class
    private JCheckBox myCheckbox; //"declaration" of myCheckbox object from JCheckBox Class
    private boolean box = false;
    //JButton, JLabel, JCheckBox all of which are predefined

    //-------------------------------------------------------------
    //  Constructor: Sets up the GUI.
    //-------------------------------------------------------------

    public PushCounterPanel() {

        count = 0;
        //===Declare new objects
        push = new JButton("Push me!");
        myCheckbox = new JCheckBox("Accept term and Conditions!", false);

        //===Adding New Listener to PushButton
        myCheckbox.addActionListener(new BoxChecker());
        //===CHANGES
        //Instead using original which passes new ButtonListener Object to the addActionListener method/interface
        //I have created new object called newListener and pass that to the addActionListener method/interface
        //New implementation is much easier to read and understand
        //===
        ButtonListener newListener = new ButtonListener();
        push.addActionListener(newListener);


       // push.addActionListener(new ButtonListener());       //Original


        //===Create new label object with "Pushes:" writing
        label = new JLabel("Pushes:" + count);

        //===Adding all objects to the frame
        add(push);
        add(label);
        add(myCheckbox);

        //Arranging dimensions of the frame and Colors
        setPreferredSize(new Dimension(300, 90));
        setBackground(Color.cyan);
    }

    //****************************************************************************
    // Represents a listener for button push(action) events.
    //****************************************************************************
    private class ButtonListener implements ActionListener { // This class provides the actual implementation of ActionListener interface.
        // Name of the class: Button Listener
        // Interface : ActionListener
        //------------------------------------------------------------------------------
        //  Updates the counter and label when the button is pushed.
        //-------------------------------------------------------------------------------
        public void actionPerformed(ActionEvent event) {        //Implement keyword is used to implement interfaces to the classes
            if(box) {
                count++;
                label.setText("Pushes: " + count);
            }
            else
            {
                label.setText("Please accept terms and conditions!");
            }
        }
    }

    private class BoxChecker implements ActionListener      //Implement keyword is used to implement interfaces to the classes
        //More on this later on
    {
        //------------------------------------------------------------------------------
        //  Updates the counter and label when the button is pushed.
        //-------------------------------------------------------------------------------
        public void actionPerformed(ActionEvent event){
            box = true;
        }
    }
}