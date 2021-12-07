public class Staticmethod
{
    int l,b,res;
    public static int counter=10;
    public void setLB(int l,int b)
    {
        this.l = l;
        this.b = b;
    }
    public int getLB()
    {

        res=l*b;
        return res;
    }
    public static void display()
    {
        counter=20;
        System.out.println("COUNTER VALUE is changed by a static fun ,now value is  : "+counter);
    }
}
class Output
{
    public static void main(String[] args)
    {
        Staticmethod obj=new Staticmethod();
        obj.setLB(5,7);
        System.out.println(obj.getLB());
       Staticmethod.display();

    }
}

