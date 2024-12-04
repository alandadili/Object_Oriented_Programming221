import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

public class Recursion_Client 
{

    public static void main(String[] args) 
    {
        while (true) 
        {
            String[] options = {"Harmonic Number", "Isabel's Technique", "Find Files", "Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Choose an algorithm to test", "Recursion Client",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) //Replaces numerous if statements
            {
                case 0:
                    testHarmonic();
                    break;
                case 1:
                    testIsabel();
                    break;
                case 2:
                    testFind();
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }

    private static void testHarmonic() //Tests the harmonic method
    {
        String input = JOptionPane.showInputDialog("Enter the value of n:");
        int n = Integer.parseInt(input);
        double result = Recursion.harmonic(n);
        JOptionPane.showMessageDialog(null, "The " + n + "th Harmonic number is: " + result);
    }

    private static void testIsabel() //Tests the isabelSum method
    {
        while (true) 
        {
            String path = JOptionPane.showInputDialog("Enter the path to the data file:");
            try 
            {
                int[] array = Recursion.loadArrayFromFile(path);
                if ((array.length & (array.length - 1)) != 0) 
                {
                    throw new IllegalArgumentException("The number of integers is not a power of 2.");
                }
                int result = Recursion.isabelSum(array);
                JOptionPane.showMessageDialog(null, "The sum of the array using Isabel's technique is: " + result);
                break;
            } 
            catch (FileNotFoundException e) 
            {
                JOptionPane.showMessageDialog(null, "File not found. Please enter a correct filename.");
            } 
            catch (IllegalArgumentException e) 
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

    private static void testFind() //Tests the find method
    {
        String path = JOptionPane.showInputDialog("Enter the path to find files:");
        Recursion.find(path);
    }
}