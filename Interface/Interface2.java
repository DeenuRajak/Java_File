package Interface;

interface Computer
{
    void compileCode();
    
}

class Laptop implements Computer
{
    public void compileCode()
    {
        System.out.println("You got 5 errors!!!");
    }
}
class Desktop implements Computer
{   
    public void compileCode()
    {
      System.out.println("You got 5 errors!!!....., Faster");  
    }
    
}

class Developer
{
    public void buildApp(Computer com)
    {
        System.out.println("Building App");
        com.compileCode();
    }
}
public class Interface2 
{
    public static void main(String [] args)
    {  
       Computer com = new Desktop();
       Developer dev = new Developer();
       dev.buildApp(com);
    }
}
