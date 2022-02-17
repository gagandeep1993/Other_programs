abstract class Car
{
    abstract void run();
}
class Jeeta extends Car
{
    void run()
    {
        System.out.println("jeeta runs");
    }
}
class Bmw extends Car
{
    void run()
    {
        System.out.println("Bmw runs");
    }
}
public class AbstractDemo2
{
    public static void main(String[] args)
    {
        Car obj = new Jeeta();
        obj.run();
    }
}

