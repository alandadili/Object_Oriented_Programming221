import java.util.Scanner;
import java.util.Stack;
class quiz4 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter string");
        Scanner sc=new Scanner(System.in);

        if(sc.hasNext())
        {
            String input=sc.next();
            System.out.println(isBalanced(input));
        }
        sc.close();
    }
    public static boolean isBalanced(String input) 
    {
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<input.length();i++) 
        {
            char current=input.charAt(i);
            if (current== '(' || current== '{' || current== '[') 
            {
                stack.push(current);            //checks if it is an opening charcter
            } 
            else if (current== ')' || current== '}' || current== ']') 
            {
                if (stack.isEmpty()) 
                {
                    return false;
                }
                char top=stack.pop();
                if (current == ')' && top != '('||current == '}' && top != '{' ||current == ']' && top != '[') 
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
