import java.util.Scanner;
class d
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,a[];
        float k=0;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            k=k+a[i];
        }
        System.out.format("%.2f",k/n);
    }
}