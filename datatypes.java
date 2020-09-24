import java.util.Scanner;
public class datatypes {

	public static void main(String[] args) 
	{
		  /* Declare second integer, double, and String variables. */
        int i;
        double d;
        String s;

        /* Read and save an integer, double, and String to your variables.*/
        Scanner scanner= new Scanner(System.in);
        
        i=scanner.nextInt();
        d=scanner.nextDouble();
        s=scanner.next();
        
        System.out.println(i);
        System.out.println(d);
        System.out.println(s);
        
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 

       the 's' variable above should be printed first. */
     
	
        scanner.close();
	}

	
	
}
