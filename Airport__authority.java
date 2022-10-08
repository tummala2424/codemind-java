import java.util.Scanner;
class array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,arr[],t,s=0;
        n=sc.nextInt();
        arr=new int[100];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        t=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]<=t)
            {
                s=s+1;
            }
            else
            {
                s=s+2;
            }
        }
        System.out.print(s);
    }
}