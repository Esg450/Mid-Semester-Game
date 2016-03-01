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
import java.util.ArrayList;
import java.util.Random;
        
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
    
    public static ArrayList<String> imageList = new ArrayList<String>();
    
    public Obstacle(int panelHeight, int panelWidth, GamePanel panel1) {
        
        this.obstacleImage = this.getRandomImage();
        this.panel1 = panel1;
        this.size = new Dimension(panelWidth, panelHeight);
        this.obstacleSize = 50;
        this.obstacleSpeed = 7;
        double r = Math.random();
        int random = (int)(r * panelWidth-50);
        this.setBounds(random, 500, obstacleSize, obstacleSize);  
      
    }
    
    //Not yet implemented
    public Image getRandomImage() {
       Random rand = new Random();
       int randNum = rand.nextInt(this.imageList.size());
       Image i = new ImageIcon(this.imageList.get(randNum)).getImage();
       return i;
    }
    
    public void paintComponent(Graphics g){
        move();
        //g.setColor(Color.black);
        g.drawImage(obstacleImage, this.x, this.y, this.width, this.height,panel1);
    }
    
    public double getCurrentX() {
        return super.getX();
    }
    
    public double getCurrrentY() {
        return super.getY();
    }
    
  
    public void move() {
        this.y -= this.obstacleSpeed;
        
    }
}
