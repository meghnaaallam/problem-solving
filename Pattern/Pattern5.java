import java.util.*;

/**
 * @author MEGHNA
 *
 */
import java.util.Scanner;

/**
 * input = 5
 * 
 *   * * * * * * * * *
 *     * * * * * * *
 *       * * * * *
 *         * * *
 *           *
 */

public class Pattern5 {
	public static void main(String[] args)
	{
    int i,j;
    System.out.println("enter an input number");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int p=2*n-1;
    for(i=1;i<=n;i++)
    {
    	for(j=1;j<i;j++)
    	{
    		System.out.print(" ");
    	}
    	for(j=1;j<=p;j++)
    	{
    		System.out.print("* ");
    	}
    	p=p-2;
    System.out.println();
	}
}
}
    
