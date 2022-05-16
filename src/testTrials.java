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
        int count = 0;
        String myString = "0";
        String earlier = "";
        boolean always = true;
        Scanner scan = new Scanner(System.in);

        System.out.println("Number of Trials equals to: " + myString);
        count = 1; // add to proper start
        while (always) {           //Keep receiving input until user enter an input which is bigger than 0
            int input = scan.nextInt();     //scan object uses nextInt() method which defined in Scanner class
            earlier = Integer.toString(count); //string earlier is equal to new trial in each turn
            count++;
            myString =  myString + earlier ;
            System.out.println("Number of Trials equals to: "+  myString );
        }
    }
}