/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mid.semestergame;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.*;




/**
 *
 * @author Zack
 */
public class HighScore extends JPanel{
    
    private int[] scores = new int[100];
    private String fileName = "src/TextFiles/HighScores.txt";
    private JLabel score1;
    private JLabel score2;
    private JLabel score3;
    private JLabel score4;
    private JLabel score5;
    private JButton btnBack;
    private ActionListener ClickListener;
    public HighScore()
    {
        
        readFileIn();
        setLabels();
        update();
        this.add(score1);
        this.add(score2);
        this.add(score3);
        this.add(score4);
        this.add(score5);
        addButton();
        
        
    }
    public void update()
    {
        readFileIn();
        int [] scores2 = findHighestScores(scores);
        score1.setText("1. " + scores2[0]);
        score2.setText("2. " + scores2[1]);
        score3.setText("3. " + scores2[2]);
        score4.setText("4. " + scores2[3]);
        score5.setText("5. " + scores2[4]);
        
    }
    //Move method refactoring from constructor
    //refactoring done by Zack Lehmann
    private void setLabels()
    {
        int [] scores2 = findHighestScores(scores);
        score1= new JLabel("1. " + scores2[0]);
        score2= new JLabel("2. " + scores2[1]);
        score3= new JLabel("3. " + scores2[2]);
        score4= new JLabel("4. " + scores2[3]);
        score5= new JLabel("5. " + scores2[4]);
    }
    private void addButton()
    {
        btnBack = new JButton("Go Back");
        btnBack.setVisible(true);
        this.add(btnBack);
        //btnBack.addActionListener(ClickListener);
    }
    private void readFileIn()
    {
       try{ 
       File file1 = new File("src//TextFiles//HighScores.txt");    
       Scanner in = new Scanner(file1);
        int counter = 0;
  
        while(in.hasNextInt())
        {
            scores[counter] = in.nextInt();
            counter++;
        }
        
        in.close();
        
       }
       
       catch(Exception e){
          e.printStackTrace();
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
        this.setSize(400,400);
        getComponents();
        this.setVisible(true);
        
    }
   
    public int [] findHighestScores(int [] scores){
        int[] highestScores = new int [5];
        int max = 0;
        int max2 =0;
        int max3 = 0;
        int max4 =0;
        int max5 = 0;
        for(int j=0; j < scores.length; j++){
            if(scores[j]>max){
                max = scores[j]; 
            } 
        }   
        
        for(int i =0; i<scores.length; i++){
            if(scores[i]>max2 && scores[i]<max){
                max2 = scores[i];
            }
        }
        
        for(int i =0; i<scores.length; i++){
            if(scores[i]>max3 && scores[i]<max2){
                max3 = scores[i];
            }
        }
        
        for(int i =0; i<scores.length; i++){
            if(scores[i]>max4 && scores[i]<max3){
                max4 = scores[i];
            }
        }
        for(int i =0; i<scores.length; i++){
            if(scores[i]>max5 && scores[i]<max4){
                max5 = scores[i];
            }
        }
        
        highestScores[0]= max;
        highestScores[1] = max2;
        highestScores[2] = max3;
        highestScores[3] = max4;
        highestScores[4] = max5;
        
        return highestScores;
        
    }
    
    public JButton getBackBtn(){
        return this.btnBack;
    }
    
   
}

