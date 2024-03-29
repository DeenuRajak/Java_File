package Inheritance;

class Animali
{
    public void eat()
    {
        System.out.println("Animal eats everyday ");
    }
    public void age(int x)
    {
        System.out.println("Animal age is ");
        
    }
}

class Tigers extends Animali
{
    public void eat() // Cannot  reduce the visibility of intherited method from Animali and also cannot change the return type of inherited method from Animali 
    {
        System.out.println("Tiger hunts and eat");
    }

    public void age()     // give the same parameter to the inherited method
    {

    }
}
public class Inheritance3 {
    public static void main(String [] args)
    {
        Tigers tg = new Tigers();
        tg.eat();
        tg.age();
    }
}
