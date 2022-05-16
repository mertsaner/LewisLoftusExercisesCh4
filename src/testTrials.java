/*      Author: Mert Saner
*        Name: TrialsShower
*       Purpose: This program user input and print out its trials in a following way.
*       Example Output: 01, 012, 0123, 01234, 012345, 0123456
* */





import java.util.*;

public class testTrials {

    public static void main(String[] args) {

        System.out.println("Please enter an input");
        int input = 1;
        boolean always = true;
        Scanner scan = new Scanner(System.in);

        while (always) {           //Keep receiving input until user enter an input which is bigger than 0
            input = scan.nextInt();     //scan object uses nextInt() method which defined in Scanner class


            String s = Integer.toString(input);//Now it will return "10"
            String earlier = s;
            System.out.println("Number of Trials equals to: " + s );


        }


    }
}
