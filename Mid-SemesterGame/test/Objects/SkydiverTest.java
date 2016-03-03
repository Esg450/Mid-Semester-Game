/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.awt.Graphics;
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
public class SkydiverTest {
    
    public SkydiverTest() {
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
     * Test of getX method, of class Skydiver.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Skydiver instance = new Skydiver(500,500);
        double expResult = 0;
        double result = instance.getX();
        assertEquals(expResult, result, 0.0);
    }
    
     @Test
    public void testMoveRight() {
        System.out.println("move");
        Skydiver instance = new Skydiver(500,500);
        double x = instance.getX();
        instance.setDx(20);
        instance.move();
        double result = instance.getX();
        assertEquals(20, result, 0.0);  
    }
    
     @Test
    public void testMoveLeft() {
        System.out.println("move");
        Skydiver instance = new Skydiver(500,500);
        double x = instance.getX();
        instance.setDx(-20);
        instance.move();
        double result = instance.getX();
        assertEquals(-20, result, 0.0);  
    }
    
     @Test
    public void testMoveZero() {
        System.out.println("move");
        Skydiver instance = new Skydiver(500,500);
        double x = instance.getX();
        instance.setDx(0);
        instance.move();
        double result = instance.getX();
        assertEquals(0, result, 0.0);  
    }
    
}
