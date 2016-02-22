/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid.semestergame;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.Rectangle;
import Objects.*;
import java.util.ArrayList;
/**
 *
 * @author matthewtucker
 */
public class GamePanel extends JPanel implements ActionListener,KeyListener {
    private Timer timer1;
    private Skydiver player1;
    private ArrayList <Obstacle> obstacles;
    private int playerScore;
    private boolean gameOver;
    
    GamePanel(){
        timer1 = new Timer(50, this);
        timer1.start();
    }
    
    public void actionPerformed(ActionEvent e){
        
    }
    
    public void keyTyped(KeyEvent e){
        
    }
    
    public void keyPressed (KeyEvent e){
        
    }
    
    public void keyReleased(KeyEvent e){
        
    }
    
}
