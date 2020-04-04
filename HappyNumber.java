/* What is happy number?
Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. 
 
Those numbers for which this process ends in 1 are happy numbers.
 
 Example 1:
 
  Input : 19
  output : true
  
  1^2 + 9^2 = 82
  
  8^2 + 2^2 = 68

  6^2 + 8^2 = 100

  1^2 + 0^2 + 0^2 = 1 


Input  :  20
  Output :  false
  
  2^2 + 0^2 = 4
  
  4^2       = 16
  
  1^2 + 6^2 = 37
  
  3^2 + 7^2 = 58
  
  5^2 + 8^2 = 145
  
  1^2 + 4^2 + 5^2 = 42
  
  4^2 + 2^2 = 20 (Loop occurs)

*/
import java.util.Set;
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
  System.out.print(isHappy(n));
  }
  static boolean isHappy(int n) {
    Set<Integer> hm=new HashSet<>();
    while(n!=1) {
      int sum=0;
      int current=n;
      while(current>0) {
        int res=current%10;
        sum=sum+(res*res);
        current=current/10;
      }
      if(hm.contains(sum))
      return false;
      n=sum;
      hm.add(n);
    }
    return true;
  }
}
