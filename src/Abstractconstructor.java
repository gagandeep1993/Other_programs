abstract class Abstract1
{
    Abstract1()
    {
        System.out.println("constructor calling");
    }
abstract void fun1();
    {

    }
}
class Person extends Abstract1
{

    void  fun1()
    {
        System.out.println("fun calling");
    }

}
class Abstractconstructor
{
    public static void main(String[] args)
    {
        Abstract1 obj = new Person();
        obj.fun1();
    }


}
