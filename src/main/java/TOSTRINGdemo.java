class Student
{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class TOSTRINGdemo
{
    public static void main(String[] args)
    {
        Student s=new Student(1,"gagan");
        System.out.println(s);
    }
}
