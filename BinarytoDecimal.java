import java.util.*;

/**
 * @author LENOVO YOGA
 *
 */
public class BinarytoDecimal {

	/**
	 * @param args
	 */
	public static int binarytod(long n)
	{
		int p=0;
		int rem;
		int sum=0;
		while(n!=0)
		{
			rem=(int)n%10;
			sum+=rem*Math.pow(2,p);
			p++;
			n=n/10;
			
		}
		return sum;
	}
	public static void main(String[] args)
	{
		long n;
	System.out.println("enter a number");	
	Scanner sc=new Scanner(System.in);
	n=sc.nextLong();
		System.out.println("decimal  equivalent :"+ binarytod(n));
	}
	
	
	}
