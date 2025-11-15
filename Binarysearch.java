import java.util.*;
public class Binarysearch {

    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("Enter the element of the array with size of 10 ");
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=c.nextInt();
        }
        System.out.println("enter the element to find in the arry");
        int x=c.nextInt();
        int low=0;
        int high=arr.length-1;
        boolean found=false;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==x)
            {
               found=true;
               break;
            }
            else if(arr[mid]<x)
            {
                low=mid+1;
            }
            else
            {
                high=mid -1;
            }
        }
        System.out.println(found ? "Found" : "Not Found" );
    }
}