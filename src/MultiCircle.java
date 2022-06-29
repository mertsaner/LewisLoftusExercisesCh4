/**
 * @Author Mert Saner
 * Circle program which finds circumference and area of the any given circle
 */

public class MultiCircle {                  //driver class
    public static void main (String [] main) {

        Circle2 circle1, circle2;

        circle1 = new Circle2 (5);
        circle2 = new Circle2 (4);

        System.out.println("Descripiton of the circle1: " + circle1);
        System.out.println("Descripiton of the circle2: " + circle2);
    }
}

class Circle2 {     //Other Class where we define getters,setters,toString and necessary functions for our program
    // 💪🏻💪🏻💪🏻

    private double radius; // varibale radius declared

    public Circle2(double myRadius){       //Constructor method/function which will initialize the variables
        radius = myRadius;              //Can also written as this.radius= radius
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
        double circumference = 2*3.14*radius; //for exact result 2*Math.PI*radius
        return circumference;
    }

    public double area(){
        double area = 3.14*radius*radius; //for exact result Math.PI*radius*radius
        return area;
    }

    public String toString() {

        String result = "Radius: " + Double.toString(radius) +
                " Area: " + Double.toString(area()) +
                " Circumference: " + Double.toString(circumference()) ;

        return result;
    }
}