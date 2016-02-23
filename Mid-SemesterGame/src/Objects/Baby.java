/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Zack
 */
public class Baby extends Rectangle{
    private int dy = 0;
    private ImageIcon image = new ImageIcon();
   
    public Baby(int x, int y)
    {
        super.setLocation(x, y);
        
    }
    public double getCurrentX()
    {
        return super.getX();
    }
    public double getCurrentY()
    {
        return super.getY();
    }
    public void move()
    {
        
    }
    public void drawImage(Graphics g)
    {
        g.drawImage(image.getImage(), this.x, this.y, null);
    }
    public ImageIcon getRandomImage()
    {
        Random r = new Random();
        int randNum = r.nextInt(3);
        ArrayList<String> babyPics = new ArrayList<String>();
        babyPics.add("babyPic1.jpg");
        babyPics.add("babyPic2.jpg");
        babyPics.add("babyPic3.jpg");
        String randomImageFile = babyPics.get(randNum);
        ImageIcon randomImage = new ImageIcon("src/images/"+randomImageFile);
        return randomImage;
        
    }
    
    
}
