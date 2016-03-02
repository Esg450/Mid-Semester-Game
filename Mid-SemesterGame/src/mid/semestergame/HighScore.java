/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid.semestergame;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.*;




/**
 *
 * @author Zack
 */
public class HighScore {
    
    private int[] scores = new int[5];
    private String fileName = "";
    private JPanel panel = new JPanel();
    public HighScore(String fileName)
    {
        File file = new File(fileName);
        this.fileName = fileName;
        readFileIn();
    }
    private void readFileIn()
    {
         Scanner in = new Scanner(fileName);
        int counter = 0;
        while(in.hasNextLine())
        {
            scores[counter] = in.nextInt();
            counter++;
        }
        
    }
    public void addHighScore(int score)
    {
        try
        {
            
        
        
        PrintWriter pw = new PrintWriter(fileName);
       
       for(int i = 0;i<scores.length;i++)
        {
            if(scores[i] < score)
            {
                scores[i] = score;
            }
          
           
        }
       for(int i =0;i<scores.length;i++)
       {
           pw.println(scores[i]);
       }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Something went wrong");
        }
    }
    public void displayHighScores()
    {
        panel.setSize(400,400);
        getComponents();
        panel.setVisible(true);
        
    }
    private void getComponents()
    {
        JLabel score1 = new JLabel("1. " + scores[0]);
        JLabel score2 = new JLabel("2. " + scores[1]);
        JLabel score3 = new JLabel("3. " + scores[2]);
        JLabel score4 = new JLabel("4. " + scores[3]);
        JLabel score5 = new JLabel("5. " + scores[4]);
        panel.add(score1);
        panel.add(score2);
        panel.add(score3);
        panel.add(score4);
        panel.add(score5);
        
    }
}
