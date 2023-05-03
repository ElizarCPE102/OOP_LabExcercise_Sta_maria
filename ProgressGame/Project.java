package Progress2;

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
import java.util.Timer;
import java.awt.Graphics;


public class Project extends G_M_F implements ActionListener {
    
    //source Game Icon
    ImageIcon Game_Icon = new ImageIcon("C:\\Elizar\\Game Project\\ICON.png");

    //source image button
    ImageIcon background = new ImageIcon("C:\\Elizar\\Game Project\\startbtn2.png");

    //set image button and resize image button
    Image newimg = background.getImage().getScaledInstance(scale * orgtilesize * scale, orgtilesize * scale , java.awt.Image.SCALE_SMOOTH);

    //
    Main_Menu MM = new Main_Menu();
    Main_Screen MSC = new Main_Screen();
    Kitchen ktch = new Kitchen();
    Bedroom bed = new Bedroom();
    PlayRoom play = new PlayRoom();
    bathroom bath = new bathroom();
    
    //
    G_M_F game = new G_M_F();

     //buttons
   JButton start = new JButton(new ImageIcon(newimg));

   //textfield
   final TextField tf_name = new TextField("Enter Name of pet...");

   //fonts
   Font fnt = new Font ("Times New Roman", Font.BOLD,60);

   // Object char
   ProjectPet ziz;

   //
   
   
   //Frames
   JFrame jf = new JFrame("Pet Z"); 
   JFrame Main = new JFrame("Pet Z");
   
    Project(){
        
        start.setBounds(305,380,orgtilesize * scale * scale ,orgtilesize * scale);
        // clicking this button moves to the next frame to 2nd frame
        start.setVisible(true);
         
        jf.setLocationRelativeTo(null);
        jf.dispose();
        jf.add(start);
        jf.add(MM); 
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setIconImage(Game_Icon.getImage());
        jf.pack();
        jf.setLayout(null);
        jf.setVisible(true);
        jf.add(game);
        game.start_Game_Thread();
        

        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Main.dispose();
                Main.setLocationRelativeTo(null);  
                tf_name.setBounds(305,455,orgtilesize * scale * scale, orgtilesize);
                Main.add(tf_name);
                Main.add(MSC);   
                Main.setVisible(true);
                Main.setResizable(false);
                Main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Main.pack(); 
                Main.setLayout(null);
                jf.setVisible(false);
                start.setVisible(false);

                tf_name.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        e.getSource();
                        JPanel Game = new JPanel();
                        Main.add(Game);
                        
                    }
                });

            

            }   
        });
        
        
    }

    
    

    public void actionPerformed(ActionEvent e) {
        

    }
   
    public void paint(Graphics g){
       
        
    }
    


    public static void main(String[] args) {
        Project k = new Project();
        
       
    }
 
}
