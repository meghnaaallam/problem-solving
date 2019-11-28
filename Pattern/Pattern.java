/*    * * * * *
       * * * *
        * * *
         * *
          *
 * 
 */
import java.util.*;

/**
 * @author MEGHNA
 *
 */

public class Pattern {
	public static void main(String[] args)
	{
    int i,j;
    System.out.println("enter an input number");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(i=n;i>=1;i--)
    {
    	for(j=n;j>i;j--)
    	{
    		System.out.print(" ");
    	}
    	for(j=1;j<=i;j++)
    	{
    		System.out.print("* ");
    	}
    System.out.println();
	}
	}
}
