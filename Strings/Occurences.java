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
