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
import javax.swing.JButton;

/**
 *
 * @author Graham
 */
public class MenuPanel extends JPanel implements ActionListener {
    private javax.swing.JButton instructionsButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton highScoresButton;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel titleLabel;
    private Timer timer1;
    private Timer timerObstacle;
    private int playerScore;
    private boolean gameOver;
    static int timerCount;
    private Background background1;
    
    MenuPanel(){
        
        initComponents();
        background1 = new Background(500, 500, this); 
        //GamePanel.timerCount =0;
        //playerScore = 0;
        gameOver =false;
        timer1 = new Timer(50, this);
        timer1.start();
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
    
    public JButton getStartButton(){
        return this.startButton;
    }
    
    public JButton getHighScoreButton(){
        return this.highScoresButton;
    }
    
    public JButton getExitButton(){
        return this.exitButton;
    }
    
    public JButton getInstructionsButton(){
        return this.instructionsButton;
    }

    
  private void initComponents() {

        startButton = new javax.swing.JButton();
        highScoresButton = new javax.swing.JButton();
        instructionsButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        titleLabel = new JLabel();
        

        startButton.setBackground(java.awt.SystemColor.text);
        startButton.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        startButton.setText("Start Game");
        

        highScoresButton.setBackground(java.awt.SystemColor.text);
        highScoresButton.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        highScoresButton.setText("High Scores");
        

        instructionsButton.setBackground(java.awt.SystemColor.text);
        instructionsButton.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        instructionsButton.setText("Instructions");
        

        exitButton.setBackground(java.awt.SystemColor.text);
        exitButton.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        exitButton.setText("Exit");
        
        
        titleLabel.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        titleLabel.setText("Xtreme Sky Diving Baby Rescue 10,000 ");

        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(titleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(highScoresButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(instructionsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(titleLabel)
                .addGap(117, 117, 117)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(highScoresButton)
                .addGap(18, 18, 18)
                .addComponent(instructionsButton)
                .addGap(18, 18, 18)
                .addComponent(exitButton)
                .addContainerGap(133, Short.MAX_VALUE))
        );
  
        validate();
    }// </editor-fold>                       
}
