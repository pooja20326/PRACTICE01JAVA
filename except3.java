import java.util.*;
public class except3
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    try
    {
        System.out.println("Enter the Age");
        int age=sc.nextInt();
        if(age<18)
        {
            throw new ArithmeticException("Age must be 18+");
        }
        else
        {
            System.out.println("Eigible for vote");

        }
 
}
 catch(ArithmeticException e)   
 {
    System.out.println(e.getMessage());
 }
}
}