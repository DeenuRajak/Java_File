package Polymorphism;


class Aeroplane2
{
    public void takeOff2()
    {
        System.out.println("Aeroplane is taking off");

    }
    public void fly2()
    {
        System.out.println("Aeroplane is flying ");
    }
}

class CargoPlane2 extends Aeroplane2
{
    public void takeOff2()
    {
        System.out.println("CargoPlane requires longer runway");

    }
    public void fly2()
    {
        System.out.println("CargoPlane flies at lower height");
    }
}

class PassengerPlane2 extends Aeroplane2
{
    public void takeOff2()
    {
        System.out.println("PassengerPlane requires medium size runway");

    }
    public void fly2()
    {
        System.out.println("PassengerPlane flies at medium height ");
    }
}

class FighterPlane2 extends Aeroplane2
{
    public void takeOff2()
    {
        System.out.println("Fighter Plane requires small size runway ");
    }
    public void fly2()
    {
        System.out.println("Fighter Plane flies at high height ");
    }
}

class Airport
{
    public void Poly(Aeroplane2 ref)
    {
        ref.takeOff2();
        ref.fly2();
        
        System.out.println("==============================================================================");
    }
}
public class Polymorphism2 {
    public static void main(String []args )
    {
        CargoPlane2 cp = new CargoPlane2();

        PassengerPlane2 pp = new PassengerPlane2();

        FighterPlane2 fp = new FighterPlane2();
         

        Airport a = new Airport();
        a.Poly(cp);

        a.Poly(pp);
        a.Poly(fp);
        // cp.takeOff2();
        // cp.fly2();

        // pp.takeOff2();
        // pp.fly2();

        // fp.takeOff2();
        // fp.fly2();
    }
}
