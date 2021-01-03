// This code was contributed by https://github.com/voyager2005

import java.util.Scanner; 
public class st4_pg5
{
    public static void main(String args[])
    {
        //declaration 
        Scanner sc = new Scanner(System.in); 
        String itemType; 
        char itemCode; 
        double buy; 
        double discount; 
        double netAmount;
        
        // prompt and accept the value from the user
        System.out.print("Purchase Amount: ");
        buy = sc.nextDouble(); 
        System.out.println("\nItem Code: ");
        itemCode = sc.next().charAt(0);
        
        //initialization 
        itemCode = Character.toUpperCase(itemCode); 
        discount = 0.0; 
        itemType = null; 
        
        //calculating the discount
        if(buy >= 0 && buy <= 1000)
        {
            if(itemCode == 'M')
                discount = 0.0; 
            else if( itemCode == 'H')
                discount = buy * (5.0/100.0); 
        }
        else if( buy > 1000 && buy <= 2000)
        {
            if(itemCode == 'M')
                discount = buy * (5.0/100.0); 
            else if( itemCode == 'H')
                discount = buy * (7.5/100.0); 
        }
        else if( buy > 2000 && buy <= 3000)
        {
            if(itemCode == 'M')
                discount = buy * (7.5/100.0); 
            else if( itemCode == 'H')
                discount = buy * (10.0/100.0); 
        }
        else if( buy > 3000)
        {
            if(itemCode == 'M')
                discount = buy * (10.0/100.0); 
            else if( itemCode == 'H')
                discount = buy * (15.0/100.0); 
        }
        
        //finding netAmount 
        netAmount = buy - discount; 
        
        // finding the itemType
        if(itemCode == 'M')
            itemType = "Mill Cloth"; 
        else 
            itemType = "Handloom";
        
        // display statement
        System.out.println("\n\n" + "Purchase Amount" + buy); 
        System.out.println("Item Type: " + itemType); 
        System.out.println("Discount: " + discount); 
        System.out.println("Net Amount: " + netAmount);
    }
}
