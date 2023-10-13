package arrays;

public class RevSort {

    static int[] arr = new int[]{22,2,12,52,32,62,42};

    public static void main(String[] args)
    {
        int temp=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

}
