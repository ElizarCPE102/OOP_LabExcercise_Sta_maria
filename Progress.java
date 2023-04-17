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
    private int energy;//energy of the pet
    private int health;//health of the pet
    private double level;//level of the pet
    private int hatchrate;//when hatching the egg which will turn into a pet
    private Scanner input;
    private JFrame f;
    private JLabel kk;
    private Image dbImage;
    Image im;
    

    int x, y;
    final TextField tf = new TextField();
    Button start = new Button(" Start ");

    Progress(){
        ImageIcon j = new ImageIcon("C:/Elizar/Game Project/background1.png");
        im = j.getImage();
        
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        setTitle("Pet Z");
        setSize(2000, 1000);
        setLayout(null);
        setVisible(true);
        setResizable(false);

        
        start.setBackground(Color.MAGENTA);
        start.setBounds(520,300,200,40);
        start.addActionListener(this);
        add(start); 
        

    }
    public void paint(Graphics g){
        g.drawImage(im, 0, 0, null);
    }
    
    public void actionPerformed(ActionEvent e){
        start.setBackground(Color.ORANGE);
        tf.setBounds(540,500, 150,20);  
        add(tf);  
        tf.setVisible(true);
        tf.setText("Enter pet Name");
        tf.setBackground(Color.ORANGE);    
    }


    public static void main(String args[]){
        Progress f = new Progress();
        
    }
}
