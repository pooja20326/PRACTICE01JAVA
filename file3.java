//-------practice read and wirting file simply---------
import java.util.*;
import java.io.*;
public class file3 
{
public static void main(String[] args)
{
    try
    {
        FileWriter fw=new FileWriter("demo.txt");
        fw.write("This is a simple program for writing file");
        System.out.println("File created successfully!!");
        fw.close();
        FileReader fr =new FileReader("demo.txt");
        int i;
        while((i=fr.read())!=-1)
        {
            System.out.print((char)i);
        }
        fr.close();
    }
    catch(IOException e)
    {
        System.out.println("Error Occured!!");
    }
}
    
}