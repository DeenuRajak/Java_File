 abstract class  AeroPlane3
{
    abstract public void takeOff();
    
    
    abstract public void fly();
   
}

class CargoPlane3 extends AeroPlane3
{
    public void takeOff()
    {
        System.out.println("CargoPlane requires longer runway");
    }
    public void fly()
    {
        System.out.println("CargoPlane flies at lower height");
    }

}

class PassengerPlane3 extends AeroPlane3
{ 
   public void takeOff()
   {
    System.out.println("PassengerPlane requires medium size runway");
   }
   public void fly()
   {
    System.out.println("PassengerPlane flies at medium height");
   }
}
public class Abstraction {
    public static void main(String [] args)
    {
        AeroPlane3 ref1 = new CargoPlane3();
        ref1.takeOff();
        ref1.fly();


        AeroPlane3 ref2 = new PassengerPlane3();
        ref1.takeOff();
        ref2.fly();

        // AeroPlane3 a = new AeroPlane3();                                  we can't creat object of Abstract class 
    }
}
