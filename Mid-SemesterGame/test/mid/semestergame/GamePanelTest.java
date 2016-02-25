/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid.semestergame;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matthewtucker
 */
public class GamePanelTest {
    
    public GamePanelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of getHighScore method, of class GamePanel.
     */
    @Test
    public void testGetHighScore() {
        System.out.println("getHighScore");
        GamePanel instance = new GamePanel();
        int expResult = 0;
        int result = instance.getScore();
        assertEquals(expResult, result);
    }

    
    @Test
    public void testCalculateScore() {
        System.out.println("calculateHighScore");
        ActionEvent e = null;
        GamePanel instance = new GamePanel();
        double expResult = GamePanel.getTimerCount();
        double result = instance.calculateScore(e);
        assertEquals(expResult, result, 0.0);
    }

   

    


   
    
}
