
import java.util.Scanner;


/**
 * @author MEGHNA
 *
 */

public class Reverse {
	public static void main(String[] args)
	{
		System.out.println("enter the size of the array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	for(int i=n-1;i<arr.length;i--)
	{
		System.out.println(arr[i]);
	}
	}
}
  
