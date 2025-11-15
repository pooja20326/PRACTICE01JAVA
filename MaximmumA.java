import java.util.*;
public class MaximmumA
{
    public static void main(String[] args) 
    {
        int[] arr=new int[6];
        int max=arr[0];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element of an array");
        for (int i=0;i<arr.length-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("finding the maximum in array");
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println("the maximum element is  "+ max);
    }
}