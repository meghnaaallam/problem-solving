/*
Selection sort selects the smallest element and compares it to the pivot element(first element) 
and swaps accordingly.Gives us ascending order.
It makes two subarrays- one is sorted and the other is unsorted.
*/

import java.util.Scanner;


/**
 * @author LENOVO YOGA
 *
 */

class SelectionSort {
	public static void main(String args[])
	{
		int n,temp;
		System.out.println("enter the size of the array");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
            arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			int min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
				min=j;
			}
		}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
	}
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]+"");
}
}
    	
    	
