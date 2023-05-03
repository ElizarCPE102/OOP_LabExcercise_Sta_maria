package Progress2;

import java.awt.Dimension;

public class PlayRoom extends G_M_F {

    PlayRoom(){
        setPreferredSize(new Dimension(screenWidth,screenHeight));
        //im = j.getImage().getScaledInstance(screenWidth, screenHeight, Image.SCALE_DEFAULT);
        this.setDoubleBuffered(true);    
        this.setLayout(null);

    }
    
}
