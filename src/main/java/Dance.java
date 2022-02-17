import java.util.ArrayList;
import java.util.List;

public interface Dance
{
    void danceperforming();

}
class Salsa implements Dance
{
    @Override
    public void danceperforming()
    {
        System.out.println("Salaaaaa");
    }
}
class Classical implements Dance
{
    @Override
    public void danceperforming()
    {
        System.out.println("Classicallll");
    }
}

class Performer
{
    public static void main(String[] args)
    {
        List<Dance> p = regcounter();//loose coupling
        for (Dance i : p)
        {
            i.danceperforming();
        }
    }

        public static List<Dance> regcounter ()
        {
            List<Dance> p = new ArrayList();
            p.add(new Salsa());
            p.add(new Classical());
            return p;

        }

}
