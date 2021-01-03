// This code was contributed by https://github.com/voyager2005

import java.util.Scanner; 
public class st4_pg6
{
    public static void main(String args[])
    {
        //declaration 
        Scanner sc = new Scanner(System.in);
        int[] A; 
        int n, limit; 
        int digit, reverse, num, copyNum; 
        int smallest, indexOfSmallest, temp; 
        
        // initialization 
        reverse = 0 ; 
        
        //accepting the length of the array
        System.out.print("Length of the array: ");
        n = sc.nextInt(); 
        
        // initializing array A's length
        A = new int[n]; 
        
        // initializing the array elements
        System.out.println("Please enter the array Elements: ");
        for( int i = 0 ; i < A.length ; i++)
        {
            System.out.print((i+1) + ". "); 
            A[i] = sc.nextInt(); 
        }
        
        // inputing the second number
        System.out.print("Number (limit): ");
        limit = sc.nextInt(); 
        
        //selection sort 
        for(int i = 0 ; i < n-1 ; i++)
        {
            //initialization 
            smallest = A[i] ; 
            indexOfSmallest = i ; 
            
            for(int j = i+1 ; j < n ; j++)
            {
                if(A[j] < smallest)
                {
                    smallest = A[j]; 
                    indexOfSmallest = j ; 
                }
            }
            
            //swpping the array
            temp = A[i];
            A[i] = A[indexOfSmallest];
            A[indexOfSmallest] = temp;
        }
        
        // finding and reversing all the array elements that are under the limit 
        for(int i = 0; i < A.length ; i++)
        {
            if(A[i] < limit)
            {
                num = A[i]; 
                
                while(num > 0)
                {
                    digit = num % 10; 
                    reverse = (reverse * 10) + digit ;
                    num = num / 10 ; 
                }
                
                // replacing the value; 
                A[i] = reverse; 
                
                // re-initialization 
                reverse = 0 ; 
                num = 0 ;
            }
            else 
            {
                break; 
            }
        }
        
        //display statements 
        System.out.println("New Array: ");
        for( int i = 0 ; i < A.length ; i++)
        {
            System.out.println((i+1) + ". " + A[i]); 
        }
    }
}
