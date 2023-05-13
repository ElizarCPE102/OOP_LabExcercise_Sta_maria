package Entity;

import java.awt.image.BufferedImage;

public class Entity {
    public int x, y;
    public int speed;
    public BufferedImage up1,up2,down1,down2,left1,left2,right1,right2;//images of the character to be animated
    public BufferedImage idle; //idle animation
    public String direction;
    

    public int spriteCounter = 0;
    public int spriteNum = 1;

    //stats of character
    public static int health = 100;
    public static int energy = 100;
    public static int exp = 1;
    public String Name;
    
}
