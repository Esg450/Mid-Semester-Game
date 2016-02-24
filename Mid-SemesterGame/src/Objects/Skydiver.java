package Objects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
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

    //below is one mothod that can handle both, they do the same thing but 
    private void move() {
        if(this.x >= size.width - skydiverSize) 
        {
            this.x += 0;
        }
        else if(this.x <= size.width + skydiverSize)
        {
              this.x -= 0;  
        }else
        {
            this.x += dx;
        }
    }
    
    
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            this.dx = -50;
        }
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            this.dx = 50;
        }
    }
    
    public void keyReleased(KeyEvent e){
        this.dx = 0;
    }
    
    public void paintComponenet(Graphics g){
        
        move();
        g.setColor(Color.red);
        g.fillRect(this.x, this.y, this.width, this.height);
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
