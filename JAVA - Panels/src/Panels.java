import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.io.File;


//JPanel = a GUI component that functions as a container to hold other components

public class Panels {

    public static void main(String[] args) {

        File file = new File("resources/crey.jpg");
        
        String imageOne = file.getAbsolutePath();
        
        ImageIcon icon = new ImageIcon(imageOne);


        JLabel label = new JLabel();
        label.setText("Hi!");
        label.setIcon(icon);
        //label.setVerticalAlignment(JLabel.BOTTOM); use with a border layout, layout's are null
        //label.setHorizontalAlignment(JLabel.RIGHT); use with a border layout, layouts are null
        label.setBounds(175, 175, 75, 75);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(null);
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);
        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

    }

}