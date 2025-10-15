public class sumofarray
{
    public static void main(String[] args)
    {
        int[] a=new int[5];
        int sum=0;
        for(int i=0;i<5;i++)
        {
        a[i]=i+2;
        }
        System.out.println("The array elements  are;");
        for(int i=0;i<5;i++)
        {
            System.out.println("a["+i+"]="+a[i]);
        }
        for(int i=0;i<5;i++)
        {
            sum+=a[i];
        }
         System.out.println("the sum of arrays are"+sum);
    }
}