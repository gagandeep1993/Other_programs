package interface_demo;

interface Demo1
{
    void fun1();
}
class Demo2 implements Demo1
{
           public void fun1()
        {
            System.out.println("implements function behaviour here, whose body header is declared in interface part");
        }
}
public class InterfaceDemo1
{
    public static void main(String[] args)
    {
        Demo2 obj=new Demo2();
        obj.fun1();

    }
}
