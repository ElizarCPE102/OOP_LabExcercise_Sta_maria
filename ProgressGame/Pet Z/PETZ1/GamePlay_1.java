package PETZ1;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

public class GamePlay_1 extends GamePanel{

    //Image
    Image im;//background Main Menu

    //get images from sources
    ImageIcon j = new ImageIcon("C:\\Elizar\\Game Project\\background2.png");


    public GamePlay_1(){
        this.setPreferredSize(new Dimension(screenWidth,screenHeight));
        im = j.getImage().getScaledInstance(screenWidth, screenHeight, Image.SCALE_DEFAULT);

    }

    public void paint(Graphics g){
        Graphics2D g1 = (Graphics2D) g;
        g1.drawImage(im, 0, 0, null);

    }
    
}
