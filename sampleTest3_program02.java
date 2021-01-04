// This code was contributed by https://github.com/voyager2005

import java.util.Scanner; 
public class Program2
{
    public static void main(String args[])
    {
        //declaration
        Scanner sc = new Scanner(System.in); 
        String s, newString; 
        char lastIndex; 
        
        //prompt and accept the string from the user
        System.out.println("Please enter the string") ; 
        s = sc.nextLine().trim(); 
        
        //extracting the character in the last index
        lastIndex = s.charAt(s.length()-1); 
        
        //adding the character to the first and the last positions on the string 
        newString = lastIndex + s + lastIndex ; 
        
        //displaying the new string
        System.out.println("old string: " + s) ; 
        System.out.println("new string: " + newString) ; 
    }
}
