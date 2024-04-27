/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forloopfactorial;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ForLoopFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        int facVAlue=5;
//        int factorial=1;
//        for (int i=facVAlue; i<=1;i--){
//            factorial *=i;
//        }
//        
//        System.out.println("factorial is:"+factorial);  
        Scanner s=new Scanner(System.in);
    int input=s.nextInt();
    int count=0;
    
    
    for(int i=1;i<=input;i++){
     if(input%i==0)   {count++;}
    }
    if(count==2){
        System.out.println("prime");
    }
    else{ System.out.println("not prime"); }
    }
       
        
        
    }
    

