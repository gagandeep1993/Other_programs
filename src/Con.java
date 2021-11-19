public class Con
{
    int l,b,w;
    Con()
    {
        l=0;
        b=0;
        w=0;

        System.out.println(b+"      " +l+"     "+w+"  "+"default constructor output");

    }
    Con(int l,int b)

    {
        this.l=l;
        this.b=b;
        System.out.println(l+"    " +b+"     parameterized constructor output");
    }
    Con(int l, int b,int w)     //..............constructor overloadinga
    {
        this(l,b);
        this.w=w;

        System.out.println(l+"    " +b+"     "+w+"        constructor  with 3 parameters ");
    }




    void show()

    {
        System.out.println(l+"      " +b+"           Regular method");
    }
void display()
{
    show();
}
}
