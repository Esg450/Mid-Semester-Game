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
public class HighScore extends JPanel{
    
    private int[] scores = new int[5];
    private String fileName = "HighScores.txt";
    private JLabel score1;
    private JLabel score2;
    private JLabel score3;
    private JLabel score4;
    private JLabel score5;
    public HighScore()
    {
        File file = new File(fileName);
        
        readFileIn();
        this.add(score1);
        this.add(score2);
        this.add(score3);
        this.add(score4);
        this.add(score5);
        
        
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
        score1= new JLabel("1. " + scores[0]);
        score2= new JLabel("2. " + scores[1]);
        score3= new JLabel("3. " + scores[2]);
        score4= new JLabel("4. " + scores[3]);
        score5= new JLabel("5. " + scores[4]);
        
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
        this.setSize(400,400);
        getComponents();
        this.setVisible(true);
        
    }
   
   
}
