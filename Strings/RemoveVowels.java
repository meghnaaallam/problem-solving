*/
Input : what is your name ?
Output : wht s yr nm ?
*/




// Java program to remove vowels from a String 
import java.util.Arrays; 
import java.util.List; 

class A 
{	 
	static String remVowel(String str) 
	{ 
		return str.replaceAll("[aeiouAEIOU]", ""); 
	} 
	
	// Driver Code 
	public static void main(String[] args) 
	{ 
		String str = "i like roses";		 
		System.out.println(remVowel(str)); 
	} 
} 

