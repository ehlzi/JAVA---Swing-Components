import java.awt.Color;
import java.awt.Font;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Labels {
    public static void main(String[] args) {

        File file = new File("resources/LILB.jpg");
        String imageOne = file.getAbsolutePath();

        JFrame frame = new JFrame(); //creates a frame
        ImageIcon image = new ImageIcon(imageOne); //sets image icon
        JLabel label = new JLabel(); //create a label
        Border border = BorderFactory.createLineBorder(Color.white, 10); //creates a border
        
        // OR JLabel label = new JLabel("Text here.");
        
        label.setText("Welcome to Elzie's ATM"); //set text of label
        label.setIcon(image); //sets icon to image
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT, of ImageIcon
        label.setVerticalTextPosition(JLabel.TOP); //set text TOP, CENTER, or BOTTOM of ImageICon
        label.setForeground(Color.white); //set color of text
        label.setFont(new Font("Roboto", Font.PLAIN, 20)); //set font of text
        label.setIconTextGap(25); //set gap of text from image
        label.setBackground(new Color(0x063970)); //set background color
        label.setOpaque(true); //set true to display background color
        label.setBorder(border); //enables borders
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of IconeImage and Text inside label
        label.setHorizontalAlignment(JLabel.CENTER); //set Horizontal position of IconeImage and Text inside label
        //label.setBounds(100, 100, 500, 500); //set x, y position in frame as well as size dimensions

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        //frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack(); //resize frame to accomadate components, add components before pack
        
        
    }
}
