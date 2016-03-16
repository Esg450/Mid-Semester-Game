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
    private javax.swing.JButton instructionsButton;
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
        this.setTitle(title);
        this.setSize(new Dimension(500, 500));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().add(this.menuPanel);
        setVisible(true);
        setResizable(false);
        GamePanel.timerCount =0;
        
        
    }

}
