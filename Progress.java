/*
Pet Z - Game Project - CPE - 102
 Elizar Sta Maria 
 Jucel Anthonny
 */

package Progress;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
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
       

    Image im;
    int x, y;
    final TextField tf = new TextField();
    //buttons
    Button start = new Button(" Start ");
    Button newG = new Button("New Game");
    //fonts of front page
    Font fnt = new Font ("Times New Roman", Font.ITALIC,150);
    Font fnt1 = new Font ("Times New Roman", Font.LAYOUT_NO_LIMIT_CONTEXT,30);

    Font startfnt = new Font ("Times New Roman", Font.BOLD,150);

    
    
    Progress(){  
        ImageIcon j = new ImageIcon("C:/Elizar/Game Project/background1.png");
        im = j.getImage();
        im.getScaledInstance(2000, 2000, Image.SCALE_DEFAULT);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        setTitle("Pet Z");
        setSize(2000, 1000);
        setLayout(null);
        setVisible(true);
        setResizable(true);
    
        start.setBackground(Color.MAGENTA);
        start.setBounds(520,300,200,40);
        start.addActionListener(this);
        add(start); 

       
    }
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        
        g.drawImage(im, 0, 0, null);
        g2.setFont(fnt);
        g.drawString("PET Z ", 435, 200);
        g2.setFont(fnt1);
        g.drawString("The Legend has risen ", 435, 240);
        g2.setBackground(Color.CYAN);
        


    }
    
    public void actionPerformed(ActionEvent e){
   
    }



    public static void main(String args[]){
        Progress f = new Progress();
        
        
    }
}
