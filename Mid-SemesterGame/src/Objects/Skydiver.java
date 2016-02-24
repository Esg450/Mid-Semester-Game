package Objects;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.JPanel;

/**
 *
 * @author evangentis
 */
public class Skydiver extends Rectangle{
    private int dx;
    private final Dimension size;
    private Image skydiverImage;
    private final int skydiverSize;
    private final int skydiverSpeed;
    public Skydiver(JPanel thePanel){
        this.size = new Dimension(thePanel.getWidth(), thePanel.getHeight());
        this.skydiverSize = 50;
        this.skydiverSpeed = 10;
        this.setBounds(size.height - skydiverSize, skydiverSize, skydiverSize, skydiverSize);
        
        
        
    }
    public void updateAndDraw(Graphics g) {
        // Update
        //this.update();
        
        // Draw
        
        g.fillRect(this.x, this.y, this.width, this.height);
    }
    
    
    public void update() {
        //this.move();
    }
    
   //below are two seperate methods to move left or right 
    private void moveLeft(boolean moveLeft){
        if (moveLeft) {
            this.x -= skydiverSpeed;
            if(this.x <= 0) {
                //add code to make the block not move past the bounds
            }
        }
        
        
    }
    private void moveRight(boolean moveRight){
        if(moveRight) {
            this.x += skydiverSpeed;
            if(this.x >= size.width - skydiverSize) {
                this.x = x;
            }
        }
    }
    
    
    //below is one mothod that can handle both, they do the same thing but 
    private void move(boolean moveRight, boolean moveLeft) {
        if(moveRight) {
            this.x += skydiverSpeed;
            if(this.x >= size.width - skydiverSize) {
                this.x = x;
            }
        } 
        else if (moveLeft) {
            this.x -= skydiverSpeed;
            if(this.x <= 0) {
                //add code to make the block not move past the bounds
            }
        }
    }
    
    public int getCurrnetX(){
        return x;
    }
    
    public int getCurrnetY(){
        return y;
    }
    
    public void sexPosX(int changeInX){
        
    }
    
    public void sexPosY(int changeInY){
        
    }
    
    
    
    
}
