package Progress2;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Main_Menu extends G_M_F {

    //Image
    Image im;//background Main Menu

    //get images from sources
    ImageIcon j = new ImageIcon("C:\\Elizar\\Game Project\\background1.png");


    Main_Menu(){
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        im = j.getImage().getScaledInstance(screenWidth, screenHeight, Image.SCALE_DEFAULT);
        this.setDoubleBuffered(true);    
    }
    
    public void paint(Graphics g){  
        g.drawImage(im, 0, 0, null);
        
    }

}
