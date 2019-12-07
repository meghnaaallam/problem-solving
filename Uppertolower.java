
		
import java.util.Scanner;

public class Uppertolower
{
    public static void main(String[] input)
    {
        char ch;
        int temp;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a Character in Uppercase : ");
        ch = scan.next().charAt(0);
		
        temp = (int) ch;
        temp = temp + 32;
        ch = (char) temp;
		
        System.out.print("Equivalent Character in Lowercase = " + ch);
   
