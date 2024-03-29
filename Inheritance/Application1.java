package Inheritance;

import java.util.*;
class Rectangular
{
    float length;
    float breadth;
    float area;

  
    public void input()
    {
       
        System.out.println("Calculation of rectangle app :");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length of rectangle");
        length = scan.nextFloat();
        System.out.println("Please enter breadth of rectangle");
        breadth = scan.nextFloat();

    }

    public void compute()
    {
        area = length*breadth;
    }

    public void disp()
    {
        System.out.println("The area of Rectangle is : "+ area);    
    }
}

class Square
{
    float length;
    
    float area;

    public void input()
    {
       
        System.out.println("Calculation of Square app :");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length of rectangle");
        length = scan.nextFloat();
        
    }

    public void compute()
    {
        area = length*length;
    }

    public void disp()
    {
        System.out.println("The area of Square is : "+ area);    
    }
}

class Circle
{
    float radius;
    
    float area;

    public void input()
    {
       
        System.out.println("Calculation of Circle app :");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Radius of rectangle");
        radius = scan.nextFloat();
        
    }

    public void compute()
    {
        area =  3.14f * radius* radius;
    }

    public void disp()
    {
        System.out.println("The area of Circle is : "+ area);    
    }
}
public class Application1 {
    public static void main(String [] args)
    {
        Rectangular rec = new Rectangular();
        rec.input();
        rec.compute();
        rec.disp();

        Square sq = new Square();
        sq.input();
        sq.compute();
        sq.disp();

        Circle ci = new Circle();
        ci.input();
        ci.compute();
        ci.disp();

      
    }

    
}
