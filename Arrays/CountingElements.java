*/Given an integer array, count element x such that x + 1 is also in array.If there're duplicates in array, count them separately.

 Example 1:

     Input: {1, 2, 3}
     Output: 2

        Explanation:
        
        First element is 1 + 1 = 2 ( 2 is present in an array)
        Second element is 2 + 1 = 3 ( 3 is present in an array)
        Third element is 3 + 1 = 4 ( 4 is not present in an array)
        
   Example 2:

  Input : {1, 3, 2, 3, 5, 0}
  Output: 3
 
  Explanation:
   1 + 1 = 2 (Exist)
   3 + 1 = 4 (Not exist)
   2 + 1 = 3 (Exist)
   3 + 1 = 4 (Not exist)
   5 + 1 = 6 (Not exist)
   0 + 1 = 1 (Exist)
*/


import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++) {
      arr[i]=sc.nextInt();
    }
    countingElements(arr);
  }
  static void countingElements(int arr[])
  {
    int count=0;
    Set<Integer> hs=new HashSet<>();
    for(int i:arr){
      hs.add(i);
    }
    for(int i=0;i<arr.length;i++) {
      if(hs.contains(arr[i]+1)){
        count++;
      }
    }
    System.out.print(count);
  }
}
