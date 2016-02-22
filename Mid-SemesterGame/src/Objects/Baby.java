/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.awt.Rectangle;

/**
 *
 * @author Zack
 */
public class Baby extends Rectangle{
    private int dy = 0;
   
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
    public void drawImage()
    {
       
    }
    
    
}
