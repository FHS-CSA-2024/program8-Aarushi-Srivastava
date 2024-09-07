//import stuff here
import java.util.Scanner;
//Your code here
public class Program8{
    public static void main (String[]args){
        Scanner numScanner=new Scanner(System.in);
        double numb1=0;
        double numb2=0;
        double sum= (int)numb1+numb2;
        double diff=(int)numb1-numb2;
    
        
    
        System.out.println("Enter number 1: ");
        numb1= numScanner.nextInt();
        
        System.out.println("Enter number 2: ");
        numb2=numScanner.nextInt();
        
        double product=(int)numb1*numb2;
        double average=(double)((numb1+numb2)/2);
        double absolute= (int)Math.abs(diff);
        double max=(int) Math.max(numb1,numb2);
        double min=(int) Math.min(numb1,numb2);
        System.out.println("The original numbers are "+(int)numb1+" and "+(int)numb2);
        System.out.println("Sum="+(int)(numb1+numb2));
        System.out.println("Difference="+(int)(numb1-numb2));
        System.out.println("Product="+(int)product);
        System.out.println("Average="+average);
        System.out.println("Absolute value="+(int)absolute);
        System.out.println("Maximum="+(int)max);
        System.out.println("Minimum="+(int)min);
        
    
    }
}
//Paste console output below:
/*
Enter number 1: 
13
Enter number 2: 
20
The original numbers are 13 and 20
Sum=33
Difference=-7
Product=260
Average=16.5
Absolute value=0
Maximum=20
Minimum=13

*/
