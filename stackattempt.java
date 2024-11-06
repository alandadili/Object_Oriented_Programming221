import java.util.Scanner;
class stackattempt 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter string");
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
            String input=sc.next();
            System.out.println(isBalanced(input));
        }
        sc.close();
    }
    public static boolean isBalanced(String input)
    {
        int count1=0;
        int count2=0;
        int count3=0;
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)=='(')
            {
                count1++;
            }
            else if(input.charAt(i)=='{')
            {
                count2++;
            }
            else if(input.charAt(i)=='[')
            {
                count3++;
            }
            else if(input.charAt(i)==')')
            {
                count1--;
            }
            else if(input.charAt(i)=='}')
            {
                count2--;
            }
            else if(input.charAt(i)==']')
            {
                count3--;
            }
            if(count1<0 ||count2<0|| count3<0)
            {
                return false;
            }
        }
        if(count1==0 && count2==0 && count3==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}