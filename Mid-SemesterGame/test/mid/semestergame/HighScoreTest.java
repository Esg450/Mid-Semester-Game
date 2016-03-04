/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid.semestergame;

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
public class HighScoreTest {
    
    public HighScoreTest() {
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
     * Test of findHighestScores method, of class HighScore.
     */
    @Test
    public void testFindHighestScoresWhenInAscendingOrder() {
        System.out.println("findHighestScores");
        int[] scores = {1, 10, 30, 45, 500};
        HighScore instance = new HighScore();
        int[] expResult = {500, 45, 30, 10, 1};
        int[] result = instance.findHighestScores(scores);
        assertArrayEquals(expResult, result);
      
    }
    
    @Test
    public void testFindHighestScoresWhenInDescendingOrder() {
        System.out.println("findHighestScores");
        int[] scores = {500, 45, 30, 10, 1};
        HighScore instance = new HighScore();
        int[] expResult = {500, 45, 30, 10, 1};
        int[] result = instance.findHighestScores(scores);
        assertArrayEquals(expResult, result); 
    }
    
    @Test
    public void testFindHighestScoresWhenInNoOrder() {
        System.out.println("findHighestScores");
        int[] scores = {10, 45, 1, 500, 30};
        HighScore instance = new HighScore();
        int[] expResult = {500, 45, 30, 10, 1};
        int[] result = instance.findHighestScores(scores);
        assertArrayEquals(expResult, result);
      
    }
    
    @Test
    public void testFindHighestScoresWhenInitialArrayIsNotFull() {
        System.out.println("findHighestScores");
        int[] scores = {500, 12};
        HighScore instance = new HighScore();
        int[] expResult = {500, 12, 0, 0, 0};
        int[] result = instance.findHighestScores(scores);
        assertArrayEquals(expResult, result);
      
    }
    
    @Test
    public void testFindHighestScoresWhenAllValuesTheSame() {
        System.out.println("findHighestScores");
        int[] scores = {500, 500, 500, 500, 500};
        HighScore instance = new HighScore();
        int[] expResult = {500, 0, 0, 0, 0};
        int[] result = instance.findHighestScores(scores);
        assertArrayEquals(expResult, result);
      
    }
    @Test
    public void testFindHighestScoresMoreThanFiveValues() {
        System.out.println("findHighestScores");
        int[] scores = {2000, 200, 500, 800, 600,700, 400};
        HighScore instance = new HighScore();  //Stll todo
        int[] expResult = {2000, 800, 700, 600, 500};
        int[] result = instance.findHighestScores(scores);
        assertArrayEquals(expResult, result);
      
    }
    @Test
    public void testFindHighestScoresWhenEmpty() {
        System.out.println("findHighestScores");
        int[] scores = {0, 0, 0, 0, 0};  //Still todo
        HighScore instance = new HighScore();
        int[] expResult = {0, 0, 0, 0, 0};
        int[] result = instance.findHighestScores(scores);
        assertArrayEquals(expResult, result);
      
    }
    
}
