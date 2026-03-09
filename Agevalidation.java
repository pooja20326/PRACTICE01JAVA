import java.util.*;
public class Agevalidation
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the AGE: ");
    int age=sc.nextInt();
    if(age<18)
    {
        throw new ArithmeticException("You are not Eligible");
    }
    else
    {
        System.out.println("You can Vote");
    }
}
}