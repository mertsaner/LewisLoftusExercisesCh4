import java.awt.*;
import javax.swing.*;
import java.awt.Color;
public class e4_9 {
    public static void main (String [] args){
        JFrame frame = new JFrame("Fahrenheit");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FahrenheitPanel2 panel = new FahrenheitPanel2();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
class FahrenheitPanel2 extends JPanel {
    public FahrenheitPanel2() {
        setPreferredSize(new Dimension(400, 125));
        Color myColor = new Color(100,100,25);
        setBackground(myColor);        //Set the color of the background panel
    }
}
