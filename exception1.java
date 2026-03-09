import java.util.*;
public class exception1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Enter the firt no: ");
            int a=sc.nextInt();
            System.out.println("Enter second no: ");
            int b=sc.nextInt();
            int c=a/b;
            System.out.println("Result :"+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by zero error");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please enter input as an Number!!");
        }
        finally
        {
            System.out.println("Execution completed");
        }
    }
}