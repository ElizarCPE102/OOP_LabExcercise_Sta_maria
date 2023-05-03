package Progress2;

import java.awt.Dimension;

public class bathroom extends G_M_F{

    bathroom(){
        setPreferredSize(new Dimension(screenWidth,screenHeight));
        //im = j.getImage().getScaledInstance(screenWidth, screenHeight, Image.SCALE_DEFAULT);
        this.setDoubleBuffered(true);    
        this.setLayout(null);
    }
}