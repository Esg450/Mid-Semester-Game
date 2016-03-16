/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid.semestergame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Graham
 */

public class Background extends Rectangle{
    private Image skyImage;
    private int dy;
    private GamePanel thePanel;
    private MenuPanel theMenuPanel;
    private final Dimension size;
    
    //Constants
    //Replaced magic number with symbolic constant
    //Refactor done by Evan Gentis on 3/16/16
    private static final int MENU_BG_Y_OFFSET1 = 338;
    private static final int MENU_BG_Y_OFFSET2 = 676;
    private static final int MENU_BG_WIDTH = 500;
    private static final int MENU_BG_HEIGHT = 338;
    private static final int MENU_WIDTH = 500;
    private static final int MENU_HEIGHT = 500;
    private static final int MENU_BG_SPEED = 2;
    
    public Background(int panelHeight, int panelWidth, MenuPanel panel1){
        this.skyImage =new  ImageIcon("src/Images/SkyBackground1.jpg").getImage();
        this.theMenuPanel = panel1;
        this.size = new Dimension(panelWidth, panelHeight);
        this.setBounds(x, y, MENU_WIDTH, MENU_HEIGHT);
    }
    
    
    public Background(int panelHeight, int panelWidth, GamePanel panel1){
        this.skyImage =new  ImageIcon("src/Images/SkyBackground1.jpg").getImage();
        this.thePanel = panel1;
        this.size = new Dimension(panelWidth, panelHeight);
        this.setBounds(x, y, MENU_WIDTH, MENU_HEIGHT);
    }
    
    
    public void paintComponent(Graphics g){
       move();
       g.drawImage(skyImage,this.x, this.y, MENU_BG_WIDTH, MENU_BG_HEIGHT,thePanel);
       g.drawImage(skyImage,this.x, this.y+MENU_BG_Y_OFFSET1, MENU_BG_WIDTH, MENU_BG_HEIGHT,thePanel);
       g.drawImage(skyImage,this.x, this.y+MENU_BG_Y_OFFSET2, MENU_BG_WIDTH, MENU_BG_HEIGHT,thePanel);
       
    }
    
    public void paintComponentMenu(Graphics g){
       move();
       g.drawImage(skyImage,this.x, this.y, MENU_BG_WIDTH, MENU_BG_HEIGHT,theMenuPanel);
       g.drawImage(skyImage,this.x, this.y+MENU_BG_Y_OFFSET1, MENU_BG_WIDTH, MENU_BG_HEIGHT,theMenuPanel);
       g.drawImage(skyImage,this.x, this.y+MENU_BG_Y_OFFSET2, MENU_BG_WIDTH, MENU_BG_HEIGHT,theMenuPanel);

    }
    
    public double getCurrentX() {
        return super.getX();
    }
    
    public double getCurrrentY() {
        return super.getY();
    }
    
  
    public void move() {
        if(this.y<= -MENU_BG_HEIGHT)
        {
            this.y=0;
        }
        else
        {
            this.y-=MENU_BG_SPEED;
        }
        
    }
}

