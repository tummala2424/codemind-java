import java.util.Scanner;
class number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,r=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            r+=a[i];
        }
        System.out.print(r);
        sc.close();
    }
}