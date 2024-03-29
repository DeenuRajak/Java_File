package Lambda;

public class Truck
{
    class Engine 
    {
        void disp()
        {
            System.out.println("Inner class disp");
        }
    }
    public static void main(String [] args)
    {
        System.out.println("Main method outer class");
        // Truck tr = new Truck();

        // Truck.Engine e = tr.new Engine();
        // e.disp();

        Truck.Engine e = new Truck().new Engine();
        e.disp();

        new Truck().new Engine().disp();
    }
}
