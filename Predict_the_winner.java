import java.util.Scanner;
class array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,m,arr[],s=0,r=0;
        n=sc.nextInt();
        arr=new int[100];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(i%2==0)
            {
                s=s+arr[i];
            }
            else
            {
                r=r+arr[i];
            }
        }
        m=Math.abs(s-r);
        if(m%4==0)
        {
            System.out.println("X");
        }
        else
        {
            System.out.println("Y");
        }
    }
}