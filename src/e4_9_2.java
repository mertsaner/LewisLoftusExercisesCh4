 /**
 * Author: Mert Saner
 * A method called randomColor creates and returns a Color object that represents a random color
 */
 
 import java.awt.*;
 import javax.swing.*;
 import java.awt.Color;

 public class e4_9_2 {      //Only one class name with public prefix possible
     static int[] returnArray = new int[3];
     static int red;
     static int green;
     static int blue;

     public static void main(String[] args) {
         colorfulPanel myObject = new colorfulPanel();  //An object called myObject created from colorfulPanel class
         //For instance int abc = 5 means, object abc created from integer class and initialized to 5
         randomColor();
         //colorfulPanel.colorfulPanel2();

         //colorfulPanel myMethod = new colorfulPanel(/* constructor args here */);
        // myMethod.colorfulPanel2(); // Having fixed name to follow conventions


         red = returnArray[0];
         green = returnArray[1];
         blue = returnArray[2];

         JFrame frame = new JFrame("Colorful Panel");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         colorfulPanel panel = new colorfulPanel();
         frame.getContentPane().add(panel);
         frame.pack();
         frame.setVisible(true);
     }

     static int[] randomColor() {
         int red = (int) Math.floor(255 * Math.random() + 0);
         int green = (int) Math.floor(255 * Math.random() + 0);
         int blue = (int) Math.floor(255 * Math.random() + 0);
         returnArray[0] = red;
         returnArray[1] = green;
         returnArray[2] = blue;
         return returnArray;
     }
 }

 class colorfulPanel extends JPanel {       //Second class in the same .java file
                                            //colorfulPanel class extends JPanel class
                                            //colorfulPanel class inherits characteristics of the Jpanel class
                                            //colorfulPanel method
     //
                //Since this method is the same name with the class name it works as an constructor
     public colorfulPanel()  {
             setPreferredSize(new Dimension(400, 125));
             //Color myColor = new Color(myObject.red, myObject.green, myObject.blue);
               Color myColor = new Color(e4_9_2.red, e4_9_2.green, e4_9_2.blue);   //this line written with the help of Intellij Show Quick Fixes feature
               //red green and blue objects called from the class e4_9_2
             setBackground(myColor);        //Set the color of the background panel
         }

}
