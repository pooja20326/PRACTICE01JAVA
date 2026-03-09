import java.util.*;
public class agevalidationwithtrycatch
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    try
    {
      System.out.println("Enter the AGE: ");
      int a=sc.nextInt();
      if(a<18)
      {
        throw new ArithmeticException("Age must be greater than 18");
      }
      System.out.println("You can vote");
    }
    catch(ArithmeticException e)
    {
        System.out.println(e.getMessage());
    }
    finally
    {
        System.out.println("programe Executed!!");
    }
}
}