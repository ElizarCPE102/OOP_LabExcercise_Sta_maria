package Entity;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import PETZ1.GamePanel;
import PETZ1.KeyHandler;

public class player extends Entity{
    GamePanel gp;
    KeyHandler keys;
    
    Font fnt = new Font ("Times New Roman", Font.BOLD,15); 
    
    public player(GamePanel gp, KeyHandler keys){
        this.gp = gp;
        this.keys = keys;
        setDefaultValues();
        getPlayerImage();

    }

    public void setDefaultValues(){
        x = 295;
        y = 325;
        speed = 4;
        direction = "down";
        Name = "No name";

    }
    public void getPlayerImage(){
        try{
            up1 = ImageIO.read(getClass().getResourceAsStream("/Player/bird5.png"));
            down1 = ImageIO.read(getClass().getResourceAsStream("/Player/bird1.png"));
            left1 = ImageIO.read(getClass().getResourceAsStream("/Player/bird6.png"));
            right1 = ImageIO.read(getClass().getResourceAsStream("/Player/bird7.png"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    public void update(){
        if (keys.upPressed == true ){
            direction = "up";
            y -= speed;
        }
        else if (keys.downPressed == true ){
            direction = "down";
            y += speed;
        }
        else if (keys.leftPressed == true){
            direction = "left";
            x -= speed;
        }
        else if (keys.rightPressed == true){
            direction = "right";
            x += speed;
        
        }
        else{
            direction = "down";
        }

    }
    public void draw(Graphics2D g){
        Graphics2D g2 = (Graphics2D) g;
        Graphics2D g3 = (Graphics2D) g;

        Graphics2D g4 = (Graphics2D) g;
        Graphics2D g5 = (Graphics2D) g; 

        Graphics2D g6 = (Graphics2D) g;
        Graphics2D g7 = (Graphics2D) g; 
        Graphics gborder = (Graphics) g;

        Graphics gName = (Graphics) g; 
        

        /* 
        g1.setColor(Color.WHITE);
        g1.fillRect(x, y, gp.scale * gp.orgtilesize, gp.scale * gp.orgtilesize);
        */

        BufferedImage image = null;
        
        switch(direction){
            case "up" :
            image = up1;
            break;

            case "down" :
            image = down1;
            break;

            case "left" :
            image = left1;
            break;

            case "right" :
            image = right1;
            break;

        }
        
        g.drawImage(image, x, y, gp.orgtilesize * gp.scale *gp.scale , gp.orgtilesize * gp.scale * gp.scale, null);

        //for the health bar
        gborder.setColor(Color.black);
        gborder.drawRect(58, 8, 115, gp.scale * gp.orgtilesize + 15);
        gborder.fillRect(58, 8, 115, gp.scale * gp.orgtilesize + 15);

        g2.setColor(Color.GRAY);
        g2.drawRect(65, 15, 100, gp.scale * gp.orgtilesize);
        g2.fillRect(65, 15, 100, gp.scale * gp.orgtilesize);

        g3.setColor(Color.GREEN);
        g3.drawRect(65, 15, health , gp.scale * gp.orgtilesize);   
        g3.fillRect(65, 15, health , gp.scale * gp.orgtilesize);

        //for the energy bar
        gborder.setColor(Color.black);
        gborder.drawRect(251, 8, 115, gp.scale * gp.orgtilesize + 15);
        gborder.fillRect(251, 8, 115, gp.scale * gp.orgtilesize + 15);

        g4.setColor(Color.gray);
        g4.drawRect(258, 15, 100, gp.scale * gp.orgtilesize);
        g4.fillRect(258, 15, 100, gp.scale * gp.orgtilesize);

        g5.setColor(Color.cyan);
        g5.drawRect(258, 15, energy , gp.scale * gp.orgtilesize);
        g5.fillRect(258, 15, energy , gp.scale * gp.orgtilesize);
 
        //for the exp bar
        gborder.setColor(Color.black);
        gborder.drawRect(435, 8, 115, gp.scale * gp.orgtilesize + 15);
        gborder.fillRect(435, 8, 115, gp.scale * gp.orgtilesize + 15);

        g6.setColor(Color.gray);
        g6.drawRect(442, 15, 100, gp.scale * gp.orgtilesize);
        g6.fillRect(442, 15, 100, gp.scale * gp.orgtilesize);

        g7.setColor(Color.yellow);
        g7.drawRect(442, 15, exp , gp.scale * gp.orgtilesize);
        g7.fillRect(442, 15, exp , gp.scale * gp.orgtilesize);

        //to draw string for pet name
        gName.setColor(Color.white);
        gName.drawString(Name, x + 45, y + 10);


        
    }
    
}
