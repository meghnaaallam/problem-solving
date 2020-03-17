// Java program to calculate sum of all numbers present 
// in a string containing alphanumeric characters 
class GFG 
{ 
	
	// Function to calculate sum of all numbers present 
	// in a string containing alphanumeric characters 
	static int findSum(String str) 
	{ 
	
		String temp = ""; 
	
		 
		int sum = 0; 
	
		for(int i = 0; i < str.length(); i++) 
		{ 
			char ch = str.charAt(i); 
			
			// if current character is a digit 
			if (Character.isDigit(ch)) 
				temp += ch; 
	
			else
			{ 
				
				sum += Integer.parseInt(temp); 
	
				// reset temporary string to empty 
				temp = "0"; 
			} 
		} 
	
	
		return sum + Integer.parseInt(temp); 
	} 
	
	public static void main (String[] args) 
	{ 
		
		
		String str = "12abc20yz68"; 
	
		System.out.println(findSum(str)); 
	} 
} 



