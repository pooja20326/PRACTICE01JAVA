import java.util.*;
public class linear_search
{
    public static void main(String[] args) 
    {
        Scanner sc =new scanner(System.in);
        System.out.println("Enter the key");
        int n=sc.nextInt(system.in);
        int[] arr=new arr[5];
        System.out.println("Enter the array element");
        for(int  i=0;i<arr.length-1;i++)
        {
           arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==n)
            {
                system.out.println("The value is presented in :" + i + "index of the array");
            }
            else
            {
                System.out.println(" the element not found");
            }
        }
    }
}