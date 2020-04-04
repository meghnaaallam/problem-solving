/*Given an array of integers, In this array every element appears twice except for one. Find that single one.

The array may or may not be sorted.

In this tutorial, I have explained how to find single number using HashMap and XOR operator.

Example 1:
 
 Input: [1, 5, 5, 3, 1]
 Output: 3 
 
 Every element appears twice except 3.
 
Example 2:
 
 Input: [7, 1, 3, 1, 3]
 Output: 7
 
 Every element appears twice except 7.

*/

import java.util.Set;
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++) {
      arr[i]=sc.nextInt();
    }
  System.out.print(isHappy(arr,n));
  }
  static int isHappy(int arr[], int n) {
    Map<Integer,Integer> hm=new HashMap<>();
    for(int i:arr) {
      hm.put(i, hm.getOrDefault(i,0)+1);
    }
    for(Map.Entry<Integer,Integer> entry: hm.entrySet()) {
      if(entry.getValue()==1) {
      return entry.getKey();
    }
    }
    return 0;
  }
}
