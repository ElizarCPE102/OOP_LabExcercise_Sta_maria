package Progress;

/*
Elizar Sta Maria
Jucel Anthonny
CPE - 102
NetBeans
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.util.Scanner;
import java.awt.Graphics;


public class Progress extends JFrame implements ActionListener {
    private Scanner input;//for the name of the pet,  
    //images
    Image im;//background frame 1
    Image im1;// background frame 2
    Image gif;//egg icon

    //get images from sources
    ImageIcon j = new ImageIcon("C:\\Elizar\\Game Project\\clod.png"); 
    ImageIcon j1 = new ImageIcon("C:\\Elizar\\Game Project\\background2.png");
    ImageIcon g = new ImageIcon("C:\\Elizar\\Game Project\\Egg2.png");
    
    //buttons
    JButton start = new JButton(new ImageIcon("C:\\Elizar\\Game Project\\startbtn.png"));
    final TextField tf = new TextField("Enter Name");
    Button newG = new Button();
    
    //font of main frame
    Font fnt = new Font ("Times New Roman", Font.BOLD,100);
    
    // 2nd frame
    public void actionPerformed(ActionEvent e){
      dispose();
      tf.setBounds(145,500,200,30);
      add(tf);//add textfield button in 2nd frame
      im1 = j1.getImage();//load background image of another frame
      gif = g.getImage();//get gif egg animation
      start.setVisible(false);//prevent start button to appear in 2nd frame
      setVisible(true);


    }
    
    //Load Image, Frame and Buttons.
    Progress(){  
        dispose();
        im = j.getImage();// load background in the main frame
       
        start.setBounds(90,420,270,80);
        // clicking this button moves to the next frame to 2nd frame
        start.addActionListener(this);
        add(start);

        setTitle("Pet Z");
        setSize(490, 800);
        setLayout(null);
        setVisible(true);
        setResizable(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    //insert Images and fonts to be loaded
    public void paint(Graphics g){
        Graphics g2 = (Graphics) g;    
        Graphics g3 = (Graphics) g; 
        Graphics g4 = (Graphics) g;
        Graphics g5 = (Graphics) g;
        Graphics g6 = (Graphics) g;
        g2.drawImage(im, 0, 0, null);
        g3.drawImage(im1, 0, 0, null);
        g4.setFont(fnt);
      //  g5.setFont(fnt1);
        g4.drawString("PET Z ", 60, 240);
        g5.drawString("The Legend has risen ", 60, 280);
        
        g6.drawImage(gif, 0, 0, this);

        

    }
    public static void main(String[] args) {
        Progress k = new Progress();
       
    }
    
}

