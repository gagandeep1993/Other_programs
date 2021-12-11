
class Base
{
    int a;
    public void setA(int a)
    {
        this.a = a;
    }
    public int getA()
    {
        return a;
    }
}
class Derived extends Base
{
    int b;
    public void setB(int b)
    {
        this.b = b;
    }
    public int getB()
    {
        return b;

    }
}
public class IheritanceDemo
{
    public static void main(String[] args)
    {
        Derived obj = new Derived();
        obj.setA(110);
       obj.setB(23);
        System.out.println("the value of a is :"+obj.getA());
       System.out.println("the value of b is :"+obj.getB());
    }

}

