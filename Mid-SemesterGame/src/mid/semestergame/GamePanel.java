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
    private Timer timerObstacle;
    private Skydiver player1;
    private ArrayList <Obstacle> obstacles;
    private ArrayList<Baby> babies;
    private int playerScore;
    private boolean gameOver;
    private int highScore;
    
    GamePanel(){
        this.addKeyListener(this);
        player1 = new Skydiver(500,500, this);
        
        obstacles = new ArrayList <>();
        playerScore = 0;
        gameOver =false;
        highScore=0;
        timer1 = new Timer(50, this);
        timer1.start();
        timerObstacle = new Timer(500,this);
        timerObstacle.start();
        setFocusable(true);
    }
    
    public void paintComponent(Graphics g){
       super.paintComponent(g);
       
       g.clearRect(0, 0, this.getWidth(), this.getHeight());
       player1.paintComponenet(g);
       
       for(int i = 0; i<obstacles.size(); i++){
           obstacles.get(i).paintComponent(g);
       }
       
       
       for(int i = 0; i<obstacles.size(); i++){
           if(player1.intersects(obstacles.get(i))){
               timer1.stop();
           }
           else{
               highScore++;
           }
           
       }
      /* for(int i = 0; i<babies.size(); i++){
           timer1.stop();
       }
       */       
       
       
    }
        
    public void actionPerformed(ActionEvent e){
        Object o = e.getSource();
        
        if(o== timer1){
            this.repaint();
        }
        else if( o == timerObstacle){
            obstacles.add(new Obstacle(500,500, this));
        }
    }
    
    public void keyTyped(KeyEvent e){
        
    }
    
    public void keyPressed (KeyEvent e){
        
        player1.keyPressed(e);
    }
    
    public void keyReleased(KeyEvent e){
        player1.keyReleased(e);
    }
    public int calculateHighScore(){
        return highScore;
    }
    
}
