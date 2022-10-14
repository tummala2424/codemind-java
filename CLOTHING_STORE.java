import java.util.Scanner;
class array
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int a[],i,j,p=0,n,c=0;
    n=sc.nextInt();
    a=new int[100];
    for(i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        if(a[i]!=-1)
      {
        c=1;
        for(j=0;j<n;j++)
        {
            if(a[i]==a[j]&&i!=j)
            {
                c++;
                a[j]=-1;
            }
        }
            p=p+c/2;
            }
        }
         System.out.println(p);
    }
}