import java.util.*;

import javax.lang.model.util.ElementScanner6;
class Main {
  public static void main(String[] args) {
    int i,j;
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char ch[]=str.toCharArray();
String str2="";
for(i=ch.length-1;i>=0;i--)
{
str2=str2+ str.charAt(i);
}
System.out.println(str2);
if(str2==str)
System.out.println("palindrome");
else
System.out.println("not an palindrome");
  }
}
