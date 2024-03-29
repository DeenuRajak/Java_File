package Static;
import java.util.*;


class Farmer
{
  int pa;
  float td;
  float ri;
  float si;

  void input()
  {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.println("Please mention the amount which is you required ");
      pa = scan.nextInt();
      System.out.println("Please mention the time how much do you want for return the money ");
      td = scan.nextFloat();
    }
    ri = 5.6f;



  }

  void comput()
  {
    si = (pa*td*ri)/100;
  }

  void disp()
  {
    System.out.println("Simple Intrest "+ si);
  }
  
}

public class StaticProject2
{
    public static void main(String [] args)
    {
        Farmer f1 = new Farmer();
        f1.input();
        f1.comput();
        f1.disp();


        Farmer f2= new Farmer();
        f2.input();
        f2.comput();
        f2.disp();


    }
}