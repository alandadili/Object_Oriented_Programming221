import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Recursion
{
    public static double harmonic(int n) //Returns the nth harmonic number
    {
        if (n == 1) 
        {
            return 1.0;
        }
        return 1.0 / n + harmonic(n - 1);
    }
    public static int isabelSum(int[] array) //Returns the sum of the array using Isabel's technique
    {
        if (array.length == 1) 
        {
            return array[0];
        }
        int[] newArray = new int[array.length / 2];
        for (int i = 0; i < newArray.length; i++) 
        {
            newArray[i] = array[2 * i] + array[2 * i + 1];
        }
        return isabelSum(newArray);
    }
    public static int[] loadArrayFromFile(String path) throws FileNotFoundException //Uses a file I created called "Isabel_Technique.txt" and creates an array of integers
    {
        Scanner scanner = new Scanner(new File(path));  
        ArrayList<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) 
        {
            if (scanner.hasNextInt()) 
            {
                list.add(scanner.nextInt());
            } 
            else 
            {
                scanner.next();
            }
        }
        scanner.close();
        int[] array = new int[list.size()]; //Creates array of integers
        for (int i = 0; i < list.size(); i++) 
        {
            array[i] = list.get(i);
        }
        return array;
    }
    public static void find(String path) //Finds all files and directories in a given path
    {
        File root = new File(path);
        if (root.exists() && root.isDirectory()) 
        {
            findHelper(root);
        } 
        else 
        {
            System.out.println("Invalid path");
        }
    }
    private static void findHelper(File file)  //Helper method for find
    {
        if (file.isDirectory()) 
        {
            System.out.println("Directory: " + file.getAbsolutePath());
            for (File f : file.listFiles()) 
            {
                findHelper(f);
            }
        } 
        else 
        {
            System.out.println("File: " + file.getAbsolutePath());
        }
    }
}