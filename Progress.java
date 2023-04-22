/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progress;

/*
Elizar Sta Maria
Jucel Anthonny
CPE - 102
NetBeans


*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.util.Scanner;
import java.awt.Graphics;


public class Progress extends JFrame implements ActionListener {
    protected int energy;//energy of the pet
    protected int health;//health of the pet
    protected int level;//level of the pet
    protected String petname;//name of the pet
    private String status;
    private int hatchrate;// egg hatch timer
    private Scanner input;//for the name of the pet,

    
    public Progress(String petname,int energy,int health,int level){
        this.energy = energy;
        this.health = health;
        this.level = level;
        this.petname = petname;
       }
    
      int x, y;
      
    //images
    Image im;//background frame 1
    Image im1;// background frame 2
    ImageIcon j = new ImageIcon("C:/SampleBG/background.png"); 
    ImageIcon j1 = new ImageIcon("C:/SampleBG/background3.png");
    
  
    
    
    //buttons
    JButton start = new JButton(new ImageIcon("C:/SampleBG/strt.png"));
    final TextField tf = new TextField("Enter Name");
    Button newG = new Button();
    
    
    //font of main frame
    Font fnt = new Font ("Times New Roman", Font.ITALIC,500);
    Font fnt1 = new Font ("Times New Roman", Font.LAYOUT_NO_LIMIT_CONTEXT,30);
    
    
  
    
    // 2nd frame
    public void actionPerformed(ActionEvent e){
      dispose();

      JPanel k = new JPanel();
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(490, 800);
      setBackground(Color.yellow);
      setLocationRelativeTo(null);
      setLayout(null);
      setResizable(false);
      
      tf.setBounds(145,500,200,30);
      add(tf);
      setVisible(true);
      
      im1 = j1.getImage();
 
      
    }
    
    //Load Image, Frame and Buttons.
    Progress(){  
        dispose();
        im = j.getImage();
        JFrame frame = new JFrame();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        setTitle("Pet Z");
        setSize(490, 800);
        setLayout(null);
        setVisible(true);
        setResizable(false);

        start.setBounds(90,420,290,100);
        start.addActionListener(this);
        add(start);
  
    }
    
    //insert Images and fonts to be loaded
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;    
        Graphics g3 = (Graphics) g; 
        g2.drawImage(im, 0, 0, null);
        g3.drawImage(im1, 0, 0, null);
        g.setFont(fnt);
        g.setFont(fnt1);
        g.drawString("PET Z ", 60, 240);
        g.drawString("The Legend has risen ", 60, 280);
        

    }
    
    
  
    public static void main(String[] args) {
        Progress k = new Progress();
        
        
        
    }
    
}
