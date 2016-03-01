/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid.semestergame;

import Objects.Baby;
import Objects.Obstacle;
import Objects.Skydiver;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Graham
 */
public class MenuPanel extends JPanel implements ActionListener {
    private Timer timer1;
    private Timer timerObstacle;
    private int playerScore;
    private boolean gameOver;
    static int timerCount;
    private Background background1;
    
    MenuPanel(){
        
        
        background1 = new Background(500, 500, this); 
        GamePanel.timerCount =0;
        //playerScore = 0;
        gameOver =false;
        timer1 = new Timer(50, this);
        timer1.start();
        timerObstacle = new Timer(750,this);
        timerObstacle.start();
        setFocusable(true);
    }
    
    public void paintComponent(Graphics g){
       super.paintComponent(g);
       
       g.clearRect(0, 0, this.getWidth(), this.getHeight());
       background1.paintComponentMenu(g);
    
    }
        
    public void actionPerformed(ActionEvent e){
        Object o = e.getSource();
        

        if(o== timer1){
            this.repaint();
             
        }
        
    }
    
  
    
    
}
