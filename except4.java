import java.util.*;
import java.io.*;
public class except4
{
    public static void readfile() throws IOException
    {
        FileReader file=new FileReader("abc.txt");
        System.out.println("File Opened");
    }
    public static void main(String[] args)
    {
       try
       {
          readfile();
       }
       catch(IOException e)
       {
         System.out.println("File not found!!");
       }
    }
}