/*      Author: Mert Saner
*       Name: TrialsShower
*       Purpose: This program user input and print out its trials in a following way.
*       Example Output: 01, 012, 0123, 01234, 012345, 0123456
* */

import java.util.*;
public class testTrials {

    public static void main(String[] args) {

        System.out.println("Please enter an input");
        // Declaration and Initialization of Variables
        int input = 0;
        int count = 0;
        String s2 = "";
        boolean always = true;
        Scanner scan = new Scanner(System.in);

        s2 = Integer.toString(count);    //string s2 is equal to new trial in each turn
        System.out.println("Number of Trials equals to: " + s2);
        String earlier = s2;
        count = 1; // add to proper start
        while (always) {           //Keep receiving input until user enter an input which is bigger than 0
            input = scan.nextInt();     //scan object uses nextInt() method which defined in Scanner class
            earlier = Integer.toString(count);
            count++;
            s2 =  s2 + earlier ;
            System.out.println("Number of Trials equals to: "+  s2 );
        }
    }
}