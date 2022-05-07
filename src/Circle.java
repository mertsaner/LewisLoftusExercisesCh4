//*********************************************************************
//  Circle.java         Author:Lewis/Loftus
//
//  Presents a circle with a particular position, size, and color.
//*********************************************************************

import java.awt.*;
import java.util.Random;


public class Circle {
    private int diamater, x, y;
    private int size;
    private Color color;    //Allocating color object from Color Class,
                            //Color Class defined in (java.awt.)Paint Class
                            //Hence we do not see Color class definition here

    //-------------------------------------------------------------------
    // Constructor: Sets up this circle with the specified values.
    //-------------------------------------------------------------------

    public Circle (Color shade, int upperX, int upperY){
        //diamater = size;
        //diamater will be generated random in the coverage of self-review question SR 4.29
        //====================================================
        //Generate random values between 20 and 200
        Random rand = new Random(); //new rand object from Random Class
        int upperbound = 201;
        int diameter = rand.nextInt(upperbound);
        //====================================================
        size = diameter;    //First pass random value (20-200) to the diameter
        diamater = size;    //Then uses that as a size of each new circle created
        color = shade;
        x = upperX;
        y = upperY;
    }

    //-------------------------------------------------------------------
    // Draws this circle in the specified graphics context.
    //-------------------------------------------------------------------

    public void draw (Graphics page){

        page.setColor(color);
        page.fillOval(x,y, diamater, diamater);
    }

    //-------------------------------------------------------------------
    // Diameter mutator.
    //-------------------------------------------------------------------
    public void setDiamater(int size) {
        diamater = size;
    }

    //-------------------------------------------------------------------
    //  Color mutator
    //-------------------------------------------------------------------

    public void setColor(Color shade)
    {
        color = shade;
    }

    //-------------------------------------------------------------------
    //  X mutator.
    //-------------------------------------------------------------------

    public void setX(int upperX){
        x = upperX;
    }

    //-------------------------------------------------------------------
    //  Y mutator.
    //-------------------------------------------------------------------

    public void setY(int upperY)
    {
        y = upperY;
    }

    //-------------------------------------------------------------------
    //  Diameter accessor
    //-------------------------------------------------------------------

    public int getDiamater()
    {
        return diamater;
    }

    //-------------------------------------------------------------------
    //  Color accessor.
    //-------------------------------------------------------------------

    public Color getColor()
    {
        return color;
    }

    //-------------------------------------------------------------------
    // X accessor.
    //-------------------------------------------------------------------

    public int getX()
    {
        return x;
    }

    //-------------------------------------------------------------------
    // Y accessor.
    //-------------------------------------------------------------------

    public int getY(){
        return y;
    }
}