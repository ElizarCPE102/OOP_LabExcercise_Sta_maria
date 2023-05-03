package Progress2;

import java.awt.Dimension;
import java.awt.Image;

public class Kitchen extends G_M_F{

    Kitchen(){
        setPreferredSize(new Dimension(screenWidth,screenHeight));
        //im = j.getImage().getScaledInstance(screenWidth, screenHeight, Image.SCALE_DEFAULT);
        this.setDoubleBuffered(true);    
        this.setLayout(null);
        
    }
    
}
