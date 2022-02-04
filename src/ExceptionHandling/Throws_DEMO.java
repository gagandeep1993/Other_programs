package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws_DEMO
{
    void readfile() throws FileNotFoundException
    {
        FileInputStream fi=new FileInputStream("Desktop/hello.pages");
    }
}
class test
{
    public static void main(String[] args)
    {
        Throws_DEMO obj=new Throws_DEMO();
        try{
            obj.readfile();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
    }
}
