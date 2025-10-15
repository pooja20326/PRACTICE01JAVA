import java.util.*;
public class pattern3
{
    void fun(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int n=sc.nextInt();
        pattern3 obj=new pattern3();
        obj.fun(n);
        
        
    }
}
