*/Input : 01231
Output : 
((((0 + 1) + 2) * 3) + 1) = 10
In above manner, we get the maximum value i.e. 10

Input : 891
Output :73
As 8*9*1 = 72 and 8*9+1 = 73.So, 73 is maximum.
*/


import java.util.*;
class Main {
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  String x=sc.next();
         System.out.println(maxSum(x));
      }
static int maxSum(String str) {
  int result=str.charAt(0)-'0';
  for(int i=1;i<str.length();i++) {
    if(str.charAt(i)=='0' || str.charAt(i)=='1') 
result=result+(str.charAt(i)-'0');
else
result=result*(str.charAt(i)-'0');
    }
    return result;
  }
}
      
