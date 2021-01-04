// This code was contributed by https://github.com/voyager2005

import java.util.Scanner; 
public class Program3
{
    public static void main(String srgs[])
    {
        //declaration 
        Scanner sc = new Scanner(System.in) ; 
        int choice, n; 

        //prompt the user to choose and accept the choice
        System.out.println("(1)NEON NUMBER \n(2)REPUNIT") ; 
        choice = sc.nextInt() ; 

        //shitch case
        switch(choice)
        {
            case 1:
            // prompt and accept the value from the user
            System.out.println("Please enter the number");
            n = sc.nextInt(); 

            //declaration 
            int digit, sum;
            int duplicaten = n ;

            //initialization 
            sum = 0 ;
            int k = 0;  

            //squaring n
            n = (int)Math.pow(n,2); 

            //while loop to calculate the sum of all the digits of n²
            while(n >0)
            {
                digit = n%10 ; 
                sum = sum + digit; 
                n = n/10;
            }

            //checking for the specified condition
            if(sum == duplicaten)
            {
                System.out.println(duplicaten + " is a NEON NUMBER") ; 
            }
            else
            {
                System.out.println(duplicaten + " is not a NEON NUMBER") ; 
            }
            break; 

            case 2:
            // prompt and accept the value from the user
            System.out.println("Please enter the number of terms") ; 
            n = sc.nextInt(); 
            k = 0; 
            for(int i = 0 ; i < n ; i++)
            {
                k = (( k * 10 ) +1); 
                System.out.print(k + "\t"); 
            }

            break; 

            default :
            System.out.println("Invalid Choice");
        }
    }
}
