/*
input: cat
act
output:anagram

all the charas should be present,then anagram
*/
/*Method 1*/

import java.util.*;
class Main {
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String str1=sc.nextLine();
   String str2=sc.nextLine();
   if(sortAnagram(str1,str2))
   System.out.print("is anagram");
   else
   System.out.print("not anagram");
  }
  public static boolean sortAnagram(String str1,String str2)
  {
    char[ ] ch1=str1.toCharArray();
    char[ ] ch2=str2.toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    return Arrays.equals(ch1,ch2);
  }
}
/* method 2*/


import java.util.*;
class Main {
  public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String str1=sc.nextLine();
   String str2=sc.nextLine();
   boolean isAnagram=true;
   int al[]=new int[256];
   int bl[]=new int[256];
  for(char c: str1.toCharArray()) 
 {
     int index=(int)c;
     al[index]++;
 }
for(char c: str2.toCharArray()) 
 {
     int index=(int)c;
     bl[index]++;
 }
 for(int i=0;i<256;i++)
 {
   if(al[i]!=bl[i])
   {
     isAnagram=true;
     break;
   }
 }
 if(isAnagram)
 System.out.print("anagram");
else
System.out.print("not anagram");
 }
  }
  
