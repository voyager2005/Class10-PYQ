// This program was contributed by https://github.com/voyager2005

import java.util.Scanner; 
public class Employee
{
    /**
     * Program 01
     */
    
    long pan; 
    String name; 
    double taxincome; 
    double tax; 
    
    Employee()
    {
        //default values
        pan = 0000000000; 
        name = null ; 
        taxincome = 0.0 ; 
        tax = 0.0 ; 
    }
    
    void input(Scanner sc)
    {
        //accepting the pan number
        System.out.println("Please enter your pan number");
        this.pan = sc.nextLong() ; 
        
        //flusing the enter key
        sc.nextLine() ; 
        
        //accepting the name
        System.out.println("Please enter your name");
        this.name = sc.nextLine().trim() ; 
        
        //accepting the amount (taxable income)
        System.out.println("Please enter your taxable income");
        this.taxincome = sc.nextDouble() ; 
    }
    
    void calc()
    {
        //calculating the tax based in the users tax income and the brackets specified
        if(taxincome <= 100000)
        {
            tax = 0.0 ; 
        }
        else if(taxincome > 100000 && taxincome <= 150000) 
        {
            tax = (taxincome-100000)*(10.0/100.0); 
        }
        else if(taxincome > 150000 && taxincome < 250000)
        {
            tax = 5000 + ((taxincome-150000)*(20.0/100.0));
        }
        else
        {
            tax = 25000 + ((taxincome-250000)*(30.0/100.0)); 
        }
    }
    
    void display() 
    {
        //displaying all the details of the user 
        System.out.println("Pan Number  Name    Taxable Income  Tax"); 
        System.out.println(pan+ "\t" + name + "   " + taxincome + "\t" + tax); 
    }
    
    public static void main(String srgs[])
    {
        //declaration A
        Scanner sc = new Scanner(System.in) ; 
        Employee obj = new Employee() ; 
        
        obj.input(sc) ; 
        obj.calc() ; 
        obj.display() ;
    }
}
