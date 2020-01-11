/*Sorting is nothing but arranging the data in a logical order. It might be in acsending or descending order. 
For alpanumeric values it can be arranged in dictionary order.
*********BUBBLE SORT*********
Comparision based algorithm i.e it compares the adjacent value of its element and swaps them if they are in wrong order.
*/

import java.util.Scanner;

class BubbleSort {
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
			int flag=0;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=1;
			}
		}
			if(flag==0)
				break;
	}
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]+"");
}
}
    	
      
      
    	
