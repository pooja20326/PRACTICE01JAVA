public class demo
{
    public static void main(String[]args)
    {
        int[] la=new int[3];
        System.out.println("Array before insertion");
        for(int i=0;i<3;i++)
        {
            System.out.println("la["+i+"]="+la[i]);
        }
        System.out.println("inserting element");
        system.out.println("Array after insertion");
        for(int i=0;i<3;i++)
        {
            la[i]=i+3;
            System.out.println("la["+i+"]="+la[i]);
        }
    }
}