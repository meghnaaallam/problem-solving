/* input: javaaaa
output: jav
*/

import java.util.*;
  class Main {
     public static void main (String[] args) {
          /* code */
          
          Scanner sc=new Scanner(System.in);
          String str=sc.nextLine();
          removeDuplicates(str);
     }
     static void removeDuplicates(String str) {
         Set<Character> s=new HashSet<>();
         StringBuilder sb=new StringBuilder();
         for(int i=0;i<str.length();i++) {
             char c=str.charAt(i);
             if(!s.contains(c)) {
                 s.add(c);
                 sb.append(c);
             }
         }
         System.out.println(sb.toString());
     } 
     
  }
  
  
  
  
  
  /*using linkedhashset in order to preserve the order */

import java.util.*;
  class Main1 {
     public static void main (String[] args) {
          /* code */
          
          Scanner sc=new Scanner(System.in);
          String str=sc.nextLine();
          removeDuplicates(str);
     }
     static void removeDuplicates(String str) {
         char[] ch=str.toCharArray();
         Set<Character> s=new LinkedHashSet<>();
         StringBuilder sb=new StringBuilder();
         for(int i=0;i<ch.length;i++) {
             if(!s.contains(ch[i])) {
                 s.add(ch[i]);
                 sb.append(ch[i]);
             }
         }
         System.out.println(sb.toString());
     } 
     
  }
