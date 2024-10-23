import java.util.Scanner;
public class HomeWork_2
{
    public static void main(String[] args) 
    {
        int N=10; //example array size
        int[]createArray=createArray(N); //calls method createArray
        System.out.print("Array: ");
        for(int i=0;i<createArray.length;i++) 
        {
            System.out.print(createArray[i]+" ");
        }
        System.out.println();

        int numberOfPrimes=calculateNumberOfPrimeNumbers(createArray, N);
        System.out.println("Number of prime numbers in the array: "+numberOfPrimes);
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter matrix size ");
        int M = scanner.nextInt();
        int[][] matrix=generateRandomMatrix(M);
        for(int i=0;i<matrix.length;i++) 
        {
            for(int j=0;j<matrix[i].length;j++) 
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        int[] diagonalValues = getDiagonalValues(matrix);
        System.out.print("Diagonal Values: ");
        for(int i=0;i<diagonalValues.length;i++) 
        {
            System.out.print(diagonalValues[i]+" ");
        }
        scanner.close();
    }

    public static int[] createArray(int N) 
    {
        int[]array=new int[N]; //takes array "N"
        for(int i = 0; i < N; i++) 
        {
            array[i]=(int)(Math.random()*100);
        }
        return array;  
    }
    public static boolean Prime(int num) //Helper method
    {
        if (num<=1)
        {
            return false;
        }
        for (int i=2;i*i<=num;i++) 
        {
            if(num%i==0) return false;
        }
        return true;
    }

    public static int calculateNumberOfPrimeNumbers(int[] array, int N) 
    {
        int primeCount = 0;
        for (int i = 0; i < N; i++) 
        {
            if (Prime(array[i])) 
            {
                primeCount++;
            }
        }
        return primeCount;
    }

    public static int[][]generateRandomMatrix(int M) 
    {
        int[][]matrix=new int[M][M]; 
        for (int i=0;i<M;i++) 
        {
            for(int j=0;j<M;j++) 
            {
                matrix[i][j]=(int)(Math.random()*100);
            }
        }
        return matrix;
    }

    public static int[]getDiagonalValues(int[][] matrix) 
    {
        int M=matrix.length;
        int[]diagonalValues=new int[M];
        for (int i=0;i<M;i++) 
        {
            diagonalValues[i]=matrix[i][i];
        }
        
        return diagonalValues;
    }
}


