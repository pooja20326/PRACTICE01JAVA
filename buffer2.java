//----Buffered Reader -----
import java.util.*;
import java.io.*;
public class buffer2
{
    public static void main(String[] args)
    {
        try
        {
            BufferedReader br=new BufferedReader(new FileReader("data.txt"));
            String line;
            while((line=br.readLine())!=null)
            {
                System.out.println(line);
            }
            br.close();
        }
        catch(IOException e)
        {
            System.out.println("Error reading file!!!!");
        }
    }
}