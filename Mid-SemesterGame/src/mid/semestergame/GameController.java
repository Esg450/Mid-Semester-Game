/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid.semestergame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Graham
 */
public class GameController implements ActionListener {
    private MainMenu theMenu;
    private MenuPanel theMenuPanel;
    private GamePanel thePanel;
    private GameFrame theFrame;
    private InstructionsPanel inst;
    
    public GameController(){
        this.theFrame = new GameFrame("MidSemesterGame", this);
        this.theMenuPanel = new MenuPanel();
        this.thePanel = new GamePanel();
        this.inst = new InstructionsPanel();
        launchToMenuPanel();
        addMenuListeners();
        
           
    }
    
    private void launchToMenuPanel(){
        this.theFrame.add(theMenuPanel);
        this.theFrame.setVisible(true);
        this.theFrame.setResizable(false);
    }
    
    public void addMenuListeners(){
        this.theMenuPanel.startButton.addActionListener(this);
        this.theMenuPanel.highScoresButton.addActionListener(this);
        this.theMenuPanel.instructionsButton.addActionListener(this);
        this.theMenuPanel.exitButton.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hi");
        Object o = e.getSource();
        if(o==this.theMenuPanel.startButton){
            this.theFrame.remove(this.theMenuPanel);
            
            this.theFrame.add(this.thePanel);
            this.thePanel.setFocusable(true);
            this.thePanel.requestFocusInWindow();
            this.theFrame.revalidate(); 
        }
    }
}
