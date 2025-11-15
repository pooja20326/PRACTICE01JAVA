public class SumosArray {
    public static void main(String[] args) {
        int[] arr={3,4,67,77,88};
        int sum=0;
        for(int i=0;i<=arr.length-1;i++)
        {
            sum+=arr[i];
        }
        System.out.println("The sum of array is : "+ sum);
    }
}
