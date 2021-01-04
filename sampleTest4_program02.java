// This code was contributed by https;//github.com/voyager2005

import java.util.Scanner; 
public class WordOp
{
    //declaration of instance variables
    String str = new String(); 
    char max; 
    char min; 

    WordOp()
    {
        str = " "; 
        max = 'A'; 
        min = 'Z'; 
    }

    void input(Scanner sc)
    {
        //prompt and accept the word from the user
        System.out.println("Please enter a word: ");
        str = sc.nextLine().trim().toUpperCase(); 
    }

    void calcMaxMin()
    {
        for( int i = 0 ; i < str.length() ; i++)
        {
            char ch = str.charAt(i); 
            int value = Character.valueOf(ch) ;

            if( value > Character.valueOf(max))
            {
                max = (char) value; 
                continue; 
            }
            if( value < Character.valueOf(min))
            {
                min = (char) value; 
                continue; 
            }
        }
    }

    void display()
    {
        System.out.println("Highest Character: " + max);
        System.out.println(" Lowest Character: " + min);
    }

    public static void main(String args[])
    {
        //declaration 
        Scanner sc = new Scanner(System.in); 
        WordOp obj = new WordOp(); 

        obj.input(sc); 
        obj.calcMaxMin(); 
        obj.display(); 
    }
}
