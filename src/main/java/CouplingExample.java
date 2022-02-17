// parent or base class
class A
{

    //public A()
    //{

        //System.out.println("constructor called");
   // }

    void foo()
    {
        System.out.println("Inside the foo method of A class.");
    }
}

// child or derived class
class B extends A
{
    public B()
    {
        System.out.println("B constructor called");
    }
// void foo()
  //  {
       // System.out.println("Inside the foo method of B class");
   // }
}

public class CouplingExample {
    // main method
    public static void main(String[] argvs)
    {

// eating an object of class B
        B obj = new B();//..................TIGHT CouPLING..............
        obj.foo();
    }
}
