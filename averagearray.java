import java.util.*;
public class averagearray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[10];
        int sum=0;
        double avrg=0.0;
        System.out.println("Enter the element ofan array");
        int n=sc.nextInt();//Entering the no of element present in an array should not more than 10 elements
        System.out.println("Enter the element of an array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();//entering the element
        }
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        System.out.println("sum of array is"+sum);
        avrg=sum/n;
        System.out.println("the average of array is"+avrg);

    }
}