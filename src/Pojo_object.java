public class Pojo_object
{
    public static void main(String[] args)
    {
        PojoDemo p = new PojoDemo();

        p.setId(678);
        p.setAge(32);
        p.setHeight(6);
        p.setName("gagan");


        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.getHeight());
        System.out.println(p.getId());


    }
}
