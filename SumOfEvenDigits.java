/* input: 56895
output:100
*/




import java.util.Scanner;
public class Main3 {
public static void main(String[] args) {
  Scanner input= new Scanner(System.in);
  int number = input.nextInt();
  int n1=0,n2=0;
    while(number!=0)
    {
    n1=number%10;
    if((n1%2)==0)
    n2+=n1*n1;
    number/=10;
    }
   System.out.println(n2);
}
}
