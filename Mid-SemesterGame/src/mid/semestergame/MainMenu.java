/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid.semestergame;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Graham
 */
public class MainMenu extends JFrame {
    private GameController masterGameController;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton highScoresButton;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel titleLabel;
    private JPanel menuPanel;
    private Background background1;
    private Timer timer1;
    static int timerCount;
    
    public MainMenu(String title, GameController theGameController){
        masterGameController = theGameController;
        menuPanel = new MenuPanel();
        initComponents();
        this.setTitle(title);
        this.setSize(new Dimension(500, 500));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().add(this.menuPanel);
        setVisible(true);
        setResizable(false);
        GamePanel.timerCount =0;
        
        
    }
    
    
    
    private void initComponents() {

        startButton = new javax.swing.JButton();
        highScoresButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();

        

        startButton.setBackground(java.awt.SystemColor.text);
        startButton.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        startButton.setText("Start Game");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        highScoresButton.setBackground(java.awt.SystemColor.text);
        highScoresButton.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        highScoresButton.setText("High Scores");
        highScoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highScoresButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(java.awt.SystemColor.text);
        exitButton.setFont(new java.awt.Font("OCR A Extended", 0, 11)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        titleLabel.setText("Xtreme Sky Diving Baby Rescue 10,000 ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(layout);
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
                .addComponent(exitButton)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void highScoresButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        masterGameController.startGame();// TODO add your handling code here:
    }                                           

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }
}
