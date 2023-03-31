package FRAMEXAMPLE;
import java.awt.*;
import java.awt.event.*;

public class FRAMESAMPLE extends Canvas implements ActionListener{
    public void actionPerformed(ActionEvent e){
    
    }
    
    public void paint(Graphics g)    
  {    
  
    // adding specifications  
    g.setColor(Color.red);    
    g.fillOval(75, 75, 150, 75);    
  }    

    public static void main (String args[]){
        Frame f = new Frame("Welcome");
        Button btnUP = new Button(" Up ");
        Button btnDown = new Button(" Down ");
        Button btnLeft = new Button(" Left ");
        Button btnRight = new Button(" Right ");
        btnUP.setBounds(590,631,80,30); 
        btnDown.setBounds(590,660,80,30); 
        btnLeft.setBounds(510,660,80,30); 
        btnRight.setBounds(669,660,80,30);

        f.add(btnUP);
        f.add(btnDown);
        f.add(btnLeft);
        f.add(btnRight);
        f.setTitle("My sample ball game(Elizar)");
        f.setSize(2000, 1000);
        f.setLayout(null);
        f.setVisible(true);
        f.setBackground(Color.BLACK);
          

    }
}
