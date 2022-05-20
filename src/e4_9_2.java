 /**
 * Author: Mert Saner
 * A method called randomColor creates and returns a Color object that represents a random color
 */

 //Git Detailed commands are added
 import java.awt.*;
 import javax.swing.*;
 import java.awt.Color;

 public class e4_9_2 {
     static int[] returnArray = new int[3];
     static int red;
     static int green;
     static int blue;

     public static void main(String[] args) {
         colorfulPanel myObject = new colorfulPanel();
         randomColor();

         red = returnArray[0];
         green = returnArray[1];
         blue = returnArray[2];

         JFrame frame = new JFrame("Colorful Panel");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         colorfulPanel panel = new colorfulPanel();
         frame.getContentPane().add(panel);
         frame.pack();
         frame.setVisible(true);
         //myObject.randomColor();
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

 class colorfulPanel extends JPanel {
         public colorfulPanel() {
             setPreferredSize(new Dimension(400, 125));
             //Color myColor = new Color(myObject.red, myObject.green, myObject.blue);
               Color myColor = new Color(e4_9_2.red, e4_9_2.green, e4_9_2.blue);
             setBackground(myColor);        //Set the color of the background panel
         }
}
