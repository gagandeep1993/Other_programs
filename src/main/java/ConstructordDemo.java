public class ConstructordDemo
{
    int id,id2;
    String name;

    ConstructordDemo()
    {
        id=0;
        name=null;
        System.out.println(id+"   " +name+"       default constructor output");

    }


   ConstructordDemo(int id, String name)
    {
      this.id=id;
      this.name=name;
        System.out.println(id+"   " +name+"       parameterized constructor output");
   }
    ConstructordDemo(int id, String name,int id2)     //..............constructor overloadinga
    {
        this.id=id;
        this.name=name;
        this.id2=id2;
        System.out.println(id+"   " +name+"  "+id2+"       parameterized constructor output");
    }

    void show()
    {
        System.out.println(id+"   " +name);
    }

}
