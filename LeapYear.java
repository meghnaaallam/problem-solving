/* input: 2019
not a leap year
*/



import java.util.*;
class Main {
  public static void main(String[] args) {
  System.out.print("enter an year of your choice:");
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  if((n%400==0) || (n%4==0))
  {
  System.out.print("leap year");
  }
  else
  System.out.print("not a leap year");
  }
}

