/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid.semestergame;

/**
 *
 * @author Graham
 */
public class GameController {
    private MainMenu theMenu;
    private MenuPanel theMenuPanel;
    private GamePanel thePanel;
    private GameFrame theFrame;
    
    public GameController(){
        
        theMenuPanel = new MenuPanel();
        theMenu = new MainMenu("MidSemesterGame", this);
        
    }
    
    public void startGame(){
        
        theFrame = new GameFrame("Midsemester Game", this);
    }
    
    public void returnToMenu(){
        theFrame.dispose();
        theMenu.setVisible(true);
    }
}
