*/ input: -1 1 12 45 44 
output: 1
*/


//method 1//
//this method is not applicable for repeated or duplicate elements.
time complexity- O(nlogn)//

import java.util.*;
class Main {
public static void main(String[] args) {
  System.out.print("enter the size of the array:");
  Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
  int arr[]=new int[size];
  for(int i=0;i<arr.length;i++) {
    arr[i]=sc.nextInt();
  }
  System.out.print(secondSmallestElement(arr));
}
static int secondSmallestElement(int arr[]) {
  Arrays.sort(arr);
  System.out.print("the second smallest element is "+ arr[n-2]);
  }
  }




//method 2//
import java.util.*;
class Main {
  public static void main(String[] args) {
  System.out.print("enter the size of the array:");
  Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
  int arr[]=new int[size];
  for(int i=0;i<arr.length;i++) {
    arr[i]=sc.nextInt();
  }
  System.out.print(secondSmallestElement(arr));
}
static int secondSmallestElement(int arr[]) {
  int smallest=Integer.MAX_VALUE;
  int secondSmallest=Integer.MAX_VALUE;
  for(int i=0;i<arr.length;i++) 
  {
    if(arr[i]<smallest) {
      smallest=arr[i];
    }
    if(arr[i]>smallest && arr[i]<secondSmallest) {
      secondLargest=arr[i];
    }
  }
  return secondSmallest;
}
}
