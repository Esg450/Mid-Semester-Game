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

    @Test
    public void testGetHighScoreWhenOldScoreIsHigher() {
        System.out.println("getHighScore");
        
        GamePanel instance = new GamePanel();
        int oldScore = 12;
        int newScore = 11;
        int expResult = 12;
        int result = instance.getHighScore(oldScore, newScore);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetHighScoreWhenNewScoreIsHigher() {
        System.out.println("getHighScore");
        GamePanel instance = new GamePanel();
        int oldScore = 11;
        int newScore = 12;
        int expResult = 12;
        int result = instance.getHighScore(oldScore, newScore);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetScore() {
        System.out.println("getScore");
        GamePanel instance = new GamePanel();
        int expResult = 0;
        int result = instance.getScore();
        assertEquals(expResult, result);
       
    }
  
    @Test
    public void testGetLowScoreWhenOldScoreIsLower() {
        System.out.println("getLowScore");
        int oldScore = 10;
        int newScore = 11;
        GamePanel instance = new GamePanel();
        int expResult = 10;
        int result = instance.getLowScore(oldScore, newScore);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetLowScoreWhenNewScoreIsLower() {
        System.out.println("getLowScore");
        int oldScore = 11;
        int newScore = 10;
        GamePanel instance = new GamePanel();
        int expResult = 10;
        int result = instance.getLowScore(oldScore, newScore);
        assertEquals(expResult, result);
    }

    @Test
    public void testGameOverWhenGameOverIsFalse() {
        System.out.println("gameOver");
        boolean gameOver = false;
        GamePanel instance = new GamePanel();
        String expResult = "Game in play";
        String result = instance.gameOver(gameOver);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGameOverWhenGameOverIsTrue() {
        System.out.println("gameOver");
        boolean gameOver = true;
        GamePanel instance = new GamePanel();
        String expResult = "Game Over";
        String result = instance.gameOver(gameOver);
        assertEquals(expResult, result);
    }
    
}
