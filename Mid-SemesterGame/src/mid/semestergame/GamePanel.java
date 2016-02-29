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
import java.awt.Image;
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
    private int score1;
    private int highScore;
    static int timerCount;
    private int timer2Count;
    private Background background1;
    private JLabel score;
    private int lowScore;
    
    GamePanel(){
        
        this.addKeyListener(this);
        background1 = new Background(500, 500, this); 
        player1 = new Skydiver(500,500, this);
        GamePanel.timerCount =0;
        timer2Count = 0;
        obstacles = new ArrayList <>();
        babies = new ArrayList <>();
        playerScore = 0;
        gameOver =false;
        score1=0;
        timer1 = new Timer(50, this);
        timer1.start();
        timerObstacle = new Timer(500,this);
        timerObstacle.start();
        setFocusable(true);
        score = new JLabel("Score: "+getScore());
        add(score);
        this.lowScore = 0;
    }
    
    public void paintComponent(Graphics g){
       super.paintComponent(g);
       
       g.clearRect(0, 0, this.getWidth(), this.getHeight());
       background1.paintComponent(g);
       player1.paintComponenet(g);
       
       for(int i = 0; i<obstacles.size(); i++){
           obstacles.get(i).paintComponent(g);
       }
       for(int i =0; i <babies.size(); i++)
       {
           babies.get(i).paintComponent(g);
       }
       
       
       for(int i = 0; i<obstacles.size(); i++){
           if(player1.intersects(obstacles.get(i))){
               timer1.stop();
               timerObstacle.stop();
           }
           else{
               score1++;
           }
           
          
       }
       for(int i = 0; i<babies.size(); i++){
           if(player1.intersects(babies.get(i))){
               score1+=100;
               babies.remove(i);
           }
       }
             
       
        
    }
        
    public void actionPerformed(ActionEvent e){
        Object o = e.getSource();
        

        if(o== timer1){
            this.repaint();
            
            
        }
        else if( o == timerObstacle){
           obstacles.add(new Obstacle(500,500, this));
           babies.add(new Baby(500,500, this));
            timer2Count++;
            GamePanel.timerCount++;
            updateScore();
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
    public int getScore(){
        return score1;
    }
    
    public double calculateScore(ActionEvent e){
        Object o = e.getSource();
        if(o== timerObstacle && timer2Count%1000==0){
            score1++;
        }
        return this.score1;
    }
    
    public static int getTimerCount(){
        return GamePanel.timerCount;
    }
    
    public void updateScore(){
        this.score.setText( "Score: "+getScore());
    }
    
   public int getHighScore(int oldScore, int newScore){
       if(newScore>oldScore){
           this.highScore = newScore;
       }
       
       else{
           this.highScore = oldScore;
       }
       return highScore;
   }
   
   public int getLowScore(int oldScore, int newScore){
       if(newScore<oldScore){
           this.lowScore = newScore;
       }
       
       else{
           this.lowScore = oldScore;
       }
       return lowScore;
   }
   
   public String gameOver(boolean gameOver){
       if(gameOver == true){
           return "Game Over";
       }
       
       else{
           return "Game in play";
       }
   }
}
