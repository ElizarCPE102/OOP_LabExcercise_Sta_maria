package Progress2;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Main_Screen extends G_M_F {

    //Image
    Image im1;//background Main Menu
    Image im2;

    //get images from sources
    ImageIcon j1 = new ImageIcon("C:\\Elizar\\Game Project\\background3.png");
    ImageIcon j2 = new ImageIcon("C:\\Elizar\\Game Project\\char6.png");

    Main_Screen(){
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        im1 = j1.getImage().getScaledInstance(screenWidth, screenHeight, Image.SCALE_DEFAULT);
        im2 = j2.getImage().getScaledInstance(orgtilesize * scale * scale, orgtilesize * scale * scale, Image.SCALE_DEFAULT);
        this.setDoubleBuffered(true);
    }
    public void paint(Graphics g){  
        Graphics2D g1 = (Graphics2D)g;
        g.drawImage(im1, 0, 0, null);
        g1.drawImage(im2, 300, 310, null);
        
    }
    
}
