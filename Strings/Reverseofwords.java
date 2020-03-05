/*
input: hello hi 
output: hi hello
*/



import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	first(str);
	}
	static void first(String str)
	{
	    char ch[]=str.toCharArray();
	     System.out.print(Character.toUpperCase(ch[0]));
	    for(int i=1;i<ch.length-1;i++)
	    {
	        if(ch[i]==' ')
	        {
	            System.out.print(""+Character.toUpperCase(ch[i+1]));
	        }
	    }
	}
}
