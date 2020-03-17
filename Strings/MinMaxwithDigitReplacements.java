*/ Input  : x1 = 645 x2 = 666
Output : Minimum Sum: 1100 (545 + 555)
         Maximum Sum: 1312 (646 + 666)

*/



/*package whatever //do not write package name here */

import java.util.*;
  class Main
  {
     public static void main (String[] args) 
     {
          /* code */
          Scanner sc=new Scanner(System.in);
          int x1=sc.nextInt();
          int x2=sc.nextInt();
          minMaxSum(x1,x2);
      }
      static void minMaxSum(int x1,int x2) {
          int minSum=replaceDig(x1,6,5)+replaceDig(x2,6,5);
          int maxSum=replaceDig(x1,5,6)+replaceDig(x2,5,6);
          System.out.println("Minimum sum:" +minSum);
          System.out.println("Maximum sum:"+maxSum);
      }
      static int replaceDig(int x,int from,int to) {
          int result=0;
          int multiply=1;
          while(x%10>0) {
              int remainder=x%10;
              if(remainder==from) 
              result=result+to*multiply;
              else 
              result=result+remainder*multiply;
              multiply=multiply*10;
              x=x/10;
          
      }
       return result;
     }
  } 
