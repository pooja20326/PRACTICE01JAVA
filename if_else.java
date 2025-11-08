import java.util.*;
public class if_else
{    static void odd_even(int a)
    {
        if(a%2==0)
        {
            System.out.println("THe given no is even");
        }
        else
        {
            System.out.println("the given no is odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no to find odd or even");
        int r=sc.nextInt();
        odd_even(r);        
    }
}