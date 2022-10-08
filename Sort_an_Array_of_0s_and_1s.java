import java.util.Scanner;
class array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[],i,n;
        n=sc.nextInt();
        arr=new int[100];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                System.out.print(0+" ");
            }
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                System.out.print(1+" ");
            }
        }
    }
}