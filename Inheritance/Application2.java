package Inheritance;


import java.util.*;

abstract class Shape
{
    float area;

    abstract public void input();
    abstract public void compute();

    public void disp()
    {
        System.out.println("The area is "+ area);
    }
}

class Rectangular1 extends Shape

{
    float length;
    float breadth;

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
}

class Square1 extends Shape
{
    float length;

    public void input()
    {
        System.out.println("Calculation of Square app");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length of square");
        length = scan.nextFloat();
    }

    public void compute()
    {
        area = length*length;
    }
}

class Circle1 extends Shape
{
    float Radius;

    public void input()
    {
        System.out.println("Calculation of circle app");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the radius of square");
        Radius = scan.nextFloat();
    }

    public void compute()
    {
        area = 3.14f*Radius*Radius;
    }
}

class Geometry
{
    public void poly(Shape ref)
    {
        ref.input();
        ref.compute();
        ref.disp();
    }
}
public class Application2 {
    public static void main(String [] args)
    {
        Rectangular1 rec = new  Rectangular1();
        Square1 sq = new Square1();
        Circle1 ci = new Circle1();

        Geometry g = new Geometry();
        g.poly(rec);
        g.poly(sq);
        g.poly(ci);
    }
}
