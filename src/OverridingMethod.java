class Animal
{
    public void speak()
    {
        System.out.println("Animal speak");
    }
}
class Cat extends Animal
{
    @Override
    public void speak()
    {
     super.speak();
        System.out.println("Cat.speak");
    }
}
public class OverridingMethod
{
    public static void main(String[] args)
    {
        Animal obj=new Cat();
        obj.speak();

    }
}