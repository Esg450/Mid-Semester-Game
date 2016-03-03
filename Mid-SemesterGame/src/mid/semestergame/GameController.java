/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid.semestergame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Graham
 */
public class GameController implements ActionListener{
    private MainMenu theMenu;
    private MenuPanel theMenuPanel;
    private GamePanel thePanel;
    private GameFrame theFrame;
    private InstructionsPanel inst;
    private HighScore hscore1;
    
    
    public GameController(){
        super();
        
        this.theFrame = new GameFrame("MidSemesterGame", this);
        
        this.theMenuPanel = new MenuPanel();
        this.thePanel = new GamePanel(this);
        this.inst = new InstructionsPanel();
        this.hscore1 = new HighScore();
        
        launchToMenuPanel();
        addMenuListeners();
        
           
    }
    
    private void launchToMenuPanel(){
        this.theFrame.add(theMenuPanel);
        this.theFrame.setVisible(true);
        this.theFrame.setResizable(false);
        
    }
    
    public void addMenuListeners(){
        this.theMenuPanel.getStartButton().addActionListener(this);
        this.theMenuPanel.getHighScoreButton().addActionListener(this);
        this.theMenuPanel.getInstructionsButton().addActionListener(this);
        this.theMenuPanel.getExitButton().addActionListener(this);
        
    }
    
    public void returnToMenu(){
        this.theFrame.remove(this.thePanel);
            
            this.theFrame.add(this.theMenuPanel);
            this.theMenuPanel.setFocusable(true);
            this.theMenuPanel.requestFocusInWindow();
            this.theFrame.revalidate(); 
    }
    public GamePanel getGamePanel(){
        return this.thePanel;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Object o = e.getSource();
        if(o==this.theMenuPanel.getStartButton()){
            this.theFrame.remove(this.theMenuPanel);
            
            this.theFrame.add(this.thePanel);
            this.thePanel.setFocusable(true);
            this.thePanel.requestFocusInWindow();
            this.theFrame.revalidate(); 
            thePanel.getTimer().start();
        }
        
        else if(o == this.theMenuPanel.getHighScoreButton()){
            this.theFrame.remove(this.theMenuPanel);
            this.theFrame.add(this.hscore1);
            this.theFrame.revalidate();
            
        
        }
        
        
    }

    
}
