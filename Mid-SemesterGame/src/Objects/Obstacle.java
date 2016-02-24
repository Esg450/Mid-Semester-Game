package Objects;

import java.awt.Graphics;
import java.awt.Rectangle;
/**
 *
 * @author evangentis
 */
public class Obstacle extends Rectangle {
    private int dy;
    
    public Obstacle(int x, int y) {
        dy = 0;
        super.setLocation(x, y);
    }
    
    //Not yet implemented
    public void getRandomImage() {
        
    }
    
    public double getCurrentX() {
        return super.getX();
    }
    
    public double getCurrrentY() {
        return super.getY();
    }
    
    public void drawImage(Graphics g) {
    }
    
    public void move() {
        
    }
}
