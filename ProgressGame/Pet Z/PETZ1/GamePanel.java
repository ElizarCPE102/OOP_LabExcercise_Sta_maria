package PETZ1;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Entity.Entity;
import Entity.player;

public class GamePanel extends JPanel implements Runnable{
    //Image
    Image im;//background Main game interface

    Image H_Icon;
    Image E_Icon;
    Image Xp_Icon;

    //get images from sources
    ImageIcon j = new ImageIcon("C:\\Elizar\\Game Project\\BG_Home.png");

    ImageIcon H_src = new ImageIcon("C:\\Elizar\\Game Project\\H_ICON.png");
    ImageIcon E_src = new ImageIcon("C:\\Elizar\\Game Project\\E_ICON.png");
    ImageIcon Xp_src = new ImageIcon("C:\\Elizar\\Game Project\\XP_ICON.png");



    //Screen settings
  public final int orgtilesize = 16;// 16 x 16 tiles 
  public final int scale = 3;

  public final int tileSize = orgtilesize * scale;
  public final int MaxScreenCol = 16;
  public final int MaxScreenRow = 10;
  //size of GameScreen
  public final int screenWidth = tileSize * MaxScreenCol;// 768 pixels
  public final int screenHeight = tileSize * MaxScreenRow;// 480 pixels

  KeyHandler Keys = new KeyHandler();
  Thread gameThread;
  
  player PLAYER = new player(this, Keys);

  //default player position
  int CharacterX = 100;
  int CharacterY = 100;
  int player_Speed = 4;

  //to draw 60 times per second
  int FPS = 60;

  double decay = 0;
  
  public GamePanel(){
    
    this.setPreferredSize(new Dimension(screenWidth,screenHeight));
    im = j.getImage().getScaledInstance(screenWidth, screenHeight, Image.SCALE_DEFAULT);
    H_Icon = H_src.getImage().getScaledInstance(2 * tileSize, 2 * tileSize, Image.SCALE_DEFAULT);
    E_Icon = E_src.getImage().getScaledInstance(2 * tileSize - 10, 2 * tileSize -10, Image.SCALE_DEFAULT);
    Xp_Icon = Xp_src.getImage().getScaledInstance(2 * tileSize + 15, 2 * tileSize + 15, Image.SCALE_DEFAULT);
     
   
    this.setDoubleBuffered(true);
    this.addKeyListener(Keys);
    this.setFocusable(true);
    
  }


  public void startGameThread(){

    gameThread = new Thread(this);
    gameThread.start();

  }



public void run() {

/*
    double drawInterval = 1000000000/FPS;
    double nextDrawTime = System.nanoTime() + drawInterval;
    
    while(gameThread != null){
        //System.out.println("Working");

        
        //long currentTime = System.nanoTime();
        //System.out.println("Current time :" + currentTime); 
        

        update();

        repaint();

        try{
            double remainingTime = nextDrawTime - System.nanoTime();
            remainingTime = remainingTime / 1000000;

            if (remainingTime < 0 ){

                remainingTime = 0;
            }

            Thread.sleep((long) remainingTime);

            nextDrawTime += drawInterval;
            

        }catch(Exception e){

        }

    }
    */



    double drawInterval = 1000000000 /FPS;
    double delta = 0;
    long lastTime = System.nanoTime();
    long currentTime;
    long timer = 0;
    int drawCount = 0;

    while (gameThread != null){

        currentTime = System.nanoTime();

        delta += (currentTime - lastTime) / drawInterval;

        timer += (currentTime - lastTime);
        lastTime = currentTime;

        if (delta >= 1){
        update();
        repaint();
        delta --;
        drawCount ++;
        }
        if(timer >= 1000000000){
            System.out.println("FPS: " + drawCount);        
            drawCount = 0;
            timer = 0;
            decay++;

        }
        if(decay == 2){
            Entity.health -= 10;
            Entity.energy -= 10;
            decay = 0;
        }
        if(Entity.health <= 0 && Entity.energy <= 0 ){
            Entity.health = 100;
            Entity.energy = 100;
        }
    }


}
    
public void update(){

PLAYER.update();

}
public void paintComponent(Graphics g){

    super.paintComponent(g);

    Graphics2D g1 = (Graphics2D) g;    
    Graphics gBG = (Graphics) g;

    Graphics gH = (Graphics) g;//health
    Graphics gE = (Graphics) g;//energy
    Graphics gXP = (Graphics) g;//xp


    gBG.drawImage(im, 0, 0, null);
    gH.drawImage(H_Icon, -21, -18, null);
    gE.drawImage(E_Icon, 170, -5, null);
    gXP.drawImage(Xp_Icon, 345, -20, null);
    
    PLAYER.draw(g1);

   
    g1.dispose();    
    
}

}