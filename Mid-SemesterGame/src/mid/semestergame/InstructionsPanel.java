/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid.semestergame;
import javax.swing.*;
/**
 *
 * @author matthewtucker
 */
public class InstructionsPanel extends JPanel {
    private JLabel label1;
    private JButton return1;
    
    InstructionsPanel(){
        label1 = new JLabel ("Instructions");
        add(label1);
        return1 = new JButton("Return");
        add(return1);
    }
    
    public JButton getReturnButton(){
        return this.return1;
    }
}
