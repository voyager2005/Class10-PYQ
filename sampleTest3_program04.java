// This code was contributed by https://github.com/voyager2005

import java.util.Scanner; 
public class Program4
{
    public static void main(String srgs[])
    {
        //declaration 
        Scanner sc = new Scanner(System.in);
        int p, q; 
        int digit, reverse, n ; 
        
        //initialization
        reverse = 0  ;

        // prompt and accept the value from the user
        System.out.println("Please enter the Lower limit "); 
        p = sc.nextInt(); 
        System.out.println("Please enter the Upper Limit ");
        q = sc.nextInt(); 
        
        for( int i = p ; i < q ; i++)
        {
            n = i ; 
            
            while(n > 0)
            {
                digit = n % 10 ; 
                reverse = reverse * 10; 
                reverse = reverse + digit; 
                n = n / 10; 
            }
            
            //display statement
            System.out.println(i + "\t" + reverse); 
            
            //re initialization 
            digit = 0 ; reverse = 0 ;
        }
    }
}
