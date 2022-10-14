import java.util.Scanner;
class array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int arr[]=new int[100];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    c=c+1;
                }
            }
            System.out.print(c+" ");
        }
    }
}