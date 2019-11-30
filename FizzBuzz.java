/**
 * 
 */
import java.util.*;


/**
 * @author MEGHNA
 *
 */

public class FizzBuzz {
	public static void main(String[] args)
	{
    System.out.println("enter any number");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
    	if(i%3==0 && i%5==0)
    		System.out.println("Fizz Buzz");
    	else if(i%3==0)
    		System.out.println("Fizz");
    	else if(i%5==0)
    		System.out.println("Buzz");
    	else
    		System.out.println(i);
    }
	}
}
