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


public class Progress extends JFrame implements ActionListener {
    private int energy;//energy of the pet
    private int health;//health of the pet
    private double level;//level of the pet
    private int hatchrate;//when hatching the egg which will turn into a pet
    private Scanner input;

    Progress(){
        JFrame f = new JFrame("Welcome");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        f.setTitle("Pet Z");
        f.setSize(2000, 1000);
        f.setLayout(null);
        f.setVisible(true);

        Button start = new Button(" Start ");
        start.setBackground(Color.CYAN);
        start.setBounds(520,300,200,65);
        f.add(start);
        ImageIcon image = new ImageIcon(getClass().getResource("background1.png")); 
        JLabel pic = new JLabel(image);
        f.add(pic);
    }



    public void actionPerformed(ActionEvent nextScreen){
 
    }
    
    
    

    public static void main(String args[]){
        Progress f = new Progress();
       

    }
    
}
