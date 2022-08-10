import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

//JLayeredPane is a swing container that provides a third dimension for positioning components
//Example: depth, z-index

public class Main {

    public static void main(String[] args) {

    JLabel label1 = new JLabel(); //Creates an instance of JLabel
    label1.setOpaque(true); //Allows us to see the label
    label1.setBackground(Color.RED); //Sets background color to Red
    label1.setBounds(50, 50, 200, 200); //Sets bounds since we are not using a layout manager

    JLabel label2 = new JLabel(); //Creates an instance of JLabel
    label2.setOpaque(true); //Allows us to see the label
    label2.setBackground(Color.BLACK); //Sets background color to Red
    label2.setBounds(100, 100, 200, 200); //Sets bounds since we are not using a layout manager

    JLabel label3 = new JLabel(); //Creates an instance of JLabel
    label3.setOpaque(true); //Allows us to see the label
    label3.setBackground(Color.BLUE); //Sets background color to Red
    label3.setBounds(150, 150, 200, 200); //Sets bounds since we are not using a layout manager

    //JLayeredPane's name by layers
    //1. Default - standard layer, where most components go (the bottommost layer).
    //2. Palette - palette layer, sits over default layer (floating toolbars and palettes, so they can be positioned above components)
    //3. Modal - modal dialogs, they will appear on top of any toolbars, paletts, or standard components in the container
    //4. PopUp - displays above dialogs, associated with combo boxes, tooltips, and other help text that will appear above the component, palette, or dialog that generated them
    //5. Drag - drag layer, ensures that the componenet is positioned over every other component in the container (when finished dragging, componenet can be reassigned to its normal layer) 
    
    JLayeredPane layeredPane = new JLayeredPane(); //Creates an instance of JLayeredPane
    layeredPane.setBounds(0, 0, 500, 500); //Sets location and size of JLayeredPane in frame
    layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER); //Adds label1 to pane
    layeredPane.add(label2, JLayeredPane.DEFAULT_LAYER); //Adds label2 to pane
    layeredPane.add(label3, JLayeredPane.DRAG_LAYER); //Adds label3 to pane


    JFrame frame = new JFrame("JLayeredPane"); //Creates an instance of JFrame
    frame.add(layeredPane); //Adds JLayeredPane to frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(new Dimension(500, 500)); //Set's dimensions
    frame.setLayout(null); //Set's layout manager to null
    frame.setVisible(true); //Activates the frame


    }

}