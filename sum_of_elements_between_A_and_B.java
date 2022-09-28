import java.util.Scanner;
class number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[],n,a,b,i,j,sum=0,c=0;
        n=sc.nextInt();
        arr=new int[1000];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]>=a && arr[i]<=b)
            {
                c++;
                sum=sum+arr[i];
            }
        }
        if(c==0)
        {
            System.out.println("-1");
        }
        System.out.print(sum);
    }
}