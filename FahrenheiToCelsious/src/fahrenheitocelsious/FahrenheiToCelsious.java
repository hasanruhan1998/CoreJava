
package fahrenheitocelsious;

import java.awt.BorderLayout;
import java.util.Scanner;



public class FahrenheiToCelsious {

    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Ple enter temperature in Fahrenhet:");;
        
        float fertemp=input.nextFloat();
        float result=((fertemp-32)/9)*5;
        System.out.println("Temperture in elsious: "+result);
        
        
        
        
        
    }
    
}
