// This code was contributed by https://github.com/voyager2005

import java.util.Scanner; 
public class st4_pg4
{
    public static void main(String args[])
    {
        //declaration 
        Scanner sc = new Scanner(System.in); 
        int time, year, copyYear;  
        double P; 
        
        //initialization 
        copyYear = 2000; 
        
        //prompt and accept the year from the user
        System.out.println("Please enter the duration until which the estimates are required: ");
        year = sc.nextInt(); 
        
        //calculating the time
        time = year - 2000; 
        
        // calculating the estimates: 
        System.out.println("Year" + "\t" + "Production"); 
        for( int i = 0 ; i <= time ; i++)
        {
            P = 0.0 ; 
            if( 0 <= i && i <=3)
            {
                P = 5 + (3*i); 
            }
            else if( i > 3)
            {
                P = 14 + Math.pow(( i - (5.0/2.0)),2);
            }
            
            //display statement
            System.out.println(copyYear  + "\t" + P);
            copyYear++; 
        }
    }
}
