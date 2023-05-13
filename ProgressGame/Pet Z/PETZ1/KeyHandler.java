package PETZ1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    public boolean upPressed, downPressed, leftPressed, rightPressed;

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        int code = e.getKeyCode();

        //press W for up
        if(code == KeyEvent.VK_W){
            upPressed = true;
        }

        //press S for down
        if(code == KeyEvent.VK_S){
            downPressed = true;
            
        }

        //press A for left
        if(code == KeyEvent.VK_A){
            leftPressed = true;
        }

        //press D for right
        if(code == KeyEvent.VK_D){
            rightPressed = true;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        
        int code = e.getKeyCode();

        //press W for up
        if(code == KeyEvent.VK_W){
            upPressed = false;
        }

        //press S for down
        if(code == KeyEvent.VK_S){
            downPressed = false;
            
        }

        //press A for left
        if(code == KeyEvent.VK_A){
            leftPressed = false;
        }

        //press D for right
        if(code == KeyEvent.VK_D){
            rightPressed = false;
        }


    }
    
}
