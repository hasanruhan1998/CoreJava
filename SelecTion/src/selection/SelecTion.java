/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selection;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SelecTion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//          int maxNumber;
//          
//        System.out.println("Enter Your First Number");;
//      int firstNumber=scanner.nextInt();
//        
//       System.out.println("Enter Your Secound Number");;
//      int SecoundNumber=scanner.nextInt();   
//      
//        System.out.println("Enter Your Third Number");;
//      int thirdNumber=scanner.nextInt();
//      
//      
//      if(firstNumber>SecoundNumber & firstNumber>thirdNumber){
//          maxNumber=firstNumber;
//      }
//      else if(SecoundNumber>firstNumber & SecoundNumber>thirdNumber){
//           maxNumber=SecoundNumber;
//      }
//      else{maxNumber=thirdNumber;
//      }
//        System.out.println("maxNumber is : "+maxNumber);
   
Scanner scan = new Scanner(System.in);
    
     System.out.println("Enter Your Number: ");
        int grad=scan.nextInt();
        
        if(grad>=80){
            System.out.println("Enter Your Number: A+");
        }
        else if(grad>=70){
            System.out.println("Enter Your Number: A"); 
        }
        else if(grad>=60){
            System.out.println("Enter Your Number: A-"); 
        }
        else if(grad>=50){
            System.out.println("Enter Your Number: B"); 
        }
        else if(grad>=40){
            System.out.println("Enter Your Number: C"); 
        }
        else if(grad>=33){
            System.out.println("Enter Your Number: D"); 
        }
        else{
            System.out.println("Enter Your Number: F"); 
        }
        
        
        
       
        
        
      
        
               


    }
    
}
