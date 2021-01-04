// This code was contributed by https://github.com/voyager2005

import java.util.Scanner; 
public class Program6
{
    public static void main(String args[])
    {
        // declaration 
        Scanner sc = new Scanner(System.in); 
        int[] A, B; 
        int n; 
        int beginIndex, endIndex;
        
        // prompt and accept the length of the array
        System.out.println("Please enter the length of the array"); 
        n = sc.nextInt(); 
        
        // initialization 
        beginIndex = 0 ; 
        endIndex = (n-1) ;
        
        // initializing the array A
        A = new int[(n)]; 
        B = new int[(n)]; 
        
        // initializing each of the array elements of array A
        for(int i = 0 ; i < n ; i++) 
        {
            System.out.println("Please enter number " + (i+1)); 
            A[i] = sc.nextInt(); 
        }
        
        // computation 
        for( int i = 0 ; i < n ; i++)
        {
            if( A[i] % 2 == 0)
            {
                B[beginIndex] = A[i];
                beginIndex++; 
            }
            else if( A[i] % 2 != 0)
            {
                B[endIndex] = A[i]; 
                endIndex--; 
            }
        }
        
        // displaying array A
        System.out.println(); 
        System.out.println("This is Array A");
        for( int  i = 0 ; i < n ; i++)
        {
            System.out.println("element " + (i+1) + " : " + A[i]); 
        }
        
        // displaying array B
        System.out.println(); 
        System.out.println("This is Array B");
        for( int  i = 0 ; i < n ; i++)
        {
            System.out.println("element " + (i+1) + " : " + B[i]); 
        }
    }
}
