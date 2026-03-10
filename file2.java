//----------------File reader -----------------------
import java.io.*;
import java.util.*;
public class file2
{
    public static void main(String[] args)
    {
        try
        {
            FileReader fr=new FileReader("test.txt");
            int i;
            while((i=fr.read())!=-1)
            {
                System.out.print((char)i);
            }
            fr.close();
        }
        catch(IOException e)
        {
            System.out.println("Error Occured");
        }
    }
}