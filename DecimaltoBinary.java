import java.util.*;

/**
 * @author LENOVO YOGA
 *
 */
public class DecimaltoBinary {

	/**
	 * @param args
	 */
	public static long dtobinary(int n)
	{
		int p=0;
		int rem;
		long sum=0;
		while(n!=0)
		{
			rem=n%2;
			sum+=rem*Math.pow(10,p);
			p++;
			n=n/2;
			
		}
		return sum;
	}
	public static void main(String[] args)
	{
		int n;
	System.out.println("enter a number");	
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
		System.out.println("Binary equivalent :"+ dtobinary(n));
	}
	
	
	}
