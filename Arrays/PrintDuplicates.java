/* input : 21 11 11 21 3
21 11
*/


//method 1 -O(n)
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++) {
      arr[i]=sc.nextInt();
    }
    isDuplicate(arr);
  }
  static void isDuplicate(int arr[]) {
    Set<Integer> hm=new HashSet<>();
    for(int i=0;i<arr.length;i++) {
      if(hm.contains(arr[i])) {
        System.out.println("the following are the duplicate elements:  "+arr[i]);
      }
      else {
        hm.add(arr[i]);
      }
    }
  }
}
    
//method 2 --O(n)
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++) {
      arr[i]=sc.nextInt();
    }
    isDuplicate(arr);
  }
  static void isDuplicate(int arr[]) {
    Map<Integer,Integer> hm=new HashMap<>();
    for(int i=0;i<arr.length;i++) {
      if(hm.containsKey(arr[i])) {
        System.out.println("the following are the duplicate elements:  "+arr[i]);
      }
      else {
        hm.put(arr[i],1);
      }
    }
  }
}
    

//method 2-- O(nlogn)

import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++) {
      arr[i]=sc.nextInt();
    }
    isDuplicate(arr);
  }
  static void isDuplicate(int arr[]) {
    Arrays.sort(arr);
    for(int i=0;i<arr.length-1;i++) {
      if(arr[i]==arr[i+1])
      System.out.println(arr[i]);
    }
  }
}
