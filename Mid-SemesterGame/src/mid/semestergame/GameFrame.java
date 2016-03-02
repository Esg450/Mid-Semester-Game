/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid.semestergame;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Graham
 */
public class GameFrame extends JFrame{
   
    
    private GameController masterGameController;

    public GameFrame(String title,  GameController theGameController) {
        
        masterGameController = theGameController;
        this.setTitle(title);
        this.setSize(new Dimension(500, 500));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        
    }
   
}
