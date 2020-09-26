import java.io.*;
import java.util.*;

public class Review 
{

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner scanner= new Scanner(System.in);
       
       
       System.out.print("Number of cases ");
       int T=scanner.nextInt();
       
       
       //number of cases
       int j=0;     
       while (j!=T)
       {
    	   String S= scanner.next();
    	   int i=0;
    	   char[] sWord=S.toCharArray();
           
           while (i<S.length())
           {
        	   
        	   System.out.print(sWord[i]);
        	   i++;
        	   
           } 
           
    	   j++;

    	 
       }
       
       
       
       
       
    	   
       
    
    }
}