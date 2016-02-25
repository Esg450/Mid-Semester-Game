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

/**
 *
 * @author Graham
 */
public class Background extends Rectangle{
    private Image skyImage;
    private int dy;
    private GamePanel thePanel;
    private final Dimension size;
    
    public Background(int panelHeight, int panelWidth, GamePanel panel1){
        this.skyImage =new  ImageIcon("src/Images/SkyBackground1.jpg").getImage();
        this.thePanel = panel1;
        this.size = new Dimension(panelWidth, panelHeight);
        this.setBounds(x, y, 500, 500);
    }
    
    
    public void paintComponent(Graphics g){
       move();
       g.setColor(Color.black);
       g.drawImage(skyImage,this.x, this.y, 500, 700,thePanel);
       g.drawImage(skyImage,this.x, this.y+600, 500, 700,thePanel);
    }
    
    public double getCurrentX() {
        return super.getX();
    }
    
    public double getCurrrentY() {
        return super.getY();
    }
    
  
    public void move() {
        if(this.y<= -600)
        {
            this.y=0;
        }
        else
        {
            this.y-=5;
        }
        
    }
}

