// Java program to find whether the String 
// has all same characters or not. 
import java.io.*; 

public class Stringornot{ 

static boolean allCharactersSame(String s) 
{ 
	int n = s.length(); 
	for (int i = 1; i < n; i++) 
		if (s.charAt(i) != s.charAt(0)) 
			return false; 
		
	return true; 
} 

// Driver code 
	static public void main (String[] args){ 
		String s = "aaa"; 
	if (allCharactersSame(s)) 
		System.out.println("Yes"); 
	else
		System.out.println("No"); 
		
	} 
} 

/*method 2*/
import java.util.HashMap;
import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    int count=0;
    HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
for(int i=0;i<str.length();i++)
{
  char current=str.charAt(i);
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
for(int i=0;i<str.length();i++)
{
  char x=str.charAt(i);
  if(hm.get(x)==1) {
  System.out.println("first repeated character: "+x);
  break;
}
}
}
}
