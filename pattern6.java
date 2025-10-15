import java.util.*;
public class pattern6
{
    void the1(int n)
    {
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
           
        }
        
    }
    public static void main(String[] args) {
        pattern6 obj=new pattern6();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");    
        int n=sc.nextInt();
        obj.the1(n);
    }
}