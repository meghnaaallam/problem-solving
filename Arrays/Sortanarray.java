package search;

import java.util.Scanner;
import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("enter array elements");
		int arr[]=new int[n];
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
System.out.printf("modified array is :%s",Arrays.toString(arr));
	}

}
