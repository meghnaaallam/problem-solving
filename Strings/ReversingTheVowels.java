/* Input:
S = "geeksforgeeks"
Output: geeksforgeeks
Explanation: The vowels are: e, e, o, e, e
Reverse of these is also e, e, o, e, e.
*/
//problem link: https://practice.geeksforgeeks.org/problems/remove-vowels-from-string1446/1/?page=1&difficulty[]=-2&status[]=unsolved&category[]=Strings&sortBy=submissions




//method -1
class Solution
{
   String modify (String s)
   {
       // your code here
       char[] str=s.toCharArray();
       Stack<Character> st=new Stack<Character>();
       for(int i=0;i<str.length;i++){
           if(str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u'){
               st.push(str[i]);
               str[i]='1';
           }
       }
       for(int i=0;i<str.length;i++){
           if(str[i]=='1'){
               str[i]=st.peek();
               st.pop();
           }
       }
       return String.valueOf(str);  
       
       
   }
}

//method-2
class Solution
{
   String modify (String s)
   {
       int[] index = new int[s.length()]; 
       char[] afterChange = new char[s.length()]; 
       int count = 0;
       char[] ch = s.toCharArray();
      for(int i = 0 ; i < ch.length ; i++)
      {
          if(ch[i] == ('a') || ch[i] == ('i') || ch[i] == ('o') || ch[i] == ('u') || ch[i] == ('e'))
          {
               index[count] = i;
               afterChange[count] = ch[i]; 
               count++;
          }
      }
     
      StringBuilder  sb = new StringBuilder(String.valueOf(afterChange).substring(0,count));
      
       char[] sr =sb.reverse().toString().toCharArray();
      for(int i = 0; i < sr.length;i++)
      {
          
         
          ch[index[i]] = sr[i];
      }
      return String.valueOf(ch);
      
   }
}


//method -3
static boolean isVowel(char c){
       if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
       c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
       return true;
       }
       return false;
   }   
   String modify (String s)
   {
       int start=0;
       int end=s.length()-1;
       char[] arr = s.toCharArray();
       while(start<end){
           if(!isVowel(arr[start])){
               start++;
               continue;
           }
           if(!isVowel(arr[end])){
               end--;
               continue;
           }
           char ch = arr[start];
           arr[start] = arr[end];
           arr[end] = ch;
           start++;
           end--;
       }
       return String.valueOf(arr);
   }
