package Polymorphism;


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
public class Polymorphism1 
{
    public static void main(String [] args)
    {
       CargoPlane cp = new CargoPlane();
                                

       PassengerPlane pp = new PassengerPlane();
       
       Aeroplane ref;

       ref= cp;

       ref.takeOff();
       
       ref.fly();


       System.out.println("=======================================================");

       ref= pp;
       ref.takeOff();
       ref.fly();
       
    }
}