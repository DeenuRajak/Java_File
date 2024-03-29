package Inheritance;

class Aeroplane
{
   public void takeOff()
   {
    System.out.println("Aeroplane is taking off");
   }
   public void fly()
   {
    System.out.println("Aeroplane is flying");
   }
}

class CargoPlane  extends Aeroplane 
{
   public void fly()
   {
    System.out.println("Cargoplane is fly at lower height");
   }
   public void CarryGoods()
   {
    System.out.println("Cargoplane carries goods");
   }
}

class PassengerPlane extends Aeroplane
{
   public void fly()
   {
    System.out.println("Passenger Plane flies at medium height");
   }

   public void carryPassenger()
   {
    System.out.println("Passenger plane carries passenger");
   }
}
public class InhOveSpe {                           //Inherited,Overidding,Specialized method
    public static void main(String [] args)
    {
       CargoPlane cp = new CargoPlane();
       cp.takeOff();   //inherited 
       cp.CarryGoods(); // specialized
       cp.fly();         //overidden

       PassengerPlane pp = new PassengerPlane();
       pp.takeOff();    //Inherited
       pp.carryPassenger();//overidden
       pp.fly();          //specialized
    }
}
