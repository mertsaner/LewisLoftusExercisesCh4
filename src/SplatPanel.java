//*****************************************************************************
//  SplatPanel.java         Author: Lewis/Loftus
//
//  Demonstrates the use of graphical objects
//*****************************************************************************

import javax.swing.*;
import java.awt.*;

public class SplatPanel extends JPanel
{
    private Circle circle1, circle2, circle3, circle4, circle5; //5 objects allocated via Circle Class


    //--------------------------------------------------------------------------
    //Constructor
    //--------------------------------------------------------------------------
public SplatPanel () {       //Constructor which initializes circle1, circle2, circle3, circle4, circle5 objects from Circle class
    circle1 = new Circle(30, Color.red, 70, 35);
    circle2 = new Circle(50, Color.green, 30, 20);
    circle3 = new Circle(100, Color.cyan, 60, 85);
    circle4 = new Circle(45, Color.yellow, 170, 30);
    circle5 = new Circle(60, Color.blue, 200, 60);

    setPreferredSize(new Dimension(300, 200));  //The method inherited from
    setBackground(Color.black);
}

    //--------------------------------------------------------------------------
    //Draws this panel by requesting that each circle draw itself
    //--------------------------------------------------------------------------

    public void paintComponent (Graphics page) {

        super.paintComponent(page); //Enables coloring of the background
        //drawing circles to the page using draw method from Circle Class
        circle1.draw(page);
        circle2.draw(page);
        circle3.draw(page);
        circle4.draw(page);
        circle5.draw(page);
    }
}