*/input: 3
5
12345
element is found the array at the index position 2
*/


import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("enter the size of the array");
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    System.out.println("enter the number you want to find in the array:");
    int n=sc.nextInt();
    int marks[]=new int[size];
    System.out.println("enter the elements into the array");
    for(int i=0;i<size;i++) {
      marks[i]=sc.nextInt();
    }
    for(int i=0;i<size;i++) {
      if(marks[i]==n) {
      System.out.print("element is found in the array at the index position"+i);
      break;
    }
    }
  }
}
