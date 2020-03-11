/* input: {}[]()
output: balanced
*/



import java.util.*;
class Main {
  public static void main(String[] args) {
     System.out.println("enter paranthesis pattern of your choice:");
  Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();
  Stack<Character> stack=new Stack<>();
  for(int i=0;i<str.length();i++)
  {
    if(str.charAt(i)=='{' || str.charAt(i)=='(' || str.charAt(i)=='[')
    stack.push(str.charAt(i));
    else if(!str.isEmpty()&&str.charAt(i)=='}' && stack.peek()=='{'|| str.charAt(i)==']' && stack.peek()=='[' || str.charAt(i)==')' && stack.peek()=='(')
stack.pop();
else {
stack.push(str.charAt(i));
}
}
if(stack.isEmpty())
System.out.print("balanced");
else
System.out.print("not balanced");
  }
}
