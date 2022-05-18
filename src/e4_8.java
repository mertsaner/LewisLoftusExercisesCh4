
import java.lang.Math;
import java.util.*;
// randomInRange method return
// a random integer in the specified range (inclusive).
public class e4_8 {

    public static void main (String[] args) {
        System.out.println(randomInRange(1,10000));
    }

    static int randomInRange (int minValue, int maxValue){
        int result = 0;
        result = (int) Math.floor(Math.random()*(maxValue-minValue+1) + minValue);
        //with casting double value changed to int value
        return result;
    }
}
