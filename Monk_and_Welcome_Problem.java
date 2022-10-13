import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,a[],b[],c[];
        n=sc.nextInt();
        a=new int[100];
        b=new int[100];
        c=new int[100];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c[i]=a[i]+b[i];
        }
        for(i=0;i<n;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
}