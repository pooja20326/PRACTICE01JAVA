import java.util.*;
public class pattern4
{
    void the(int n)
    {
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
           
        }
        
    }
    public static void main(String[] args) {
        pattern4 obj=new pattern4();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");    
        int n=sc.nextInt();
        obj.the(n);
    }
}