package Progress2;

import java.awt.Graphics;

import javax.swing.JPanel;

public class G_M_F extends JPanel implements Runnable {

     //character position
    public int x = 100;
    public int y = 100;


    //
    
    //
    public int speed = 4;

     //Screen settings
     public final int orgtilesize = 16;// 16 x 16 tiles 
     public final int scale = 3;
 
     public final int tileSize = orgtilesize * scale;
     public final int MaxScreenCol = 16;
     public final int MaxScreenRow = 10;
     public final int screenWidth = tileSize * MaxScreenCol;// 768 pixels
     public final int screenHeight = tileSize * MaxScreenRow;// 480 pixels

     int FPS = 60;// fps of game

     Thread gameThread;

     public void start_Game_Thread(){
          gameThread = new Thread(this);
          gameThread.start();
     }

    public void run() { 

     while (gameThread != null){
 
          update();

          repaint();
     }
        
    }
    public void update(){

    }

    public void paintComponent(Graphics g){

    }

}