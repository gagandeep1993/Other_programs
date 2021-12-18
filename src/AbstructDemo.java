abstract class Bike
{
 Bike()
    {
        System.out.println("constructor of bike class");
    }
    abstract void run();
}
class Honda extends Bike
{
    void run()
    {
        System.out.println("Honda run");
    }
}
public class AbstructDemo
{
    public static void main(String[] args)
    {
        Bike obj = new Honda();
        obj.run();
    }
}
