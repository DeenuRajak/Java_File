package DependencyInjection;


class Car
{
    private Engine eng;

    public Car(Engine eng)
    {
        this.eng= eng;
    }
    public void start()
    {
        eng.engineStart();
    }

}

class Engine 
{
    public void engineStart()
    {
        System.out.println("Car started");
    }
}
public class HasA2 {
    public static void main(String [] args)
    {
        Engine e = new Engine();
        Car c= new Car(e);
        c.start();
    }
}
