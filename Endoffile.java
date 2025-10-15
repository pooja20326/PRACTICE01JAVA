import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Endoffile {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int linenum=1;
        while(sc.hasNextLine())
        {
            String line=sc.nextLine();
            System.out.println(linenum+" "+ line);
            linenum++;
        }
        sc.close();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}