package Objects;

import java.awt.Graphics;
import java.awt.Rectangle;
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
public class Obstacle extends Rectangle {
    private int dy;
    private final Dimension size;
    private Image obstacleImage;
    private final int obstacleSize;
    private final int obstacleSpeed;
    private GamePanel panel1;
    
    public Obstacle(int panelHeight, int panelWidth, GamePanel panel1) {
        this.obstacleImage = new ImageIcon("src/Images/plane2.png").getImage();
        this.panel1 = panel1;
        this.size = new Dimension(panelWidth, panelHeight);
        this.obstacleSize = 50;
        this.obstacleSpeed = 10;
        double r = Math.random();
        int random = (int)(r * panelWidth);
        this.setBounds(random, 500, obstacleSize, obstacleSize);  
      
    }
    
    //Not yet implemented
    public void getRandomImage() {
        
    }
    
    public void paintComponent(Graphics g){
       move();
        g.setColor(Color.black);
        g.drawImage(obstacleImage,this.x, this.y, this.width, this.height,panel1);
    }
    
    public double getCurrentX() {
        return super.getX();
    }
    
    public double getCurrrentY() {
        return super.getY();
    }
    
  
    public void move() {
        this.y-=10;
        
    }
}
