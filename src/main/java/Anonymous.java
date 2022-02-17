class Abc
{
    public void showing()
    {
        System.out.println("A is best");
    }
}
class Bcd extends Abc
{

    public void showing()
    {
        System.out.println("b is best");
    }
}
public class Anonymous
{
    public static void main(String[] args)
    {
        Abc obj=new Bcd();
        obj.showing();
    }
}
