*/ input: 6
-1 -3 3 56 91
94
*/




import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  System.out.println("enter size of your array:");
  Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
  int arr[]=new int[size];
  for(int i=0;i<arr.length;i++) {
    arr[i]=sc.nextInt();
  }
  int minimum=getMinimumValue(arr);
  int maximum=getMaximum(arr);
  System.out.println(maximum-minimum);
  }
  public static int getMinimumValue(int arr[]) {
    int min=arr[0];
    for(int i=1;i<arr.length;i++) {
      if(arr[i]<min) {
        min=arr[i];
      }
    }
    return min;
  }
  public static int getMaximum(int arr[]) {
    int max=arr[0];
    for(int i=1;i<arr.length;i++) {
      if(arr[i]>max) {
        max=arr[i];
      }
    }
    return max;
  }
}
