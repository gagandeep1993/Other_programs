public class Rectangle
{
    int l,b,res;
 public static int count=0;
    public void setLB(int l,int b)
    {
        this.l = l;
        this.b = b;
        count++;

    }
    public int getLB()
    {
        res=l*b;
        return res;

    }

}
class Out
{
    public static void main(String[] args)
    {
        Rectangle obj=new Rectangle();
        obj.setLB(2,4);


        System.out.println(obj.getLB());
        System.out.println(Rectangle.count+"   times  calls");
    }
}
