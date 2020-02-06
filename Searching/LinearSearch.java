package search;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,element,temp=0;
		System.out.println("Enter size and array elements");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element to be found");
		element=sc.nextInt();
	for(i=0;i<arr.length;i++)
	{
		if(arr[i]==element)
		{
			System.out.println("element found at"+i);
		temp=temp+1;
	}
	}
		if(temp==0)
			System.out.println("not found");

	}

}
