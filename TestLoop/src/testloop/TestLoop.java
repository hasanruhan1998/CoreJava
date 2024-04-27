/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testloop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TestLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        
        System.out.println("Enter Start point value");
        int startPoint=s.nextInt();
        System.out.println("Enter End Poitnt value");
        int endPoint=s.nextInt();
        
        while(startPoint<=endPoint){
            
            if(startPoint%3!=0 || startPoint%5!=0){
                
                System.out.println(startPoint);
            } 
            
            startPoint++;  // startPoint=startPoint+1;  startPoint +=1;
        }
 
      
        
    
    
    
    
    }
}
