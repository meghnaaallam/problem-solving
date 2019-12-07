java.util.Scanner;

public class UppertoL
{
    public static void main(String[] input)
    {
        String strUpper, strLower;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter one word/name in Uppercase : ");
        strUpper = scan.nextLine();
        
        strLower = strUpper.toLowerCase();
        System.out.print("Equivalent Word/Name in Lowercase : " + strLower);
    }
}
