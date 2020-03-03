import java.util.*;
class Main {
  public static void main(String[] args)
  {
  int count=1,i,j;
   {
  Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();
  char ch[]=str.toCharArray();
  int l=str.length();
   for(i=0;i<l-1;i++)
   {
     for(j=i+1;j<l;j++)
     {
       if(ch[i]==ch[j])
       count++;
     }
   }
  System.out.print(ch[i]+"="+count);
  }
}
}


Method 2
  /*using hashmaps*/
  import java.util.Scanner;
import java.util.*;
class Main {
  public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String str=sc.next();
 HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
 for(Character c: str.toCharArray())
 {
   if(hm.containsKey(c))
   {
     hm.put(c,hm.get(c)+1);
   }
   else
   hm.put(c,1);
 }
 System.out.println(hm);
  }
}
