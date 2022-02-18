
@Data
public class LomBOKdemo
{
    int id;
    String name;
    boolean status;

    /*public LomBOKdemo(int id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "LomBOKdemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }*/
}
class MainLOMBOK
{
    public static void main(String[] args)
    {
        LomBOKdemo obj=new LomBOKdemo(1,"gagan",true);
        System.out.println(obj);

    }
}
