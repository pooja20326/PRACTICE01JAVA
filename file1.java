//----------------File writer to a file---------------------
import java.io.*;
import java.util.*;
public class file1
{
    public static void main(String[] args)
    {
        try
    {
        FileWriter fw=new FileWriter("test.txt");
        fw.write("Hello java file handling!!");
        fw.close();
        System.out.println("Data Written Successfullly");
    }
    catch(IOException e)
    {
        System.out.println("Error Occured!!");
    }
    }
}