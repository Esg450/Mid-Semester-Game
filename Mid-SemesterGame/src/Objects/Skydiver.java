package Objects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import mid.semestergame.*;

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
    private GamePanel panel1;
   
    public Skydiver(int panelWidth, int panelHeight, GamePanel thePanel){
        this.skydiverImage = new ImageIcon("src/Images/skydiver.png").getImage();
        this.panel1 = thePanel;
        this.size = new Dimension(panelWidth, panelHeight);
        this.skydiverSize = 50;
        this.skydiverSpeed = 10;
        this.setBounds(0, 50, skydiverSize, skydiverSize);        
        
    }

    private void move() {
        if(this.x >= size.width - skydiverSize) {
            
            this.x -= 10;
        }
        
        else if(x <= 0) {
            
            this.x += 10;
        }
        
        else {
            this.x += dx;
        }
    }
    
    
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_LEFT)
        {
            this.dx = -20;
        }
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            this.dx = 20;
        }
    }
    
    public void keyReleased(KeyEvent e){
        this.dx = 0;
    }
    
    public void paintComponenet(Graphics g){
        
        move();
        g.setColor(Color.red);
        g.drawImage(skydiverImage, x, y, width, height, panel1);
    }
 
}
