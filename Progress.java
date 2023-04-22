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
    private Scanner input;
    private JFrame f;
    private JLabel kk;
    
    public Progress(String petname,int energy,int health,int level){
        this.energy = energy;
        this.health = health;
        this.level = level;
        this.petname = petname;
       }
    
    //images
    Image im;//background frame 1
    Image im1;// background frame 2
    ImageIcon j = new ImageIcon("C:/SampleBG/background.png"); 
    ImageIcon j1 = new ImageIcon("C:/SampleBG/background2.avif");
    
    int x, y;
    final TextField tf = new TextField();
    
    //buttons
    JButton start = new JButton(new ImageIcon("C:/SampleBG/strt.png"));
    
    Button newG = new Button();
    
    
    //font of main frame
    Font fnt = new Font ("Times New Roman", Font.ITALIC,150);
    Font fnt1 = new Font ("Times New Roman", Font.LAYOUT_NO_LIMIT_CONTEXT,30);
    
    
    
    
    
    
    public void actionPerformed(ActionEvent e){
      dispose();
      JFrame frame = new JFrame("Pet Z");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(490, 800);
      frame.setBackground(Color.yellow);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      
      im1 = j1.getImage();
      im1.getScaledInstance(2000, 1000, Image.SCALE_SMOOTH);
      
    }
    
    
    //Load Image, Frame and Buttons.
    Progress(){  
        im = j.getImage();
        im.getScaledInstance(2000, 1000, Image.SCALE_SMOOTH);
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
    
    
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;    
        Graphics g3 = (Graphics) g; 
        g2.drawImage(im, 0, 0, null);
        g.setFont(fnt);
        g.setFont(fnt1);
        g.drawString("PET Z ", 60, 240);
        g.drawString("The Legend has risen ", 60, 280);
        g3.drawImage(im1, 0, 0, null);
       
        
 
       
        

    }
  
    public static void main(String[] args) {
        Progress f = new Progress();
    }
    
}
