import java.util.Scanner; 
public class exceptiohandlingex 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in); 
        try 
        {
            int result = 10 / 0;  // This will cause an ArithmeticException cant divide by 0
        } 

        catch (ArithmeticException e) 
            {
                System.out.println("Cannot divide by zero.");
            }

        // This line will still execute after the catch block
        System.out.println("Enter Something After The Error");
        int enter=scanner.nextInt();
        System.out.println(enter);
        scanner.close();
    }   //exceptions continue the code after an error
}
