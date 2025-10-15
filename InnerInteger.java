import java.util.*;
public class InnerInteger 
{
    public static void main(String[] args)
    {
        int[] arr =new int[7];
        int k,c=0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the key element");
        k=in.nextInt();
        System.out.println("Enter the element of an array");
        for(int i=0;i<7;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int j=0;j<7;j++)
        {
            if(arr[j]==k)
            {
                c=j;
            }
            else
            {
                c=-1;
                
            }
           
        }
        System.out.println("the element not found");
        
        for(int a=0;a<=c;a++)
        {
            System.out.println(arr[a]);
        }
    }
}