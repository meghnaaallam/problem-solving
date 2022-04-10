/* Input:
s = "1: Prakhar Agrawal, 2: Manish Kumar Rai, 
     3: Rishabh Gupta56"
Output: 1 2 3 56
Explanation: 
1, 2, 3, 56 are the integers present in s.

problem link: extract-the-integers4428/1/?page=1&difficulty[]=-2&status[]=unsolved&category[]=Strings&sortBy=submissions#   */

// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String s = read.readLine();
            Solution ob = new Solution();
            ArrayList<String> ans = ob.extractIntegerWords(s);
            if(ans.size()==0)
                System.out.println("No Integers");
            else{
                for(int i=0;i<ans.size();i++)
                    System.out.print(ans.get(i)+" ");
                System.out.println();
            }
        }
    } 
} // } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    ArrayList<String> extractIntegerWords(String s) 
    { 
        // code here
        ArrayList<String> extractIntegers = new ArrayList<String>();
        String str="";
        for(int i=0;i<s.length()-1;i++) {
            if(s.charAt(i)>='0' && s.charAt(i)<='9') {
                str=str+s.charAt(i);
                if(s.charAt(i+1)>='0' && s.charAt(i+1)<='9')
                continue;
                else
                str=str+" ";
            }
        }
        if(s.charAt(s.length()-1)>='0' && s.charAt(s.length()-1)<='9')
        str+=s.charAt(s.length()-1);
         if(str==""){
            extractIntegers.add("No Integers");
        }
        else{
             extractIntegers.add(str);
        }
        return extractIntegers;
    }
} 
