import java.util.*;
public class multipleex
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    try
    {
        System.out.println("Enter first no");
        int a=sc.nextInt();
        System.out.println("Enter second no");
        int b=sc.nextInt();
        int c=a/b;
        System.out.println("Result");

    }
    catch(ArithmeticException e)
    {
        System.out.println("Divide By zero Error");
    }
    catch(InputMismatchException e)
    {
        System.out.println("Enter the input as No");
    }
}
}