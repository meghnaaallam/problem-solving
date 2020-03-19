/* input: hello
output: l is repeating 2 times
*/



import java.util.*;
class Main {
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  String str=sc.next();
  HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
  for(Character ch:str.toCharArray())
  {
    if(hm.containsKey(ch))
    hm.put(ch, hm.get(ch)+1);
    else
    hm.put(ch,1);
  }
  Set<Character> keys=hm.keySet();
  for(Character ch:keys)
  {
    if(hm.get(ch)>1)
       System.out.println("character " +ch+" is repeating "+hm.get(ch)+" times");
  }
}
}

*****************
/*for words
input: cat batman latt matter cat matter cat
output: cat matter*/

import java.util.*;
  class Main {
     public static void main (String[] args) {
          /* code */
          
          Scanner sc=new Scanner(System.in);
          String str=sc.nextLine();
          expandIt(str);
     }
     static void expandIt(String str) {
         int count=0;
         String[] ch=str.split(" ");
         HashMap<String,Integer> hm=new HashMap<>();
         for(int i=0;i<ch.length;i++)
         {
             String current=ch[i];
             if(hm.containsKey(current))
             {
                 count=count+1;
                 hm.put(current,count);
             }
             else {
                 hm.put(current,1);
                 count=1;
             }
         }
           Set<String> keys=hm.keySet();
  for(String cha:keys)
  {
    if(hm.get(cha)>1)
       System.out.print(cha+" ");
     }
  }
  }


