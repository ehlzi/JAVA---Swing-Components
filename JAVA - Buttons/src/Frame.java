import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//MyFrame will become a sub-class of Jframe, behaving like a JFrame (inheritence)

public class Frame extends JFrame implements ActionListener {
    
    JButton button; // is global now, declared outside of constructor
    JLabel label;
    //Frame constructor
    Frame() {
        
        File file = new File("resources/Button.jpg");
        File file2 = new File("resources/Button2.jpg");
        
        String buttonImageOne = file.getAbsolutePath();
        String buttonImageTwo = file2.getAbsolutePath();
        
        ImageIcon icon = new ImageIcon(buttonImageOne);
        ImageIcon icon2 = new ImageIcon(buttonImageTwo);
        
        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(0, 0, 500, 500);
        label.setVisible(false);

        button = new JButton(); //JButton button = new JButton(); is non-global, local within the constructor
        button.setBounds(200, 100, 250, 100); //x, y and height, width
        button.addActionListener(this);
        button.setText("Press Me");
        button.setFocusable(false); //gets rid of the border around the button, makes it "not" the focus
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Times New Roman", Font.BOLD, 25));
        button.setIconTextGap(-15); //set gap between text and imageicon
        button.setForeground(Color.black);
        button.setBackground(Color.white);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false); //disables button
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes on exit
        this.setLayout(null); //using no layout manager
        this.setSize(500, 500);
        this.setVisible(true); //enables JFrame
        this.add(button);
        this.add(label);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == button) {
            System.out.println("Poo");
            //button.setEnabled(false); //button clicks once and is disabled
            //System.exit(0); closes application
            label.setVisible(true);
            button.setVisible(false);
        }


    }

}
