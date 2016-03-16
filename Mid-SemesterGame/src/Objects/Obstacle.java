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
    private GamePanel panel1;
    
    
    //Constants
    //Replaced magic number with symbolic constant
    //Refactor done by Evan Gentis on 3/16/16
    private static final int OBSTACLE_SIZE = 50;
    private static final int OBSTACLE_SPEED = 7;
    private static final int OBSTACLE_START_Y = 500;
    
    public static ArrayList<String> imageList = new ArrayList<String>();
    
    public Obstacle(int panelHeight, int panelWidth, GamePanel panel1) {
        
        this.obstacleImage = this.getRandomImage();
        this.panel1 = panel1;
        this.size = new Dimension(panelWidth, panelHeight);
        double r = Math.random();
        int random = (int)(r * panelWidth-OBSTACLE_SIZE);
        this.setBounds(random, OBSTACLE_START_Y, OBSTACLE_SIZE, OBSTACLE_SIZE);  
      
    }
    
    public Image getRandomImage() {
       Random rand = new Random();
       int randNum = rand.nextInt(this.imageList.size());
       Image i = new ImageIcon(this.imageList.get(randNum)).getImage();
       return i;
    }
    
    public void paintComponent(Graphics g){
        move();
        g.drawImage(obstacleImage, this.x, this.y, this.width, this.height,panel1);
    }
    
    public double getCurrentX() {
        return super.getX();
    }
    
    public double getCurrrentY() {
        return super.getY();
    }
    
  
    public void move() {
        this.y -= OBSTACLE_SPEED;
    }
}
