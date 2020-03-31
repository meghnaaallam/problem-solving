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
  firstRepeatingElement(arr);
}
static void firstRepeatingElement(int arr[]) {
  int min=0;
  Set<Integer> hs=new HashSet<Integer>();
  for(int i=0;i<arr.length;i++) {
    if(hs.contains(arr[i]))
    min=i;
    else
    hs.add(arr[i]);
  }
  if(min!=0) 
  System.out.print("the first repeating element:" +arr[min]);
  else
  System.out.print("no repeating elements");
}
}
