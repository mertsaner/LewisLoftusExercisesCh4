//*********************************************************************
//  Circle.java         Author:Lewis/Loftus
//
//  Presents a circle with a particular position, size, and color.
//*********************************************************************

import java.awt.*;

public class Circle {
    private int diamater, x, y;
    private Color color;    //Allocating color object from Color Class,
                            //Color Class defined in (java.awt.)Paint Class
                            //Hence we do not see Color class definition here

    //-------------------------------------------------------------------
    // Constructor: Sets up this circle with the specified values.
    //-------------------------------------------------------------------

    public Circle (int size, Color shade, int upperX, int upperY){

        diamater = size;
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