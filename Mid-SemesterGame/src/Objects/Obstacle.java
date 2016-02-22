package Objects;

import java.awt.Graphics;
import java.awt.Rectangle;
/**
 *
 * @author evangentis
 */
public class Obstacle extends Rectangle {
    private int dy;
    
    public Obstacle() {
        dy = 0;
    }
    
    public void setXPos(int i) {
        this.x = i;
    } 
    
    public void setYPos(int i) {
        this.y = i;
    }
    
    //Not yet implemented
    public void getRandomImage() {
        
    }
    
    public int getCurrentX() {
        return this.x;
    }
    
    public int getCurrrentY() {
        return this.y;
    }
    
    public void drawImage(Graphics g) {
        
    }
    
    public void move() {
        
    }
}
