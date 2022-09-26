import java.util.Scanner;
class d
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],c=1,k=0,b,i;
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1])
            {
                c+=1;
            }
        }
        if(c==n)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}