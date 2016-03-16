/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//GameController class refactored by Graham Ervin

package mid.semestergame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

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
    private ArrayList <GamePanel> games;
    
    public GameController(){
        super();
        this.theFrame = new GameFrame("MidSemesterGame", this);
        this.theMenuPanel = new MenuPanel();
        //this.thePanel = new GamePanel(this);
        this.inst = new InstructionsPanel();
        this.hscore1 = new HighScore();
        games = new ArrayList <>();
        games.add(new GamePanel(this));
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
        this.hscore1.getBackBtn().addActionListener(this);
        this.inst.getReturnButton().addActionListener(this);
    }
    
    public void returnToMenu(){
        this.theFrame.remove(games.get(games.size()-1));
        this.theFrame.add(this.theMenuPanel);
        this.theMenuPanel.setFocusable(true);
        this.theMenuPanel.requestFocusInWindow();
        this.theFrame.revalidate();
        this.theFrame.repaint();
    }
    
    public GamePanel getGamePanel(){
        return this.thePanel;
    }
    
    //Extracted methods startButtonPressed, highScoreButtonPressed, backButtonPressed, instructionsButtonPressed, and returnButtonPressed to cleanup actionPreforemd class
    //Methods extracted by: Graham Ervin
    @Override
    public void actionPerformed(ActionEvent e) {
        
        Object o = e.getSource();
        if(o==this.theMenuPanel.getStartButton()){
            startButtonPressed();
        }
        
        else if(o == this.theMenuPanel.getHighScoreButton()){
           highScoreButtonPressed();
        }
        
        else if(o == this.hscore1.getBackBtn()){
            backButtonPressed();
        }
        
        else if(o == this.theMenuPanel.getInstructionsButton()){
            instructionsButtonPressed();
        }
        
        else if(o == this.inst.getReturnButton()){
            returnButtonPressed(); 
        }
        
        else if(o == this.theMenuPanel.getExitButton()){
            System.exit(0);
        }
 
    }
    
    //Extracted method for the start button action preformed
    public void startButtonPressed(){
        this.theFrame.remove(this.theMenuPanel);
        this.games.remove(0);
        this.games.add(new GamePanel(this));
        this.theFrame.add(games.get(0));
        this.theFrame.revalidate(); 
        this.theFrame.repaint();
        this.games.get(0).setFocusable(true);
        this.games.get(0).requestFocusInWindow();
        this.games.get(0).setGameOver(false);
        this.games.get(0).revalidate();
        this.games.get(0).repaint();
        games.get(0).getTimer().start();
    }
    
    //Extracted method for the high score button action preformed
    public void highScoreButtonPressed(){
        this.theFrame.remove(this.theMenuPanel);
        this.theFrame.add(this.hscore1);
        this.theFrame.revalidate();
        this.theFrame.repaint();  
    }
    
    //Extracted method for the back button action preformed
    public void backButtonPressed(){
        this.theFrame.remove(this.hscore1);
        this.theFrame.add(this.theMenuPanel);
        this.theFrame.revalidate();
        this.theFrame.repaint();
    }
    
    //Extracted method for the instructions button action preformed
    public void instructionsButtonPressed(){
        this.theFrame.remove(this.theMenuPanel);
        this.theFrame.add(this.inst);
        this.theFrame.revalidate();
        this.theFrame.repaint();
    }
    
    //Extracted method for the return button action preformed
    public void returnButtonPressed(){
        this.theFrame.remove(this.inst);
        this.theFrame.add(this.theMenuPanel);
        this.theFrame.revalidate();
        this.theFrame.repaint();
    }
  
}