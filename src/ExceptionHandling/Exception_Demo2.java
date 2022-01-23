package ExceptionHandling;

public class Exception_Demo2
{
    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread());

      int a[]=new int[10];

      for(int i=1;i<=5;i++)
      {
          System.out.println(i);

          try {
              Thread.sleep(500);
          }
          catch (InterruptedException e)
          {
              System.out.println("sorry for in connivence");
          }
      }
    }
}
