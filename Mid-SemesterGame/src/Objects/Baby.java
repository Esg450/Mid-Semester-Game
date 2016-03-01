/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import mid.semestergame.GamePanel;

/**
 *
 * @author Zack
 */
public class Baby extends Rectangle{
    private int dy = 0;
    private int babySpeed = 5;
    private int babySize = 10;
    private final Dimension size;
    private Image image;
    private GamePanel panel1;
    
    public static ArrayList<String> imageList = new ArrayList<String>();
   
    public Baby(int panelHeight, int panelWidth, GamePanel panel1)
    {
        super.setLocation(x, y);
        this.image = this.getRandomImage();
        this.panel1 = panel1;
        this.size = new Dimension(panelWidth, panelHeight);
        this.babySize = 30;
        this.babySpeed = 7;
        double r = Math.random();
        int random = (int)(r * panelWidth - 20);
        this.setBounds(random, 500, babySize, babySize); 
    }
    
    public Image getRandomImage() {
       Random rand = new Random();
       int randNum = rand.nextInt(this.imageList.size());
       Image i = new ImageIcon(this.imageList.get(randNum)).getImage();
       return i;
    }
    
    public int getCurrentX()
    {
        return x;
    }
    public int getCurrentY()
    {
        return y;
    }
    public void move()
    {
         this.y -= this.babySpeed;
    }
   
    
    public void paintComponent(Graphics g)
    {
       move();
       g.drawImage(image, this.x, this.y, this.width, this.height,panel1);
    }

}
