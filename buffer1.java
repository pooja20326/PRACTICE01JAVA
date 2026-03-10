// BufferedReader Wrte to file-----
import java.util.*;
import java.io.*;
public class buffer1
{
    public static void main(String[] args)
    {
        try
        {
            BufferedWriter bw=new BufferedWriter(new FileWriter("data.txt"));
            bw.write("java");
            bw.newLine();
            bw.write("python");
            bw.newLine();
            bw.write("SQl");
            bw.close();
            System.out.println("Data Written Successfully!!!");
        }
        catch(IOException e)
        {
            System.out.println("Error in Writing FIle!! ");
        }
    }
}