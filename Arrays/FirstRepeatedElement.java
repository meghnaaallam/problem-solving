*/input: 1 22 1 34 55
output: 1
*/

//method 1//

import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("enter the sixe of the array");
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int arr[]=new int[size];
    for(int i=0;i<arr.length;i++) {
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++) {
      for(int j=0;j<arr.length;j++) {
        if(arr[i]==arr[j] && i!=j) {
          System.out.println("first repeated element is:"+ arr[j]);
        }
        break;
      }
    }
  }
}
