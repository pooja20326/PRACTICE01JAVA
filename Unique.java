import java.util.*;
class Unique
{
    public static void main(String[] args)
    {
int[] arr1=new int[5];
int[] arr2=new int[5];
int[] arr3=new int[5];
int count=0;
Scanner in=new Scanner(System.in);
System.out.println("enter the elemnent of arr1");
for(int i=0;i<5;i++)
{
arr1[i]= in.nextInt();
} 
System.out.println("enter the elemnent of arr2");
for(int i=0;i<5;i++)
{
arr2[i]= in.nextInt();
} 
System.out.println("Intersecting two element");
for(int i=0;i<arr1.length;i++)
{
    for(int j=0;j<arr2.length;j++)
    {
        if(arr1[i]==arr2[j])
        {
            arr3[i]=arr2[j];
            count++;
        }
    }
}
for(int i=0;i<count;i++)
{
System.out.println(arr3[i]);
} 
 
    }
}