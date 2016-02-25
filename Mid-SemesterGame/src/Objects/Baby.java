/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.awt.Dimension;
import java.awt.Graphics;
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
    private ImageIcon image = new ImageIcon();
    private GamePanel panel1;
   
    public Baby(int panelHeight, int panelWidth, GamePanel panel1)
    {
        super.setLocation(x, y);
        image = getRandomImage();
         this.panel1 = panel1;
        this.size = new Dimension(panelWidth, panelHeight);
        this.babySize = 20;
        this.babySpeed = 3;
         this.setBounds(5, 500, babySize, babySize); 
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
   
    
    public void drawImage(Graphics g)
    {
       move();
       g.drawImage(image.getImage(), this.x, this.y, this.width, this.height,panel1);
    }
    public ImageIcon getRandomImage()
    {
        Random r = new Random();
        int randNum = r.nextInt(3);
        ArrayList<String> babyPics = new ArrayList<String>();
        babyPics.add("babyPic1.png");
        babyPics.add("babyPic2.png");
        babyPics.add("babyPic3.png");
        String randomImageFile = babyPics.get(randNum);
        ImageIcon randomImage = new ImageIcon("src/images/"+randomImageFile);
        return randomImage;
        
    }
    
    
}
