// This code was contributed by https://github.com/voyager2005

public class pattern
{
    pattern(char ch, int n)
    {
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= i ; j++)
            {
                System.out.print(ch); 
            }
            
            System.out.println() ; 
        }
    }

    pattern(double x, double n)
    {
        double sum = 0 ; 
        
        while(n > 0)
        {
            sum = x/n; 
            n--; 
        }
        
        //displaying the sum of the series
        System.out.println("Sum of the series: " + sum) ; 
    } 
}
