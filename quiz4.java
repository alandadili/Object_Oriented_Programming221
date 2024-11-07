import java.util.Scanner;
import java.util.Stack; //added stack import after finding it
class quiz4 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter string");
        Scanner sc=new Scanner(System.in);

        if(sc.hasNext())    //changed the while loop to if loop because of an infinite loop
        {
            String input=sc.next();
            System.out.println(isBalanced(input));
        }
        sc.close();
    }
    public static boolean isBalanced(String input) 
    {
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<input.length();i++) //checks for each character in the string
        {
            char current=input.charAt(i);
            if (current== '(' || current== '{' || current== '[') //checks if it is an opening charcter
            {
                stack.push(current);    //pushes the character to the top of the stack
            } 
            else if (current== ')' || current== '}' || current== ']') //checks if it is a closing character
            {
                if (stack.isEmpty()) 
                {
                    return false;   //is empty is immediately true so make it false
                }
                char top=stack.pop();
                if (current== ')' && top!= '('||current== '}' && top != '{' ||current== ']' && top!= '[') //checks previous to see if it closes
                {
                    return false;
                }
            }
                else
                {
                    return false;   //if it is not an opening or closing character then it is false
                }
        }
        return stack.isEmpty(); 
    }
}
