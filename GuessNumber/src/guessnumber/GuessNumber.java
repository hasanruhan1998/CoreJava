/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessnumber;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class GuessNumber {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
  
        Scanner s=new Scanner(System.in);
        int randomNumber= (int) (Math.random()*101);
        
        int maxAttempts=3;
        int attemptsCount=0;
        
       do {
            
            System.out.println("Pls enter ur Guess Number");
            int guessNumber=s.nextInt();
           
            if(guessNumber== randomNumber){
                System.out.println("Congratulation !");
                break;
            }
            else if(guessNumber<randomNumber){
                System.out.println("Your gues number is lower");
            }
            else if(guessNumber>randomNumber){
             System.out.println("Your gues number is Higher");            
            }
          
            attemptsCount++;
        }
       while (attemptsCount<maxAttempts);
        
        if(attemptsCount==maxAttempts){
            System.out.println("Sorry You loss the game and the guess number is: "+randomNumber);
            
        }   
        
        
        
        
    }
    
}
