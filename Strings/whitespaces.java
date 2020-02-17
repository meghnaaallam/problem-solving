import java.util.*;
class Main {
  public static void main(String[] args)
  {
  int i,j;
   {
  Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();
  char ch[]=str.toCharArray();
  String str1="";
  for(i=0;i<ch.length;i++)
  {
     if(ch[i]!=' ')
     {
       str1=str1+str.charAt(i);
     }
  }
  System.out.println(str1);
   }
  }
}


******METHOD 2*****
class Main {
  public static void main(String[] args)
  {
  int i,j;
   {
  Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();
  char ch[]=str.toCharArray();
  String str1="";
  for(i=0;i<ch.length;i++)
  {
     if(ch[i]!=' ')
     {
       str1=str1+ch[i];
     }
  }
  System.out.println(str1);
   }
  }
}


*********METHOD 3*******
class Main {
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();
  str.replace(regex:" ",replacement:"");
  System.out.println(str);
  }
  }
