package Objects;

import java.awt.Image;
import java.awt.Rectangle;

/**
 *
 * @author evangentis
 */
public class Skydiver extends Rectangle{
    private int dx;
    private int currentX;
    private int y;
    private Image skydiverImage;
    
    public Skydiver(int x){
        currentX = x;
        y = 0;
        
    }
    
    public int getCurrnetX(){
        return this.currentX;
    }
    
    public int getCurrnetY(){
        return this.y;
    }
    
    public void sexPosX(int changeInX){
        this.dx = changeInX;
        this.x = this.x + this.dx;
    }
    
    public void sexPosY(int changeInY){
        this.y = this.y + changeInY;
    }
    
    
    
    
}
