/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author Zack
 */
public class Baby {
    private int dy = 0;
    private int xLocation = 0;
    private int yLocation = 0;
    public Baby(int x, int y)
    {
        xLocation = x;
        yLocation = y;
    }
    public int getCurrentX()
    {
        return xLocation;
    }
    public int getCurrentY()
    {
        return yLocation;
    }
    public void move()
    {
        
    }
    
    
}
