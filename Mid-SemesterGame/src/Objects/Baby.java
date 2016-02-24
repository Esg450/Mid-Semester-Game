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
    private int speed = 5;
    private int size = 10;
    private boolean dirUp = true;
    private ImageIcon image = new ImageIcon();
   
    public Baby(int x, int y)
    {
        super.setLocation(x, y);
        image = getRandomImage();
        
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
         if(dirUp) {
            this.y += speed;
            if(this.y >= 600 - size) {
                this.switchDirections();
            }
        } else {
            this.y -= speed;
            if(this.y <= 0) {
                this.switchDirections();
            }
        }
    }
    public void switchDirections()
    {
        dirUp = !dirUp;
    }
    public void drawImage(Graphics g)
    {
        move();
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
