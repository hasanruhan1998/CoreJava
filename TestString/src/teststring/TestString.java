
package teststring;

import java.util.Scanner;


public class TestString {

    
    public static void main(String[] args) {
Scanner s=new Scanner(System.in);
        
        System.out.println("Enter ur email id ");
        String userEmail=s.next();
    
        String message=String.format("Wlcome %s to Google",userEmail);
        
        if(userEmail.equalsIgnoreCase("java")){
            System.out.println("Enter ur password");
            String password=s.next();
            
            if(password.equals("Java1234")){
                System.out.println(message);
            }
            else{
                System.out.println("Incorrect Password");
            }
            
        }
        else{
            System.out.println("Couldn't find ur Google Account");
        }
       

//         System.out.println("Email Username ");
//        String userEmail = s.next();
//        System.out.println("EmailPassword ");
//        String password = s.next();
//
//        if (userEmail.equalsIgnoreCase("MD:Hasan")) {
//
//            if (password.equals("facebook234")) {
//                System.out.print("Wellcome to FaceBook");
//            } else {
//                System.out.println("");
//            }
//        } else {
//            System.out.println("Wrong credentials\n"
//                    + "Invalid username or password");
//        }
// System.out.println("Email Username ");
//        String userEmail = s.next();
//        System.out.println("EmailPassword ");
//        String password = s.next();
//
//        if (userEmail.equalsIgnoreCase("MD:Hasan")) {
//
//            if (password.equals("facebook234")) {
//                System.out.print("Wellcome to FaceBook");
//            } else {
//                System.out.println("");
//            }
//        } else {
//            System.out.println("Wrong credentials\n"
//                    + "Invalid username or password");
//        }
// System.out.println("Email Username ");
//        String userEmail = s.next();
//        System.out.println("EmailPassword ");
//        String password = s.next();
//
//        if (userEmail.equalsIgnoreCase("MD:Hasan")) {
//
//            if (password.equals("facebook234")) {
//                System.out.print("Wellcome to FaceBook");
//            } else {
//                System.out.println("");
//            }
//        } else {
//            System.out.println("Wrong credentials\n"
//                    + "Invalid username or password");
//        }
// System.out.println("Email Username ");
//        String userEmail = s.next();
//        System.out.println("EmailPassword ");
//        String password = s.next();
//
//        if (userEmail.equalsIgnoreCase("MD:Hasan")) {
//
//            if (password.equals("facebook234")) {
//                System.out.print("Wellcome to FaceBook");
//            } else {
//                System.out.println("");
//            }
//        } else {
//            System.out.println("Wrong credentials\n"
//                    + "Invalid username or password");
//        }
// System.out.println("Email Username ");
//        String userEmail = s.next();
//        System.out.println("EmailPassword ");
//        String password = s.next();
//
//        if (userEmail.equalsIgnoreCase("MD:Hasan")) {
//
//            if (password.equals("facebook234")) {
//                System.out.print("Wellcome to FaceBook");
//            } else {
//                System.out.println("");
//            }
//        } else {
//            System.out.println("Wrong credentials\n"
//                    + "Invalid username or password");
//        }
// System.out.println("Email Username ");
//        String userEmail = s.next();
//        System.out.println("EmailPassword ");
//        String password = s.next();
//
//        if (userEmail.equalsIgnoreCase("MD:Hasan")) {
//
//            if (password.equals("facebook234")) {
//                System.out.print("Wellcome to FaceBook");
//            } else {
//                System.out.println("");
//            }
//        } else {
//            System.out.println("Wrong credentials\n"
//                    + "Invalid username or password");
//        }
// System.out.println("Enter Your Name ");
//   String userEmail = s.nextLine();
//  System.out.println("Wellcome Hasan");
// 
//        System.out.println("Enter Your Name ");
//        String userEmail = s.nextLine();
//
//        if(userEmail ){
//            
//        }
    }

}
