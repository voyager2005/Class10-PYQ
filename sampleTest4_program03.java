// This code was contributed by https://github.com/voyager2005

import java.util.Scanner; 
public class st4_pg3
{
    double volume = 0.0; 

    double volume( double r )
    {
        // computation 
        volume = (4.0/3.0) * Math.PI * Math.pow(r,3);
        
        // display statement 
        System.out.println("Volume of Sphere: " + volume );
        
        return volume; 
    }

    double volume( double r , double h)
    {
        // computation 
        volume = (1.0/3.0) * Math.PI * Math.pow(r,2) * h ; 
        
        // display statements 
        System.out.println("Volume of Cone: " + volume );
        
        return volume; 
    }

    double volume( double l, double b, double h)
    {
        // computation 
        volume = l * b * h; 
        
        // display statement
        System.out.println("Volume of Cuboid: " + volume );
        
        return volume; 
    }

    public static void main(String args[])
    {
        // declaration 
        Scanner sc = new Scanner(System.in); 
        st4_pg3 obj = new st4_pg3(); 

        //accpeting the radius from the user
        System.out.println("Please enter the raidus of the circle");
        double radius = sc.nextDouble(); 

        //calling the overloaded method volume, passing radius in the parameters
        obj.volume(radius);

        // accpeting the radius and height of the cone from the user
        System.out.println("Please enter the radius and the heigth of the cone: ");
        double radiusCone = sc.nextDouble(); 
        double heightCone = sc.nextDouble(); 
        
        //calling the overloaded constructor, passing radius and height of the cone 
        obj.volume(radiusCone, heightCone); 

        // accepting the length, bredth and height from the user
        System.out.println("Please enter the length, bredth and the height: ");
        double lengthCuboid = sc.nextDouble(); 
        double bredthCuboid = sc.nextDouble(); 
        double heightCuboid = sc.nextDouble(); 

        // calling the overloaded constructor volume, passing the length, bredth and the height
        obj.volume(lengthCuboid, bredthCuboid, heightCuboid);
    }
}
