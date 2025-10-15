public class reversearray
{
    public static void main(String[] args)
    {
int arr[]={1,2,3,4,5};
int n=arr.length;
System.out.println("The original array");
for(int i=0;i<n;i++)
{
    System.out.println(arr[i]+"  ");
}
//reversing the array
for(int i=0;i<n/2;i++)
{
    int temp=arr[i];
    arr[i]=arr[n-1-i];
    arr[n-1-i]=temp;
}
System.out.println("the reversed array");
for(int i=0;i<n;i++)
{
    System.out.println(arr[i]+"  ");
}
    }
}