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
