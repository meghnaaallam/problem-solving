*****METHOD 1*********
import java.util.*;
class Main {
  public static void main(String[] args) {
 int i;
 Scanner sc=new Scanner(System.in);
 String str="meghna";
 char[] ch=str.toCharArray();
 for(i=ch.length-1;i>=0;i--)
 {
   System.out.print(ch[i]);
 }
  }
}

*******METHOD 2******
import java.util.*;
class Main {
  public static void main(String[] args) {
 int i;
 Scanner sc=new Scanner(System.in);
 String str="meghna";
 char[] ch=str.toCharArray();
 String str2="";
 for(i=ch.length-1;i>=0;i--)
 {
   str2=str2+ str.charAt(i);
 }
 System.out.println(str2);
  }
}

******METHOD 3******
import java.util.*;
class Main {
  public static void main(String[] args) {
 int i;
 Scanner sc=new Scanner(System.in);
 String str="meghna";
 StringBuffer sb=new StringBuffer(str);
 System.out.println(sb.reverse());
 }
 }
