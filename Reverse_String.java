import java.util.*;
public class Reverse_String
{
    public static void main(String[] args)
    {
        Scannersc=new Scanner(System.in);
        System.out.println("Enter the String");
        String S =sc.nextLine();
        String R="";
        For( int i=S.length()-1;i>=0;i--)
        {
             R=R+S[i];
        }

        
    }
}