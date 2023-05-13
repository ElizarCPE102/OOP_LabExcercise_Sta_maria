package PETZ1;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame {

  //source image button
  ImageIcon background = new ImageIcon("C:\\Elizar\\Game Project\\startbtn2.png");

  //get and resize button image
  Image newimg = background.getImage().getScaledInstance(144, 48, java.awt.Image.SCALE_SMOOTH);
  

  public Main(){

    //initialize start button 
    JButton Start_Btn;
    JButton test_btn;

    //Starting Frame
    JFrame Main_Frame = new JFrame();

    //GameFrame
    JFrame frame = new JFrame();

    //GameFrame2

    //button object
    Start_Btn = new JButton(new ImageIcon(newimg));
    Start_Btn.setBounds(300, 400, 144, 48);

    //for testing to switch from panel to panel
    test_btn = new JButton("click");

    test_btn.setBounds(300, 400, 144, 48);

    //
    GamePlay_1 gp1 =new GamePlay_1(); //for testing
    GamePanel gp = new GamePanel();// panel
    Starting_Frame SF = new Starting_Frame();
    
    
    Main_Frame.dispose();
    Main_Frame.add(Start_Btn);
    Main_Frame.add(SF); 
    Main_Frame.setLocationRelativeTo(null);
    Main_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Main_Frame.setResizable(false);
    Main_Frame.pack();// to set the background to its preferred size based on its dimension
    Main_Frame.setLayout(null);
    Main_Frame.setVisible(true);  
    

    
    Start_Btn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        
     Main_Frame.dispose();

     frame.setTitle(" Pet Z ");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setResizable(false);
    

    // frame.add(test_btn);//for testing
     frame.add(gp);
     
     frame.pack();
     
     frame.setLocationRelativeTo(null);
     frame.setVisible(true);
     gp.startGameThread();

     
     

      }

    });
    
    
  }

    public static void main(String[] args) {
      Main mm = new Main();
  
    }
    
    public void paint(Graphics2D g){
      Graphics2D gChar = (Graphics2D) g;
      gChar.drawImage(newimg, 100, 100, null);
     
    }
    
}