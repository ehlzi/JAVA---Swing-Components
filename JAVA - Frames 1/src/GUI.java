import java.awt.Color;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GUI {
    public static void main(String[] args) {
        
        File file = new File("resources/LILB.jpg");
        String imageOne = file.getAbsolutePath();

        ImageIcon image = new ImageIcon(imageOne); //create ImageIcon
        
        JFrame frame = new JFrame(); //creates a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits application
        frame.setTitle("Elzie's ATM Machince"); //sets title of frame
        frame.setSize(420,420); //sets x and y dimension of frame
        frame.setResizable(false); //prevent frame from being resized
        frame.setVisible(true); //make frame visible
        
        //ImageIcon
        frame.setIconImage(image.getImage()); //change icon of frame
        frame.getContentPane().setBackground(new Color (0x123456)); //change color of background
        
    }
    
}
