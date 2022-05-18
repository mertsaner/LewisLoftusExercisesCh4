/**
 *  Write a method that accepts two integers and
 *  returns the first integer raised
 *  to the power of second integer.
 */
import java.lang.Math;

public class e4_6 {

    public static void main(String[] args) {
        System.out.println(myMethod( 5, 4));
    }

    static double myMethod (int x, int y){
        return Math.pow(x, y);
    }
}