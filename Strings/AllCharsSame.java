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

