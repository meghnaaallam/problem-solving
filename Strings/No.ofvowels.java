import java.util.Scanner;
import java.util.*;
class Main {
  public static void main(String[] args) {
    int i,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter your string");
    String str=sc.nextLine();
    str.toLowerCase();
    for(i=0;i<str.length();i++)
    {
    if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
    {
      count++;
    }
    }
    System.out.println(count);
  }
}
