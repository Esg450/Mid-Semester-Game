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
import java.awt.Graphics;
import java.util.ArrayList;
/**
 *
 * @author matthewtucker
 */
public class GamePanel extends JPanel implements ActionListener,KeyListener {
    private Timer timer1;
    private Skydiver player1;
    private ArrayList <Obstacle> obstacles;
    private ArrayList<Baby> babies;
    private int playerScore;
    private boolean gameOver;
    
    GamePanel(){
        player1 = new Skydiver();
        obstacles = new ArrayList <>();
        playerScore = 0;
        gameOver =false;
        timer1 = new Timer(50, this);
        timer1.start();
    }
    
    public void paintComponent(Graphics g){
       super.paintComponent(g);
       
       g.clearRect(0, 0, this.getWidth(), this.getHeight());
       
       for(int i = 0; i<obstacles.size(); i++){
           if(player1.intersects(obstacles.get(i))){
               timer1.stop();
           }
       }
       for(int i = 0; i<babies.size(); i++){
           timer1.stop();
       }
       
       
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
