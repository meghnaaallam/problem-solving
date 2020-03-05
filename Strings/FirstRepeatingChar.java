/*. input: hello
output: h
*/




import java.util.HashMap;
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    String[] ch=str.split("");
    int count=0;
    HashMap<String,Integer> hm=new HashMap<String,Integer>();
for(int i=0;i<ch.length;i++)
{
  String current=ch[i];
  if(hm.containsKey(current))
  {
  count=count+1;
  hm.put(current,count);
  }
  else
  {
  hm.put(current,1);
  count=1;
}
  }
for(int i=0;i<ch.length;i++)
{
  String x=ch[i];
  if(hm.get(x)==1) {
  System.out.println("first repeated character: "+x);
  break;
}
}
}
}
