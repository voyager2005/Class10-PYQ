// This code was contributed by https://github.com/voyager2005

import java.util.Scanner; 
public class st4_pg1
{
    public static void main(String args[])
    {
        // declaration 
        Scanner sc = new Scanner(System.in); 
        int number, digit, reverse, n;
        int counter; 
        boolean numberOne, numberTwo; 
        boolean flag; 

        // initialization 
        reverse = 0; 
        counter = 1; 
        flag = false; 
        numberOne = false; 
        numberTwo = false; 

        // prompt and accept the value from the user
        System.out.println("Enter Number: ");
        number = sc.nextInt(); 

        // initializing copy number
        n = number; 

        // reversing the number
        while( n > 0)
        {
            digit = n % 10; 
            reverse = reverse*10 + digit; 
            n = n / 10; 
        }

        // initializing n 
        n = number; 

        for( int k = 1 ; k <= 2 ; k++)
        {
            for( int i = 2 ; i < n ; i++)
            {
                if( n % i == 0)
                {
                    flag = true; 
                }
            }

            if(counter == 1 && flag == false)
            {
                numberOne = true; 
                counter++; 
                flag = false;
                n = reverse; 
            }
            else if( counter == 2 && flag == false)
            {
                numberTwo = true; 
            }
            else
            {
                System.out.println(number + " is not an Emirp number");
                break; 
            }
        }

        if( numberOne == true && numberTwo == true)
        {
            System.out.println(number + " is an Emirp number");
        }
    }
}
