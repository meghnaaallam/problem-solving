/** Given	an	number	n.	Find	the	number	of	occurrences	of	n	in	the	array.	 
 */
import java.util.Scanner;



class Occurences {
	public static void main(String args[])
	{
		int n,temp,count=0;
		System.out.println("enter the size of the array");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("enter pattern value");
		int pattern=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
            arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
				if(arr[i]==pattern)
				{
				count++;
			}
		}
		System.out.println(count);
}
}
    	
    	
