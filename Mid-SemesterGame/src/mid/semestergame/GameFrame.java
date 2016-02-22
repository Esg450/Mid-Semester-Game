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
    private final JPanel panel;

    public GameFrame(String title, JPanel panel) {
        
        //Set properties
        this.setTitle(title);
        this.setSize(new Dimension(600, 600));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        // Add the panel
        this.panel = panel;
        this.getContentPane().add(this.panel);
    }
   
}
