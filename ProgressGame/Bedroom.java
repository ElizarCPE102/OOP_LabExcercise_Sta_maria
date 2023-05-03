package Progress2;

import java.awt.Dimension;

public class Bedroom extends G_M_F{

    Bedroom(){
        setPreferredSize(new Dimension(screenWidth,screenHeight));
        //im = j.getImage().getScaledInstance(screenWidth, screenHeight, Image.SCALE_DEFAULT);
        this.setDoubleBuffered(true);    
        this.setLayout(null);
    }

    
    
}
