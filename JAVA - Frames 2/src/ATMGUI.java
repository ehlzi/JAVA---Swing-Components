import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class ATMGUI extends JFrame {
    
    ATMGUI () {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits application
        this.setTitle("Elzie's ATM Machince"); //sets title of frame
        this.setSize(420,420); //sets x and y dimension of frame
        this.setResizable(false); //prevent frame from being resized
        this.setVisible(true); //make frame visible
        
        ImageIcon image = new ImageIcon("LILB.jpg"); //create ImageIcon
        this.setIconImage(image.getImage()); //change icon of frame
        this.getContentPane().setBackground(new Color (0x123456)); //change color of background

    }

}
