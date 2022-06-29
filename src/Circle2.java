/**
 * @Author Mert Saner
 * Circle program which finds circumference and area of the any given circle
 */

public class Circle2 {

    public static void main (String [] main) {

    MultiCircle circle1, circle2;

    circle1 = new MultiCircle ();
    circle2 = new MultiCircle ();

    }
}

class MultiCircle {     //driver class where we define getters,setters,toString and necessary functions for our program
                        // 💪🏻💪🏻💪🏻

    private double radius; // varibale radius declared

    public MultiCircle(double myRadius){       //Constructor method/function which will initialize the variables
        radius = myRadius;
        //COMMENT: If you doubt which side to write which variable
        // Don't forget that declared VARIABLES on the TOP ALWAYS GOES LEFT SIDE
    }

    public void setRadius(double radius2){
        radius = radius2;
    }

    public double getRadius(){
        return radius;
    }

    public double circumference(){
        double circumference = 2*Math.PI*radius;
        return circumference;
    }

    public double area(){
        double area = 2*Math.PI*radius*radius;
        return area;
    }

    public String toString() {

        String result = "Radius of this circle is: " + Double.toString(radius) +
                "Area of this circle is: " + Double.toString(area()) +
                "circumference of this circle is: " Double.toString(circumference()) ;

        return result;
    }
}